package demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PagesController {

    private static Logger log = LoggerFactory.getLogger(PagesController.class);

    @RequestMapping("/")
    public String getIndex(Model model){
        final InetAddress localHost;
        try {
            localHost = InetAddress.getLocalHost();
            model.addAttribute("host", localHost.getHostName());
            model.addAttribute("ip", localHost.getHostAddress());
        } catch (UnknownHostException e) {
            log.warn("An exception occurred while trying to determine the host and IP address: {}", e);
        }
        return "home";
    }

    @RequestMapping("/hello")
    public String getHello(Model model){
        final InetAddress localHost;
        try {
            localHost = InetAddress.getLocalHost();
            model.addAttribute("host", localHost.getHostName());
            model.addAttribute("ip", localHost.getHostAddress());
        } catch (UnknownHostException e) {
            log.warn("An exception occurred while trying to determine the host and IP address: {}", e);
        }
        return "hello";
    }

}
