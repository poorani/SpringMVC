package springmvc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWordController {

    //controller method to show the form
    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    //conrtoller method to process th form
    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld-process";
    }

}
