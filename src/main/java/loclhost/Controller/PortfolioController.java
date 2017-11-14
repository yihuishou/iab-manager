package loclhost.Controller;

import loclhost.Model.Portfolio;
import loclhost.Model.User;
import loclhost.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by BlueSky on 2017/10/27.
 */
@Controller
@RequestMapping("/Protfolio")
public class PortfolioController {

    @Autowired
    private ItemService itemService;

    public String showlist(Model model) {
        List<Portfolio> list = itemService.findAll();
        model.addAttribute("list", list);
        return "PortfolioController";

    }

    public String addItem(Portfolio portfolio, Model model) {

        boolean result = itemService.addItem(portfolio);
        return "PortfolioController";

    }

    public String deletItem(Portfolio portfolio, Model model) {
        return "PortfolioController";
    }

    public String updateIntem(Portfolio portfolio, Model model) {
        return "PortfolioController";


    }

    @RequestMapping("findtest")
    public String findTest(Model model, User user) {
        List list = itemService.findTest(user.getUsername());
        model.addAttribute("findtestlist", list);
        return "userlist";
    }
}
