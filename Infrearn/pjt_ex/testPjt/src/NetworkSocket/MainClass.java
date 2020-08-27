package NetworkSocket;

import java.net.ServerSocket;
import java.net.Socket;

public class MainClass {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			
			serverSocket = new ServerSocket(9000);
			System.out.println("--���� ���� �����Ϸ�!!--");
			
			socket = serverSocket.accept();
			System.out.println(" --Ŭ���̾�Ʈ ����!!--");
			System.out.println("socket : " + socket);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(socket != null) socket.close();
				if(serverSocket != null) serverSocket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}

}