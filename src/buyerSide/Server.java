package buyerSide;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Server{

	/**
     * Socket�����
     */
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            System.out.println("��������������ȴ��ͻ�������..");

            while (true) {
                Socket socket = serverSocket.accept();// ���������ܵ����׽��ֵ�����,����һ��Socket����
                System.out.println("�ͻ���������");
                SocketThread socketThread = new SocketThread(socket);
                socketThread.start();
                /*
                if(socketThread.get_over())
                {
                	 System.out.println("������ѹر�");
                	socket.close();
                	serverSocket.close();
                	break;
                }
                */
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
