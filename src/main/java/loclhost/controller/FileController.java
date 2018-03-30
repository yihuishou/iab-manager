package loclhost.controller;

import loclhost.token.CheckDuplicate;
import loclhost.token.SetDuplicateMark;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by LadyLady on 2018-03-30.
 */
@RequestMapping("/file")
@Controller
public class FileController {

    @CheckDuplicate
    @PostMapping("")
    public String getfile(MultipartFile intoFile, Model model) {
        String fileName = intoFile.getOriginalFilename();
        model.addAttribute("filename", fileName);
        System.out.println(fileName);

        System.out.println(intoFile.getName());
        System.out.println(intoFile.getSize());
        return "filepage";
    }

    @SetDuplicateMark
    @RequestMapping("page")
    public String toFile() {
        return "filepage";
    }

    @PostMapping("es")
    public String getesfile(MultipartFile[] esfile, Model model) {

        int fileName = esfile.length;
        model.addAttribute("filename", fileName);
        System.out.println(fileName);
        return "filepage";
    }
}
