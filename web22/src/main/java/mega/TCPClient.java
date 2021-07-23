package mega;

import java.io.IOException;
import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) throws IOException {
		for (int i = 0; i < 2000; i++) {
			// client 객체를 생성하자
			Socket client = new Socket("localhost", 9100);
			System.out.println("client request ------" + i);
		}
	}
}
