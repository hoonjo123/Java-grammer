package C17ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import sun.net.www.http.HttpClient;

import java.io.IOException;
import java.net.URI;

public class C1705JsonWithJacksonHttp {
    public static void main(String[] args) {
        //http클라이언트 생성
//
//        HttpClient client = HttpClient.newHTTPClinet();
//        ObjectMapper mapper - new ObjectMapper();
//        //http 요청객체 생성
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create("https://jsonplaceholder.typicode.com/posts/1"))
//                .GET()
//                .build();
//        //http 응답객체 생성
//        try {
//            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
//            String post = response.body();
//            JsonNode jsonNode = mapper.readTree(post);
//        }catch (IOException e) {
//            throw new RuntimeException(e);
//        }catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}
