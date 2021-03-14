package com.lionhuynh.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/owners")
public class OwnerController {

    @RequestMapping("/find")
    public String getOwners(){
        return "notimplemented";
    }
}
