package Spring;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Webserver3 {
    public static void main(String[] args) {
        try {
            ServerSocket serversocket = new ServerSocket(8081);
            System.out.println("8080 서비스 시작");
            while(true) {
                try (Socket socket = serversocket.accept()) {
                    String httpRes = "HTTP/1.1 200 OK\r\n\r\n" + "Hello World";
                    socket.getOutputStream().write(httpRes.getBytes("UTF-8"));
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
