package com.cwx.controller;

import com.cwx.entity.Student;
import com.cwx.service.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @ClassName FeignController
 * @Description TODO
 * @author:chenweixin
 * @Date:2020/10/21 15:25
 */
@RequestMapping("/feign")
@RestController
public class FeignController {
    @Autowired
    private FeignProviderClient feignProviderClient;

    @GetMapping("/index")
    public String index(){
        return feignProviderClient.index();
    }

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return feignProviderClient.findAll();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id){
        return feignProviderClient.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student){
        feignProviderClient.save(student);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student){
        feignProviderClient.update(student);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id){
        feignProviderClient.deleteById(id);
    }
}
