package com.place.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/places")
public class SpaceController {

    @GetMapping
    public String space(){
        return "place/placeList";
    }

    @GetMapping("/write")
    public String spaceWriteForm(){
        return "place/placeView";
    }

    @PostMapping("/write")
    public String spaceWirte(){
        return "redirect:/places";
    }

    @GetMapping("/put")
    public String spaceUpdateForm(){
        return "place/placeView";
    }

    @PostMapping("/put")
    public String spaceUpdate(){
        return "redirect:/places";
    }


    @PostMapping("/delete")
    public String spaceDeleteForm(){
        return "redirect:/places";
    }



}
