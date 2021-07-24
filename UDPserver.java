import java.net.*;
import java.io.*;

public class UDPserver {
    public static void main(String args[]) throws SocketException, UnknownHostException, IOException {
        DatagramSocket ds = new DatagramSocket(3456); // create obj of DatagramSocket
        System.out.println("Server Started!!");

        // code to recieve packet from client
        byte[] b = new byte[1000]; // create byte array with max size
        DatagramPacket dp = new DatagramPacket(b, b.length); // creating one packet
        ds.receive(dp); // it receives the packet in dp from port
        System.out.println("Packet Received...");

        String msg = new String(dp.getData()); // convert packet dp to message
        System.out.println("Received from Client: " + msg);

        // send msg to sclient
        String ms = "Hello!! I'm Server!!!";
        byte[] k = ms.getBytes();
        InetAddress ia = InetAddress.getLocalHost();
        DatagramPacket dp1 = new DatagramPacket(k, k.length, ia, dp.getPort());

        ds.send(dp1);
        System.out.println("Packet Sent...");
        ds.close();
    }
}
