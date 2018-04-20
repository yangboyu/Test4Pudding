package family.io.bio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by yangboyu on 2018/3/14.
 */
public class TimeServerHandler implements Runnable {
    private Socket socket;                      //与客户端交互Socket

    public TimeServerHandler(Socket socket) {   //构造函数，传入连接进来的socket
        this.socket = socket;
    }

    @Override
    public void run() {
        BufferedReader in = null;
        PrintWriter out = null;
        try {
            in = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
            out = new PrintWriter(this.socket.getOutputStream(), true);
            String currentTime = null;
            String body = null;
            while (true) {
                body = in.readLine();           //读取客户端发送的消息
                if (body == null)               //空消息，则关闭Server端线程
                    break;
                System.out.println("服务器端收到消息：" + body);

                /*
                 * 此处处理客户端请求
                */

                if("QUERY TIME".equalsIgnoreCase(body)){
                    currentTime = new java.util.Date(System.currentTimeMillis()).toString();
                }else{
                    currentTime = "未识别的命令";
                }

                out.println(currentTime);
            }

        } catch (Exception e) {
            //关闭接受流
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
            //关闭发送流
            if (out != null) {
                out.close();
                out = null;
            }
            //关闭socket
            if (this.socket != null) {
                try {
                    this.socket.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                this.socket = null;
            }
        }
    }
}
