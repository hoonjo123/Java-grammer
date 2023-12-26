package C17ExceptionFileParsing.AuthorException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AuthorRepository {

    private List<Author> authors;

    public AuthorRepository() {
        this.authors = new ArrayList<>();
    }

    public void register(Author author) {
        authors.add(author);
    }

    public Optional<Author> findByEmail(String email) {
        return authors.stream().filter(a -> a.getEmail().equals(email)).findFirst();
    }

    public List<Author> getAuthors() {
        return new ArrayList<>(authors);
    }
}
