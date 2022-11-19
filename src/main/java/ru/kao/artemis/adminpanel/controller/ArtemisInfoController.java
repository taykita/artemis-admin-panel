package ru.kao.artemis.adminpanel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.kao.artemis.adminpanel.config.AdminPanelProperties;

@RestController()
@RequestMapping("/artemis")
public class ArtemisInfoController {

    @Autowired
    public ArtemisInfoController(AdminPanelProperties adminPanelProperties) {
        this.adminPanelProperties = adminPanelProperties;
    }

    private final AdminPanelProperties adminPanelProperties;

    @GetMapping("/url")
    public String getUrl() {
        return adminPanelProperties.getCfProps().getUrl();
    }
}
