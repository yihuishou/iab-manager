package loclhost.Controller;

import loclhost.Model.User;
import loclhost.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by BlueSky on 2017/9/12.
 */
@Controller
public class MainController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/")
    public String index() {
        return "login";
    }

    @RequestMapping("/login")
    public String login(User user) {
      boolean loginResult =  loginService.login(user);
        return "login";
    }
    @RequestMapping("/add")
    public String addUser(User user) {
        boolean addUserResult =loginService.addUser(user);
        return "newuser";

    }
    @RequestMapping("/delete")
    public String deleteUser(Integer userID) {
        boolean deleteUserResult = loginService.deleteUser(userID);
        return "userlist";

    }
    @RequestMapping("/update")
    public String updateUser(User user) {
        boolean updateUser = loginService.updateUser(user);
        return "userlist";
    }
    @RequestMapping("/show")
    public String showUser() {
        List userList = loginService.showAllUser();
        return "userlist";
    }






/*

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



    @RequestMapping("/show")
    public String show(Model model) {
        return "login";
    }

    @RequestMapping("/new")
    public String adduser(Model model, User user) {

        return "newuser";
    }
*/

}
