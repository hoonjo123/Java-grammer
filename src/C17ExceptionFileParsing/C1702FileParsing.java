package C17ExceptionFileParsing;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class C1702FileParsing {
    public static <List> void main(String[] args) {
        ///src/C17ExceptionFileParsing
        Path filePath = Paths.get("src/C17ExceptionFileParsing/text_file.txt");
        //버퍼 기능이 구현되어 있고 NIO 패키지에서는 non-blocking방식 사용.
        //write :덮어쓰기 append : 추가
        //StandardCharsets.UTF_8  <- 기본이 utf8이라 생략이 가능하다.
        try {
            if (Files.exists(filePath)) {
                Files.write(filePath, "손흥민\n".getBytes(), StandardOpenOption.APPEND);
            } else {
                Files.write(filePath, "손흥민\n".getBytes(), StandardOpenOption.CREATE_NEW);
            }
            //CREATE_NEW 이후에 APPEND 실행 가능.
        } catch (IOException e) {
//            System.out.println(e.getMessage());
            e.printStackTrace();
        }
//      파일읽기 : readString, readAllLines(List형태)
        try {
//            String myST = Files.readString(filePath);
//            System.out.println(myST);
//        } catch (IOException e){
//            e.printStackTrace();
//        }

//

//        String myST = Files.readAllLines(filePath);
//        System.out.println(myST);
            java.util.List<String> myList = Files.readAllLines(filePath);
            for (String a : myList) {
                System.out.println(a);
            }
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
