package springmvc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.support.AbstractMultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
//Controller lever request Mapping
@RequestMapping("/hello/")
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

    @RequestMapping("processForm3")
    public String processFormWithAnnotation(@RequestParam("studentName") String theName , Model model){
        String Message = "Hello "+theName.toUpperCase();

        model.addAttribute("message", Message);

        return "helloworld-process";
    }
}
