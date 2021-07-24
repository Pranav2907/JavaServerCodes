import java.net.*;
import java.io.*;
import java.util.*;

public class EchoClient1 {
    public static void main(String[] args) throws UnknownHostException, IOException, SocketException {
        Socket s = new Socket("localhost", 4561);
        BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintStream ps1 = new PrintStream(s.getOutputStream());
        Scanner sc1 = new Scanner(System.in);

        String str = "", str1 = "", client_name = "";

        System.out.println("Client 1:");
        ps1.println("Client 1:");

        while (!str.equals("bye")) {
            str = br1.readLine();
            System.out.println("Server: " + str);

            if (!str1.equals("bye")) {
                System.out.println("Enter message to be sent: ");
                str1 = sc1.nextLine();
                ps1.println(str1);
            }
        }
        s.close();
        sc1.close();
        System.out.println(client_name);
    }
}