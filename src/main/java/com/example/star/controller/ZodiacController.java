package com.example.star.controller;

import com.example.star.dto.UserDTO;
import com.example.star.dto.ZodiacDTO;
import com.example.star.entity.Zodiac;
import com.example.star.service.ZodiacService;
import com.example.star.util.EntityDtoConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
public class ZodiacController {

    @Autowired
    ZodiacService zodiacService;

    @Autowired
    EntityDtoConverter entityDtoConverter;


    @GetMapping("/")
    public String root(){
        return "index";
    }

    @PostMapping("/searchZodiac")
    public String searchZodiac(UserDTO userDTO, Model model){
        String birth = userDTO.getBirth();
        Zodiac zodiac = zodiacService.searchZodiac(birth);//사용자에 해당하는 별자리 검색하여 추출

        ZodiacDTO zodiacDTO = entityDtoConverter.toDTO(zodiac);

        model.addAttribute("user", userDTO);
        model.addAttribute("zodiac", zodiacDTO);
        
        return "result";
    }

    @GetMapping("/allList")
    public String showAllZodiac(Model model) {
        List<Zodiac> list = zodiacService.zodiacAllList();
        model.addAttribute("zodiacList", list);
        return "allList";
    }

}
