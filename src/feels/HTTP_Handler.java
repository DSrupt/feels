package feels;

import org.webbitserver.BaseWebSocketHandler;
import org.webbitserver.HttpControl;
import org.webbitserver.HttpHandler;
import org.webbitserver.HttpRequest;
import org.webbitserver.HttpResponse;

public class HTTP_Handler implements HttpHandler {
	public void handleHttpRequest(HttpRequest request, HttpResponse response, 
			HttpControl control) {
		request.body()
	    response.header("Content-type", "text/html")
	            .content("<html><body>Hello world!</body></html>")
	            .end();
	  }
	
}
