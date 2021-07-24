import java.util.Scanner;
import java.net.*;
import java.io.*;

public class RCEClient {
    public static void main(String args[]) throws UnknownHostException, IOException, SocketException {
        Socket s = new Socket("localhost", 1234);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Command: ");
        String cmd = sc.nextLine();
        PrintStream ps = new PrintStream(s.getOutputStream());
        ps.println(cmd);
        System.out.println(cmd + " Command Executed Successfully!");
        sc.close();
        s.close();

    }
}