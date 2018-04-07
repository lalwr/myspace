package com.place.controller;

import com.place.vo.SpaceVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/places")
public class SpaceController {

    //테스트위한 임시 리스트
    static List list = new ArrayList();

    @GetMapping
    public String space(ModelMap modelMap){

        if(list.size() == 0){
            for(int i=0; i < 10; i++){
                SpaceVO spaceVO = new SpaceVO();
                spaceVO.setNo(i);
                spaceVO.setName("테스트"+i);
                spaceVO.setSubject("테스트 제목" + i);
                list.add(spaceVO);
            }
        }

        modelMap.addAttribute("list", list);

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
