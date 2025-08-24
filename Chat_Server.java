import java.io.*;
import java.net.*;

public class Chat_Server {
    public static void main(String[] args) {
        final int PORT = 12345; // Port number
        System.out.println("Server started. Waiting for clients...");

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            Socket socket = serverSocket.accept();
            System.out.println("Client connected: " + socket.getInetAddress());

            // Input and output streams
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            // Thread for receiving messages from the client
            Thread receiveThread = new Thread(() -> {
                try {
                    String message;
                    while ((message = input.readLine()) != null) {
                        System.out.println("Client: " + message);
                    }
                } catch (IOException e) {
                    System.out.println("Connection closed.");
                }
            });
            receiveThread.start();

            // Sending messages to the client
            BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));
            String serverMessage;
            while ((serverMessage = consoleInput.readLine()) != null) {
                output.println(serverMessage);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
