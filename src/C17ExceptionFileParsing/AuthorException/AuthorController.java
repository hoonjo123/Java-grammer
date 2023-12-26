package C17ExceptionFileParsing.AuthorException;

import java.util.Scanner;

public class AuthorController {
    public static void main(String[] args) {
        AuthorRepository authorRepository = new AuthorRepository();
        AuthorService authorService = new AuthorService(authorRepository);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1번을 누르면 회원가입을 진행합니다.\n2번을 누르면 로그인합니다.");

            int number = Integer.parseInt(sc.nextLine());

            if (number == 1) {
                System.out.println("회원가입을 진행합니다");
                System.out.println("회원가입하실 이름을 입력해주세요");
                String name = sc.nextLine();
                System.out.println("이메일을 입력해주세요");
                String email = sc.nextLine();
                System.out.println("비밀번호를 입력해주세요");
                String password = sc.nextLine();

                try {
                    authorService.registerAuthor(name, email, password);
                } catch (IllegalArgumentException e) {
                    System.out.println("회원가입에 실패하였습니다 😭 " + e.getMessage());
                }
            } else if (number == 2) {
                System.out.println("login 하실 이메일을 입력해주세요.");
                String author_email = sc.nextLine();
                System.out.println("login 하실 password를 입력해주세요.");
                String author_password = sc.nextLine();

                try {
                    authorService.login(author_email, author_password);
                    System.out.println("안녕하세요? 오늘도 후니넷에서 행복한 하루 보내세요.");
                } catch (IllegalArgumentException e) {
                    System.out.println("로그인에 실패하였습니다. " + e.getMessage());
                }
            }
        }
    }
}
