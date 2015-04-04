package feels;

import java.util.concurrent.ExecutionException;

import org.webbitserver.HttpHandler;
import org.webbitserver.WebServer;
import org.webbitserver.WebServers;

public class Server {
	public Server() throws InterruptedException, ExecutionException{
		WebServer wb = WebServers.createWebServer(8080)
				.add("fkadsfsak", new HTTP_Handler())
				.start()
				.get();
		wb.start().get(); // start() returns a Future.
	    System.out.println("Listening on " + wb.getUri());
	}
	
	public static void main(String[] ar) throws InterruptedException, ExecutionException
	{
		Server s = new Server();
			
	}
	
}
