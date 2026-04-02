package com.scuvc.week05;

/**
 * @Description
 * @Author Michealzou@126.com
 * @Date 2026/4/2 16:30
 **/
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClient implements Runnable {
    public int remotePort = 5000;
    public String remoteAddress = "localhost";


    public static void main(String args[]) {
        SocketClient socketClient = new SocketClient();
        socketClient.run();
    }


    public SocketClient() {
    }

    public void run() {
        Socket socket = null;
        OutputStream outputStream = null;
        byte[] buffer;
        int size = 0;
        try {
            socket = new Socket(remoteAddress, remotePort);
            outputStream = socket.getOutputStream();
            System.out.println(socket);
            while (true) {
                System.out.println("input:");
                buffer = new byte[2048];
                size = System.in.read(buffer);
                if (size > 0) {
                    outputStream.write(new String(buffer, 0, size).getBytes());
                    outputStream.flush();
                }
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (socket != null)
                    socket.close();
                if (outputStream != null)
                    outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
