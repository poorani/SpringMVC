package springmvc.demo;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/student")
public class StudentController {

    //Adding Init Binder to trim Leading and trailing whitespaces in string present in the request
    // it trims to null if all are whitespaces.
    @InitBinder
    public void initBinder(DataBinder dataBinder){
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class , stringTrimmerEditor);

    }


    @RequestMapping("showForm")
    public String showForm(Model model){
        Student student = new Student();
        model.addAttribute("student",student);
        return "student-form";
    }

    @RequestMapping("processForm")
    public String processForm(@Valid @ModelAttribute("student") Student theStudent, BindingResult theResult)
    {

        System.out.println(theStudent.firstName);
        if(theResult.hasErrors()){
            return "student-form";
        }
        else
        return "studentform-process";
    }
}
