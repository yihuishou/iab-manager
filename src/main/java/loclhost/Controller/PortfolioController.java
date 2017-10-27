package loclhost.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by BlueSky on 2017/10/27.
 */
@Controller
@RequestMapping("/Protfolio")
public class PortfolioController {

    String showView() {
        return "showAll";
    }



}
