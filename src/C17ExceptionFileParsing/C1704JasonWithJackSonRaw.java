package C17ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class C1704JasonWithJackSonRaw {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            //readTree를 통해서 json을 계층적 트리구조형태로 변환
            JsonNode data1 = mapper.readTree(Paths.get("src/C17ExceptionFileParsing/testData1.json").toFile());
            Map<String, String> StudentMap = new HashMap<>();
            StudentMap.put("id",data1.get("id").asText());
            StudentMap.put("name",data1.get("name").asText());
            StudentMap.put("classNumber",data1.get("classNumber").asText());
            StudentMap.put("city",data1.get("city").asText());
            System.out.println(StudentMap);
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}
