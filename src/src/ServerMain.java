import java.io.*;
import java.net.ServerSocket;

/**
 * Created by Elan Majkrzak on 11/12/2016.
 * Main server worker class
 */
public class ServerMain {
    private static ServerSocket server;
    private static int port;

    public static void main(String[] args) {
        try {
            if (args[0] != null && args[0] != "") {
                port = Integer.parseInt(args[0]);
            }
        } catch (NumberFormatException e) {
            System.out.println(args[0] + " is not a valid port number. Please enter a numeric value.");
            System.exit(-1);
        }
    }

    public void listenSocket() {
        try {
            server = new ServerSocket(port);
        } catch (IOException e) {
            System.out.println("Could not listen on port " + port);
            System.exit(-1);
        }
    }
}
