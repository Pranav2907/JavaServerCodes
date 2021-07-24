import java.net.*;
import java.io.*;
import java.util.*;

class TCPServer {
    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(1234);
        Socket s = ss.accept();
        System.out.println("Connection Established");
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String msg = br.readLine();
        System.out.println("Received message from Client: " + msg);
        PrintStream ps1 = new PrintStream(s.getOutputStream());
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter message to be send:");
        String str1 = sc.nextLine();
        ps1.println(str1);

        s.close();
        ss.close();
        sc.close();

    }
}