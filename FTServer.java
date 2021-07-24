import java.io.*;
import java.net.*;

public class FTServer {

    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(6666);
        Socket s = ss.accept();
        FileInputStream f = new FileInputStream("C:\\Users\\91967\\OneDrive\\Desktop\\Java\\input.txt");
        byte b[] = new byte[2002];
        f.read(b, 0, b.length);

        OutputStream out = s.getOutputStream();
        out.write(b, 0, b.length);
        s.close();
        ss.close();
        f.close();

    }

}
