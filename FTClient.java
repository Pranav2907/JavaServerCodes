
import java.io.*;
import java.net.*;

public class FTClient {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 6666);
        FileOutputStream f = new FileOutputStream("C:\\Users\\91967\\OneDrive\\Desktop\\Java\\output.txt");
        InputStream in = s.getInputStream();
        byte b[] = new byte[2002];
        in.read(b, 0, b.length);
        f.write(b, 0, b.length);
        s.close();
        f.close();

    }

}
