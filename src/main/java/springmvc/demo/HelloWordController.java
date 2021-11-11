package springmvc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.support.AbstractMultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;

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

    @RequestMapping("/processForm2")
    public String processFormWithModel(HttpServletRequest request, Model model){

        String name = request.getParameter("studentName");

        String Message = "Hello "+name;

        model.addAttribute("message", Message);

        return "helloworld-process";

    }
}
