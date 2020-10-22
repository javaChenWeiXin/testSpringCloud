package com.cwx.service;

import com.cwx.entity.Student;

import java.util.Collection;

/**
 * @ClassName StudentRepository
 * @Description TODO
 * @author:chenweixin
 * @Date:2020/10/21 9:29
 */
public interface StudentRepository {
    public Collection<Student> findAll();
    public Student findById(long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);
}
