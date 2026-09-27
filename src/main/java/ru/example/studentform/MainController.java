package ru.example.studentform;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Главная страница");
        model.addAttribute("data", "Лабораторная работа № 1");
        model.addAttribute("content", "Знакомство со Spring Framework");
        return "main";
    }

    @GetMapping("/about")
    public String about(@RequestParam(name = "name", defaultValue = "Имя автора") String name, Model model) {
        model.addAttribute("title", "Страница автора");
        model.addAttribute("author", name);
        return "about";
    }
}
