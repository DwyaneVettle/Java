package com.scuvc.week05;

/**
 * @Description
 * @Author Michealzou@126.com
 * @Date 2026/4/2 16:29
 **/
import java.io.*;
import java.net.*;

public class MySocketClient {
    private static int localHostPort = 5001;

    public static void main(String[] args) throws IOException {

        CSendMessage cSendMessage = new CSendMessage();
        Thread thread2 = new Thread(cSendMessage);
        thread2.start();

        ServerSocket serverSocket = new ServerSocket(localHostPort);
        while (true) {
            Socket socketServer = serverSocket.accept();
            CGetMessage getMessage = new CGetMessage(socketServer);
            Thread thread = new Thread(getMessage);
            thread.start();
        }
    }
}

// 接收消息
class CGetMessage implements Runnable {
    private InputStream inputStream;
    private Socket socket;
    private byte[] buffer;

    public CGetMessage(Socket socket) {
        this.socket = socket;
        try {
            inputStream = socket.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void run() {
        String str = "";
        while (true) {
            buffer = new byte[2048];
            int n = 0;
            try {
                n = inputStream.read(buffer);
                str = new String(buffer, 0, n);
                System.out.println("服务器:" + str);
            } catch (IOException e) {
                e.printStackTrace();
                break;
            }
            if (str.equals("q")) {
                break;
            }
        }
        try {
            if (socket != null)
                socket.close();
            if (inputStream != null)
                inputStream.close();
        } catch (Exception e) {

        }
    }
}

// 发送消息
class CSendMessage implements Runnable {
    private boolean socketIsExits = false;
    private OutputStream outputStream;
    private Socket socketClient;
    private int remotePort = 5000;
    private String remoteAddress = "localhost";
    private byte[] buffer;

    public CSendMessage() throws IOException {
    }

    public void run() {
        String str = new String();
        checkSocket();
        int size = 0;
        while (true) {
            try {
                System.out.println("请输入:");
                buffer = new byte[2048];
                size = System.in.read(buffer);
                str = new String(buffer, 0, size);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (socketIsExits) {
                try {
                    System.out.println("客户端发送 socket：" + this.socketClient);
                    System.out.print("客户端:" + str);
                    outputStream.write(str.getBytes());
                    outputStream.flush();
                } catch (Exception e) {
                    System.out.println("客户端socket不存在。");
                    checkSocket();
                }
            } else {
                checkSocket();
            }
        }
    }

    private void checkSocket() {
        try {
            socketClient = new Socket(remoteAddress, remotePort);
            outputStream = socketClient.getOutputStream();
            socketIsExits = true;
        } catch (Exception e) {
            socketIsExits = false;
        }
    }
}
