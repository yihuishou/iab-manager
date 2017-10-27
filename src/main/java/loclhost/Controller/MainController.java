package loclhost.Controller;

import loclhost.Model.User;
import loclhost.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by BlueSky on 2017/9/12.
 */
@Controller
public class MainController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/product")
    public ModelAndView product() {
        // ModelAndView mav = new ModelAndView("product");
        ModelAndView mav = new ModelAndView();
        return mav;
    }

    @RequestMapping("/message")
    public String message(Model model) {

        return "message";
    }

    @RequestMapping("/panel")
    public String king(Map<String, Object> model) {
        return "king";
    }

    @RequestMapping("/login")
    public ModelAndView login(User user) {
        ModelAndView ne = new ModelAndView();
        return ne;
    }

    @RequestMapping("/show")
    public String show(Model model) {
        return "login";
    }

    @RequestMapping("/new")
    public String adduser(Model model, User user) {

        return "newuser";
    }

}
