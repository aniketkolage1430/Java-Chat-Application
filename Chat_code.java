// ChatClient.java
import java.io.*;
import java.net.*;

public class Chat_code {
    public static void main(String[] args) {
        final String SERVER_IP = "127.0.0.1"; // Change to server IP for LAN
        final int PORT = 12345;

        try (Socket socket = new Socket(SERVER_IP, PORT)) {
            System.out.println("Connected to server.");

            // Input and output streams
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            // Thread for receiving messages from the server
            Thread receiveThread = new Thread(() -> {
                try {
                    String message;
                    while ((message = input.readLine()) != null) {
                        System.out.println("Server: " + message);
                    }
                } catch (IOException e) {
                    System.out.println("Connection closed.");
                }
            });
            receiveThread.start();

            // Sending messages to the server
            BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));
            String clientMessage;
            while ((clientMessage = consoleInput.readLine()) != null) {
                output.println(clientMessage);
            }

        } catch (IOException e) {
            System.out.println("Unable to connect to server.");
        }
    }
}
