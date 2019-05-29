package cqjtu.bg;

import cqjtu.bg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
   UserService userService;

    @RequestMapping("toIndex")
    public String toIndex() {
        return "index";
    }

    @RequestMapping("toPosting")
    public String toPosting() {
        return "posting";
    }
    @RequestMapping("toTest")
    public String toTest() {
        return "test";
    }

//   点击表白后执行这个方法
    @RequestMapping("postContent")
    public String postContent(){

        userService.posting();
        System.out.println("发表");
        return "index";
    }
}
