package Spring;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

//간단한 8080webserver 생성
public class Webserver1 {
    public static void main(String[] args) {
        try {
            ServerSocket serversocket = new ServerSocket(8081); //network 창구 만들기
            //사용자가 localhost : 8080 치고 들어오면 사용자에게 줄 내용을 작성
            System.out.println("8080 서비스 시작");
            while(true) {
                //꺼지면 안되니까
                try (Socket socket = serversocket.accept()) {
                    String httpRes = "HTTP/1.1 200 OK\r\n\r\n" + "Hello World";
                    socket.getOutputStream().write(httpRes.getBytes("UTF-8"));//write = return
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
