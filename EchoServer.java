import java.net.*;
import java.io.*;
import java.util.*;

public class EchoServer {
    public static void main(String args[]) throws IOException, SocketException {
        ServerSocket ss = new ServerSocket(4561);
        while (true) {
            Socket s = ss.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintStream ps = new PrintStream(s.getOutputStream());
            Scanner sc = new Scanner(System.in);

            String str = "", str1 = "", client_name = "";

            client_name = br.readLine();
            System.out.println("Client Name: " + client_name);

            while (!str.equals("bye")) {
                System.out.println("Enter message to be send: ");
                str = sc.nextLine();
                ps.println(str);

                if (!str1.equals("bye")) {
                    str1 = br.readLine();
                    System.out.println("Client: " + str1);
                }
            }
            sc.close();
            ss.close();
        }

    }
}