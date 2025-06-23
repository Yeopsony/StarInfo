package com.example.star.service;

import com.example.star.dto.ZodiacDTO;
import com.example.star.entity.Zodiac;
import com.example.star.repository.ZodiacRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZodiacService {

    @Autowired
    ZodiacRepository zodiacRepository;

    public Zodiac searchZodiac(String birth){
        String mmdd = birth.substring(5);

        Zodiac zodiac = zodiacRepository.findByBirth(mmdd);
        return zodiac;
    }

    public List<Zodiac> zodiacAllList(){
        return zodiacRepository.findAll();
    }


}
