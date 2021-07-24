import java.net.*;
import java.io.*;
import java.util.*;

class server {
    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(1234);
        Socket s = ss.accept();
        System.out.println("Connection Established");
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintStream ps1 = new PrintStream(s.getOutputStream());
        Scanner sc = new Scanner(System.in);
        int p = Integer.parseInt(br.readLine());
        if (p >= 75) {
            ps1.println("Distinction");
        } else if ((p < 75) && (p >= 60)) {
            ps1.println("1st Class");
        } else if ((p < 60) && (p >= 50)) {
            ps1.println("2st Class");
        } else if ((p < 50) && (p >= 40)) {
            ps1.println("3st Class");
        } else if ((p < 40) && (p >= 35)) {
            ps1.println("PASS");
        } else {
            ps1.println("FAIL");
        }

        s.close();
        ss.close();
        sc.close();

    }
}
