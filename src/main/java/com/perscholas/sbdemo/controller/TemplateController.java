package com.perscholas.sbdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class TemplateController {
    @GetMapping("/ExampleTwo")
    public String template(Model model){
        String message = "Top 5 Cloud Service Providers";
        // creating a collection
        List<String> list = new ArrayList<>();
        list.add("Amazone Web Services");
        list.add("Microsoft Azure");
        list.add("Google Cloud");
        list.add("Alibaba Cloud");
        list.add("IBM Cloud");

        model.addAttribute("message", message);
        // adding the collection attribute
        model.addAttribute("cloudProvider", list);
        return "CollectionDemo";
    }
}
