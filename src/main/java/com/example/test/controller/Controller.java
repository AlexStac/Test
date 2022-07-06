package com.example.test.controller;

import com.example.test.mapper.BatisMapper;
import com.example.test.model.Enum;
import com.example.test.model.Model;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private BatisMapper batisMapper;


    @GetMapping("/insert")
    public void addCar() {
        Model model = new Model();
        model.setLonga(123456789L);
        model.setEnumka(Enum.ACCEPTED);
        batisMapper.insert(model);
    }

}
