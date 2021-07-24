import java.net.*;
import java.io.*;
import java.util.*;

public class EchoClient2 {
    public static void main(String[] args) throws UnknownHostException, IOException, SocketException {
        Socket s = new Socket("localhost", 4561);
        BufferedReader br2 = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintStream ps2 = new PrintStream(s.getOutputStream());
        Scanner sc2 = new Scanner(System.in);

        String str = "", str2 = "", client_name = "";

        System.out.println("Client 2:");
        ps2.println("Client 2:");

        while (!str.equals("bye")) {
            str = br2.readLine();
            System.out.println("Server: " + str);

            if (!str2.equals("bye")) {
                System.out.println("Enter message to be sent: ");
                str2 = sc2.nextLine();
                ps2.println(str2);
            }
        }
        s.close();
        sc2.close();
        System.out.println(client_name);
    }
}
