package exercose101_1.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HelloSpring {
        @RequestMapping("/")
        public String homePage(){
            return "index";
    }
}
