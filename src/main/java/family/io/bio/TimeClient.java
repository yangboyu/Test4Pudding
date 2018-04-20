package family.io.bio;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


public class TimeClient {
    public static void main(String[] args) {

        byte b = 127;
        int port = 8080;
        Socket socket = null;
        BufferedReader in = null;
        PrintWriter out = null;
        try {
            socket = new Socket("127.0.0.1", port);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
            out.println("QUERY TIME");
            System.out.println("成功发送命令到服务器端。");
            String resp = in.readLine();                    //读取服务器端返回信息
            System.out.println("当前时间：" + resp);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关闭输出流
            if (out != null) {
                out.close();
                out = null;
            }

            //关闭输入数据流
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                in = null;
            }

            //关闭socket连接
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                socket = null;
            }
        }
    }
}
