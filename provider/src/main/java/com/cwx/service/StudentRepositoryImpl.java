package com.cwx.service;

import com.cwx.entity.Student;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName StudentRepositoryImpl
 * @Description TODO
 * @author:chenweixin
 * @Date:2020/10/21 9:29
 */
@Service
public class StudentRepositoryImpl implements StudentRepository {

    private Map<Long,Student> studentMap;

    public StudentRepositoryImpl(){
        studentMap = new HashMap<>();
        studentMap.put(1L,new Student(1L,"张三",'男'));
        studentMap.put(2L,new Student(2L,"李四",'女'));
        studentMap.put(3L,new Student(3L,"王五",'男'));
    }

    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
       studentMap.put(student.getId(),student);
    }

    @Override
    public void deleteById(long id) {
       studentMap.remove(id);
    }
}
