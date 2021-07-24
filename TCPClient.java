import java.net.*;
import java.io.*;

public class TCPClient {
    public static void main(String args[]) throws IOException, UnknownHostException, java.net.ConnectException {
        Socket s = new Socket("127.0.0.1", 1234);

        PrintStream ps = new PrintStream(s.getOutputStream());
        ps.println("Hello!! I am Client..");

        BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String msg1 = br1.readLine();
        System.out.println("Received message from Server: " + msg1);
        s.close();
    }

}
