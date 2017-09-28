package loclhost.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by BlueSky on 2017/9/13.
 */
@Controller
public class ThymeleafDemoController {


    // 表单提交
    @RequestMapping("/thDemo")
    public String formDemo(Model model,String name,String age) {
        model.addAttribute("returnname", name);
        model.addAttribute("returnage", age);
        return "ThymeleafDemoPage";
    }

//  JSON处理
//     public User JsonDemo ()

//AJAX处理


//    迭代列表


// 静态资源储量


//


}
