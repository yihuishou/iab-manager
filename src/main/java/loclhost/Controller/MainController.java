package loclhost.Controller;


import loclhost.Model.User;
import loclhost.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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


    @RequestMapping("/userlogin")
    public String login(User user, Model model) {
        boolean loginResult = loginService.login(user);
        if (loginResult) {
            // List userlist = loginService.showAllUser();
            // model.addAttribute("userlist", userlist);
            return "main";
        }
        // model.addAttribute("message", "登陆失败");
        return "main";
    }

    @RequestMapping("/adduser")
    public String addUser(User user, Model model) {
        boolean addUserResult = loginService.addUser(user);
        if (addUserResult) {
            model.addAttribute("message", "添加成功");
        }
        model.addAttribute("message", "添加失败");
        return "newuser";

    }

    @RequestMapping("/deleteuser")
    public String deleteUser(String userID,Model model) {
        boolean deleteUserResult = loginService.deleteUser(Integer.valueOf(userID));
        if (deleteUserResult) {
            model.addAttribute("message", "删除成功");
        }
        model.addAttribute("message", "删除失败");
        return "userlist";

    }

    @RequestMapping("/updateuser")
    public String updateUser(User user,Model model) {
         boolean updateUserResult = loginService.updateUser(user);

        if (updateUserResult) {
            model.addAttribute("message", "删除成功");
        }
        model.addAttribute("message", "删除失败");
        return "userlist";
    }

    @RequestMapping("/show")
    public String showUser(Model model) {
        List userList = loginService.showAllUser();
        model.addAttribute("userlist", userList);
        return "userlist";
    }

    @RequestMapping("/newuser")
    public String newUser() {
        return "newuser";
    }

    @RequestMapping("/deleteall")
    public String cleanUser() {
        loginService.cleanUser();
        return "userlist";
    }
    @RequestMapping("/finduser")
    public String findUser(String username,Model model) {
     User user =   loginService.findUser(username);
        System.out.println(user.getUsername()+" "+user.getPassword());
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
