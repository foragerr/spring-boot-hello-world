package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.net.InetAddress;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() throws Exception {
        InetAddress inetAddress = InetAddress.getLocalHost();

        StringBuilder responseText = new StringBuilder("<h1>Greetings from Spring Boot!</h1>");
        responseText.append("<h2>IP Address: " + inetAddress.getHostAddress() + "</h2>");
        responseText.append("<h2>Hostname: " + inetAddress.getHostName() + "</h2");

        return responseText.toString();
    }
    
}
