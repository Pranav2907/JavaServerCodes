import java.net.*;

public class UDPClient {
    public static void main(String args[]) throws SocketException, UnknownHostException, Exception {
        DatagramSocket ds = new DatagramSocket();
        System.out.println("Client Started!!");

        // code to create and send packet to the server
        String msg = "Hello Server!! I'm Client!!!";
        byte[] b = msg.getBytes(); // binding msg into and array
        InetAddress ia = InetAddress.getByName("localhost"); // we do this when we don't know the ip address of the
                                                             // machine
        DatagramPacket dp = new DatagramPacket(b, b.length, ia, 3456);
        // create a packet (DatagramPacket), msg is converted into a packet
        // (packet,its length,ip address of server,port)

        ds.send(dp); // send the packet, send is DatagramSocket method
        System.out.println("Packet Sent...");

        // receive msg from server
        byte[] b1 = new byte[1000]; // create byte array with max size
        DatagramPacket dp1 = new DatagramPacket(b1, b1.length); // creating one packet
        ds.receive(dp1); // it receives the packet in dp from port
        System.out.println("Packet Received...");

        String msg1 = new String(dp.getData()); // convert packet dp to message
        System.out.println("Received from Client: " + msg1);
        ds.close();
    }
}