package ru.kao.artemis.adminpanel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ru.kao.artemis.adminpanel.config.AdminPanelProperties;

@Controller
public class MainPanelController {

    @GetMapping("/main")
    public String mainPage() {
        return "main";
    }
}
