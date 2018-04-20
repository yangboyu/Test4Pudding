package family.io.bio;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by yangboyu on 2018/3/14.
 */
public class TimeServer {
    public static void main(String[] args){
        int port = 8080;                                            //监听端口号为8080

        ServerSocket server = null;
        try {
            server = new ServerSocket(port);
            System.out.println("时间服务器监听端口：" + port);
            Socket socket = null;

            while (true) {
                socket = server.accept();                           //accecpt阻塞等待连接

                //有客户端连接进来则创建处理线程，负责和客户端交互
                new Thread(new TimeServerHandler(socket)).start();
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            if (server != null) {
                System.out.println("服务器端关闭。");
                try {
                    server.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                server = null;
            }
        }
    }

}
