package com.example.its.web.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.its.domain.auth.UserService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public String showList(Model model) {
        model.addAttribute("userList", userService.findAll());
        return "users/list";
    }

    @GetMapping("/creationForm")
    public String showCreationForm() {
        return "users/creationForm";
    }
}
