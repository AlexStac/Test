package com.example.test.mapper;

import com.example.test.model.Model;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface BatisMapper {


    void insert(Model model);
}
