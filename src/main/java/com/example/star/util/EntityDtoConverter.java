package com.example.star.util;


import com.example.star.dto.ZodiacDTO;
import com.example.star.entity.Zodiac;
import org.springframework.stereotype.Component;

@Component
public class EntityDtoConverter {

    public Zodiac toEntity(ZodiacDTO zodiacDTO){
        Zodiac zodiac = new Zodiac();

        zodiac.setName(zodiacDTO.getName());
        zodiac.setContent(zodiacDTO.getContent());
        zodiac.setStartdate(zodiac.getStartdate());
        zodiac.setEnddate(zodiac.getEnddate());

        return zodiac;
    }

    public ZodiacDTO toDTO(Zodiac zodiac){
        ZodiacDTO zodiacDTO = new ZodiacDTO();

        zodiacDTO.setNum(zodiac.getNum());
        zodiacDTO.setName(zodiac.getName());
        zodiacDTO.setContent(zodiac.getContent());
        zodiacDTO.setStartdate(zodiac.getStartdate());
        zodiacDTO.setEnddate(zodiac.getEnddate());

        return zodiacDTO;
    }
}
