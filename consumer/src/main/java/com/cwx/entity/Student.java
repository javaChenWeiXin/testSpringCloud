package com.cwx.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Student
 * @Description TODO
 * @author:chenweixin
 * @Date:2020/10/21 11:44
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private long id;
    private String name;
    private char gender;
}