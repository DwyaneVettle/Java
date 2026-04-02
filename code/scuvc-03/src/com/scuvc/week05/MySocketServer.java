package com.scuvc.week05;

/**
 * @Description
 * @Author Michealzou@126.com
 * @Date 2026/4/2 16:28
 **/
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MySocketServer {
    private static int localHostPort = 5000;

    public static void main(String[] args) throws IOException {
        ServerSocket s = new ServerSocket(localHostPort);
        System.out.println("服务器端------监听中.....");
        while (true) {
            Socket socket = s.accept();
            System.out.println("接入的socket：" + socket);
            GetMessage getMessage = new GetMessage(socket);
            Thread thread = new Thread(getMessage);
            thread.start();
        }
    }
}

// 接收消息
class GetMessage implements Runnable {
    private int remotePort = 5001;
    private String remoetAddress = "localhost";
    private InputStream inputStream;
    private OutputStream outputStream;
    private Socket socketGet;
    private Socket socketSendMessage;
    private boolean socketIsExits = false;
    private int sum = 0;

    private byte[] buffer;

    public GetMessage(Socket socket) {
        this.socketGet = socket;
        try {
            inputStream = socketGet.getInputStream();
            outputStream = socketGet.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void run() {
        String str = "";
        int n = 0;
        while (true) {
            try {
                buffer = new byte[2048];
                n = inputStream.read(buffer);
                str = new String(buffer, 0, n);
                System.out.print("客户端:" + str);
                sendMessage();
            } catch (IOException e) {
                e.printStackTrace();
                break;
            }
            if (str.equals("q")) {
                break;
            }
        }
        try {
            if (socketGet != null)
                socketGet.close();
            if (inputStream != null)
                inputStream.close();
        } catch (Exception e) {

        }
    }

    // 发送消息
    public void sendMessage() throws IOException {
        if (socketIsExits) {
            try {
                String input = "======" + (sum++);
                System.out.println("服务端发送 socket：" + this.socketSendMessage);
                outputStream.write(input.getBytes());
                System.out.println("服务器：" + input);
                outputStream.flush();
            } catch (Exception e) {
                System.out.println("客户端socket不存在。");
                checkSocket();
            }
        } else {
            checkSocket();
        }
    }

    private void checkSocket() {
        try {
            socketSendMessage = new Socket(remoetAddress, remotePort);
            outputStream = socketSendMessage.getOutputStream();
            socketIsExits = true;
        } catch (Exception e) {
            socketIsExits = false;
        }
    }
}


