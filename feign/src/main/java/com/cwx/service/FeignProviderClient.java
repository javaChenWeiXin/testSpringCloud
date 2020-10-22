package com.cwx.service;

import com.cwx.config.FeignError;
import com.cwx.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @ClassName FeignProviderClient
 * @Description TODO
 * @author:chenweixin
 * @Date:2020/10/21 15:21
 */
@FeignClient(value = "provider",fallback = FeignError.class)
public interface FeignProviderClient {
    @GetMapping("/student/index")
    public String index();

    @GetMapping("/student/findAll")
    public Collection<Student> findAll();

    @GetMapping("/student/findById/{id}")
    public Student findById(@PathVariable("id") long id);

    @PostMapping("/student/save")
    public void save(@RequestBody Student student);

    @PutMapping("/student/update")
    public void update(@RequestBody Student student);

    @DeleteMapping("/student/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id);
}
