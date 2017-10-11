package loclhost.Controller;

import loclhost.Dao.UserDao;
import loclhost.Logs;
import loclhost.Model.User;
import loclhost.Service.LoginService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by BlueSky on 2017/9/12.
 */
@Controller
public class MainController {
    String name = "Tom";
    @Autowired
    private LoginService loginService;

    @Autowired
    private UserDao xx;

     private org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/")
    public String index(Model model) {

        List list = new ArrayList();
        User tom = new User();
        tom.setUserID(1);
        tom.setPassword("123456");
        tom.setUsername("tom");

        User lili = new User();
        lili.setUsername("lili");
        lili.setPassword("445566");
        lili.setUserID(2);

        User marry = new User();
        marry.setUserID(3);
        marry.setUsername("marry");
        marry.setPassword("998877");

        list.add(lili);
        list.add(marry);
        list.add(tom);

        logger.info("原版的测试");
        Logs.info("其他的测试");

        Map good = new HashMap();
        good.put("money", "500");
        good.put("name", "水果");

        model.addAttribute("namelist", list);
        model.addAttribute("lili", lili);
        model.addAttribute("map", good);
        model.addAttribute("mo", 123);
        // logger.info("参数化例子，用户名：{}", marry.getUsername());
        return "index";
    }

    @RequestMapping("/product")
    public ModelAndView product() {
        // ModelAndView mav = new ModelAndView("product");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("product");
        mav.addObject("t1", name);
        return mav;
    }

    @RequestMapping("/message")
    public String message(Model model) {
        model.addAttribute("t2", name);
        return "message";
    }

    @RequestMapping("/panel")
    public String king(Map<String, Object> model) {
        model.put("t3", name);
        return "king";
    }

    @RequestMapping("/login")
    public ModelAndView login(User user) {
        ModelAndView ne = new ModelAndView();
        ne.setViewName("login");
        User us = loginService.login(user);
        ne.addObject("user", us);
        return ne;
    }

    @RequestMapping("/show")
    public String show(Model model) {
        List<User> list = xx.findAll();
        model.addAttribute("users", list);
        return "login";
    }

    @RequestMapping("/new")
    public String adduser(Model model, User user) {

        String res = loginService.addUeser(user);
        model.addAttribute("info", res);
        return "newuser";
    }


}
