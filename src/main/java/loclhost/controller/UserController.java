package loclhost.controller;

import loclhost.model.Consumer;
import loclhost.model.Role;
import loclhost.services.UserServices;
import loclhost.token.CheckDuplicate;
import loclhost.token.SetDuplicateMark;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

/**
 * Created by LadyLady on 2018-03-27.
 */
@Controller
public class UserController {

    @Autowired
    private UserServices userServices;

    @RequestMapping("/")
    String index() {
        return "login";
    }


    @RequestMapping("/login")
    String login(Model model, Consumer consumer) {

        boolean loginResult = userServices.login(consumer.getUsername(), consumer.getPassword());
        model.addAttribute("result", loginResult ? "成功" : "失败");
        return "login";
    }

    @CheckDuplicate
    @RequestMapping("/add")
    ModelAndView addNew(Consumer consumer) {
        ModelAndView modelAndView = new ModelAndView();

        boolean re = userServices.newUser(consumer);

        modelAndView.addObject("result", re ? "成功" : "失败");
        modelAndView.setViewName("login");

        return modelAndView;
    }

    @SetDuplicateMark
    @RequestMapping("/toNew")
    String toNew() {
        return "newuser";
    }


    @RequestMapping("/toNew2")
    String toNew2() {
        return "new";
    }

    @RequestMapping("/newuser")
    String addNewuser(Consumer consumer, Model model, RedirectAttributes redirectAttributes) {


        boolean re = userServices.newUser(consumer);

        redirectAttributes.addFlashAttribute("result", re ? "成功" : "失败");
        return "redirect:/newuser";

    }

    @RequestMapping("/select")
    String showUserList(Model model, @RequestParam(value = "username", required = false) String username) {

        List<Consumer> relist = userServices.getUserList();

        model.addAttribute("reList", relist);


        Role role = new Role();
        role.setRolename("12312");
        role.setRolenote("oopp");

        model.addAttribute("test", role);
        return "userdetial";

    }

    @RequestMapping(value = "/fixuser")
    String fixuser(Model model, Consumer consumer) {

        boolean fix = userServices.fixUser(consumer);

        model.addAttribute("result", fix ? "成功" : "失败");
        return "login";
    }

    @ResponseBody
    @RequestMapping
    @ResponseStatus(value = HttpStatus.LOOP_DETECTED, code = HttpStatus.LOOP_DETECTED, reason = "12312")
    String getl(String rol) {
        userServices.getList(rol);
        return "sas";

    }
}
