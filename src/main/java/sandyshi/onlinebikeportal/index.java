package sandyshi.onlinebikeportal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class index {
    @RequestMapping("/home.html")
    public String home() {
        return "index";
    }
    @RequestMapping("/views")
    public String view() {
        return "home";
    }
}


