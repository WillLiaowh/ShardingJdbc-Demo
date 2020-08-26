package com.example.demo.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.Course;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Repository;

import java.io.InputStream;

@Repository
public interface CourseMapper extends BaseMapper<Course> {


}
