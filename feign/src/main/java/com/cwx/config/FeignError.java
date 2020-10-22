package com.cwx.config;

import com.cwx.entity.Student;
import com.cwx.service.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @ClassName FeignError
 * @Description TODO
 * @author:chenweixin
 * @Date:2020/10/21 15:48
 */
@Component
public class FeignError implements FeignProviderClient {
    @Override
    public String index() {
        return "服务器维护中....";
    }

    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public Student findById(long id) {
        return null;
    }

    @Override
    public void save(Student student) {

    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void deleteById(long id) {

    }
}
