import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class PingIP {

    public static void runSystemCommand(String command) {

        try {
            Process p = Runtime.getRuntime().exec(command);
            BufferedReader inputStream = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String s = "";
            // reading output stream of the command
            while ((s = inputStream.readLine()) != null) {
                System.out.println(s);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the IP Address/URL to be Ping  :");
        String ip = sc.nextLine();
        sc.close();
        runSystemCommand("ping " + ip);

    }
}