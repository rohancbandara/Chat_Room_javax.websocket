package demo;

import javax.websocket.OnOpen;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/ServerEndPointDemo")
public class ServerEndpointDemo {
	@OnOpen
	public void handeleOpen() {
		System.out.println("Client is now conneted...");
	}

	public String handeleMassage(String massage) {
		System.out.println("Receve from client :" + massage);
		String replyMassage = "echo " + massage;
		System.out.println("Send to client" + replyMassage);
		return replyMassage;
	}

	public void handelClose() {
		System.out.println("Client is now disconnected...");
	}

	public void handelError(Throwable t) {
		t.printStackTrace();
	}

}
