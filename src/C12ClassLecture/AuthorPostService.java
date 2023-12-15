package C12ClassLecture;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AuthorPostService {
    public static void main(String[] args) {
        List<Author> authors = new ArrayList<>();
        List<Post> posts = new ArrayList<>();
        while(true) {
            System.out.println("1번을 누르면 회원가입을 진행합니다" + "\n" + "2번을 누르면 게시글을 작성합니다." + "\n" +
                    "3번을 누르면 회원 email을 출력합니다" + "\n" + "4번을 누르면 회원의 상세목록을 조회합니다" + "\n" + "5번을 누르면 게시글의 상세목록을 조회합니다");

            Scanner sc = new Scanner(System.in);
            Integer number = Integer.parseInt(sc.nextLine());

            //integer -> string : Integer.parseInt(String)

            if (number == 1) {
                System.out.println("회원가입을 진행합니다");
                System.out.println("회원가입하실 이름을 입력해주세요");
                String name = sc.nextLine();
                System.out.println("이메일을 입력해주세요");
                String email = sc.nextLine();
                System.out.println("비밀번호를 입력해주세요");
                String password = sc.nextLine();
                Author myAuthor1 = new Author(name, email, password);
                authors.add(myAuthor1);
                System.out.println("가입사용자의 id는 " + myAuthor1.getId() + "입니다.");
                System.out.println("현재까지 가입자는 " + authors.size() + "명 입니다");
            } else if (number == 2) {
                System.out.println("게시글 작성 페이지 입니다.");
                System.out.println("원하시는 게시글 작성 제목을 입력해주세요");
                String title = sc.nextLine();
                System.out.println("작성하실 내용을 입력해주세요");
                String contents = sc.nextLine();
                System.out.println("작성자의 author_id를 입력해주세요");
                long author_id = sc.nextLong();
                Post mypost = new Post(title, contents, author_id);
                posts.add(mypost);
            } else if (number == 3) {
                System.out.println("회원email을 조회합니다.");
                for (int i = 0; i < authors.size(); i++) {
                    System.out.println(authors.get(i).getEmail());
                }
            } else if (number == 4) {
                System.out.println("회원의 상세목록을 조회합니다");
                System.out.println("회원의 id를 입력하면 이름과 이메일 작성글 수를 조회할 수 있습니다");
                Integer user_input_id = Integer.parseInt(sc.nextLine());
                int count = 0;
                for ( int i =0; i < authors.size(); i++) {
                    if (user_input_id == authors.get(i).getId()) {
                        System.out.println(authors.get(i).getName());
                        System.out.println(authors.get(i).getEmail());
                    }
                }
                for ( int i = 0; i< posts.size(); i++){
                    if(user_input_id == posts.get(i).getAuthor_id()){
                        count ++;
                    }
                }
                System.out.println("작성자가 작성한 글의 총 개수는" + count + "입니다");


            } else if (number == 5) {
                System.out.println("게시글 id를 입력하면 해당 id의 제목과 이메일을 출력해줍니다");
                Integer board_id = Integer.parseInt(sc.nextLine());
                long target_author_id = 0;
                for( int i =0; i< posts.size(); i++){
                    if(board_id == posts.get(i).getId()){
                        System.out.println(posts.get(i).getTitle());
                    target_author_id = posts.get(i).getAuthor_id();}
                    }
                for( int i=0; i< authors.size(); i++){
                    if(target_author_id == authors.get(i).getId()){
                        System.out.println(authors.get(i).getEmail());
                    }
                }
            }


            }
        }
    }

//엔티티
class Author{
    private long id = 0L;
    private String name = "";
    private String email = "";
    private String password = "";
    static Long static_id = 0L;

    Author(){

    }
    Author(String name, String email, String password) {
        static_id += 1;
        this.id = static_id;
        this.name = name;
        this.email = email;
        this.password = password;

    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}

class Post{
    private long id = 0;
    private String title = "";
    private String contents = "";
    private long author_id = 0L;
    static Long static_id = 0L;

    private Author author;

    Post(){

    }

    Post(String title, String contents, long author_id){
        static_id += 1;
        this.id = static_id;
        this.title = title;
        this.contents = contents;
        this.author_id = author_id;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }

    public long getAuthor_id() {
        return author_id;
    }
}