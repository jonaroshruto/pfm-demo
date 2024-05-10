package com.example.pfmdemo.controller;

import com.example.pfmdemo.model.User;
import com.example.pfmdemo.service.UserRegService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserRegService userRegService;



        @GetMapping("index")
        public String home(){
            return "index";
        }

        @GetMapping("/login")
        public String loginForm() {
            return "login";
        }

        // handler method to handle user registration request
        @GetMapping("register")
        public String showRegistrationForm(Model model){
            User user = new User();
            model.addAttribute("user", user);
            return "register";
        }


        @PostMapping("/register/save")
        public String registration(@Valid @ModelAttribute("user") User user,
                                   BindingResult result,
                                   Model model){

//            User existing = userService.findByEmailAddress(user.getEmailAddress());
//            if (existing != null) {
//                result.rejectValue("email", null, "There is already an account registered with that email");
//            }
//            if (result.hasErrors()) {
//                model.addAttribute("user", user);
//                return "register";
//            }
            userRegService.saveUser(user);
            return "redirect:/register?success";
        }

//        @GetMapping("/users")
//        public String listRegisteredUsers(Model model){
//            List<User> users = userService.findAllUsers();
//            model.addAttribute("users", users);
//            return "users";

//        }

}
