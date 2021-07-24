import java.net.*;
import java.io.*;
import java.util.*;

public class client {
    public static void main(String args[]) throws IOException, UnknownHostException, java.net.ConnectException {
        Socket s = new Socket("127.0.0.1", 1234);

        PrintStream ps = new PrintStream(s.getOutputStream());
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the percentage of the student:");
        int k = Integer.parseInt(sc.nextLine());

        ps.println(k);

        BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String msg1 = br1.readLine();
        System.out.println(msg1);
        s.close();
        sc.close();
    }

}
