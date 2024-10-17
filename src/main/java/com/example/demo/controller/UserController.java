package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;

import org.eclipse.tags.shaded.org.apache.xpath.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController{

    private final UserService userService;

   public UserController(UserService userService) {
      this.userService = userService;
   }

    @RequestMapping("/admin/user")
    public String getHomePage(Model model){ //Model là 1 interface trong MVC để truyền dữ liệu giữa Controller và View
        String test = this.userService.handleHello();
        model.addAttribute("newUser", new User());
        return "admin/user/create";
    }

   @RequestMapping(value = "/admin/user/create1", method = RequestMethod.POST)
    public String getUserPage(Model model, @ModelAttribute("newUser") User bxt){
       System.out.println(bxt);
       return "hello";
   }

}

//@RestController
//public class UserController {
//
//    private final UserService userService;
//
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//
//    @GetMapping("/")
//    public String getHomePage() {
//        return this.userService.handleHello();
//    }
//}
