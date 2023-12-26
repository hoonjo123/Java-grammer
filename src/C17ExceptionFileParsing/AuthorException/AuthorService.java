package C17ExceptionFileParsing.AuthorException;

import java.util.Optional;

public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public void registerAuthor(String name, String email, String password) {
        if (password.length() < 5) {
            throw new IllegalArgumentException("비밀번호는 5자리 이상이여야합니다.");
        }

        Optional<Author> existingAuthor = authorRepository.findByEmail(email);
        if (existingAuthor.isPresent()) {
            throw new IllegalArgumentException("이미 존재하는 email입니다.");
        }

        Author author = new Author(name, email, password);
        authorRepository.register(author);

        System.out.println("환영합니다! 회원가입에 성공하였습니다!");
        System.out.println("User ID " + author.getId());
        System.out.println("총 회원의 수는 " + authorRepository.getAuthors().size());
    }

    public Optional<Author> login(String email, String password) {
        return Optional.ofNullable(authorRepository.findByEmail(email)
                .filter(author -> author.getPassword().equals(password))
                .orElseThrow(() -> new IllegalArgumentException("이메일 또는 비밀번호가 잘못되었습니다. 다시 한 번 확인해주세요.")));
    }
}
