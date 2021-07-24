
import java.net.*;

import java.io.*;

public class RCEServer {
    public static void main(String args[]) throws UnknownHostException, IOException, SocketException {
        ServerSocket ss = new ServerSocket(1234);
        System.out.println("Waiting for the Client..");
        Socket s = ss.accept();
        System.out.println("Connection Established..");
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String cmd = br.readLine();
        Runtime H = Runtime.getRuntime();
        Process P = H.exec(cmd);
        System.out.println("The Command Executed Successfully...");
        ss.close();
        s.close();
        P.destroy();

    }
}
