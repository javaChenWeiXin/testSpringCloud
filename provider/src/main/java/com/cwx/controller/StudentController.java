package com.cwx.controller;

import com.cwx.entity.Student;
import com.cwx.service.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @ClassName StudentController
 * @Description TODO
 * @author:chenweixin
 * @Date:2020/10/21 9:39
 */
@RequestMapping("/student")
@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;
    @Value("${server.port}")
    private String port;

    @GetMapping("/index")
    public String index(){
        return "当前端口："+this.port;
    }

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return studentRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id){
        return studentRepository.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student){
        studentRepository.saveOrUpdate(student);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student){
        studentRepository.saveOrUpdate(student);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id){
        studentRepository.deleteById(id);
    }
}
