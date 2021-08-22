package controller;

import model.FPTemployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.ITemployeeService;

@Controller
@RequestMapping("/home")
public class TemployeeController {
    @Autowired
    ITemployeeService iTemployeeService;

    @GetMapping("/show")
    public ModelAndView show() {
        ModelAndView modelAndView = new ModelAndView("show");
        modelAndView.addObject("listTemployee", iTemployeeService.findAll());
        return modelAndView;
    }

    @GetMapping("/create")
    public String createShow() {
        return ("create");
    }

    @GetMapping("/edit/{id}")
    public ModelAndView editShow(@PathVariable long id) {
        ModelAndView modelAndView = new ModelAndView("/edit");
        modelAndView.addObject("Temployee", iTemployeeService.findById(id));
        return modelAndView;
    }
    @GetMapping("/finByName")
    public ModelAndView finByName(@RequestParam String findName){
        ModelAndView modelAndView= new ModelAndView("show");
        modelAndView.addObject("list",iTemployeeService.findByName(findName));
        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable long id){
        iTemployeeService.delete(iTemployeeService.findById(id));
        return "redirect:/home/show";
    }

    @PostMapping("/create")
    public ModelAndView create(@ModelAttribute FPTemployee fpTemployee) {
        iTemployeeService.save(fpTemployee);
        ModelAndView modelAttribute = new ModelAndView("redirect:/home/show");
        return modelAttribute;
    }

    @PostMapping("/edit/{id}")
    public ModelAndView edit(@ModelAttribute FPTemployee fpTemployee) {
        iTemployeeService.save(fpTemployee);
        ModelAndView modelAndView = new ModelAndView("redirect:/home/show");
        return modelAndView;
    }
}
