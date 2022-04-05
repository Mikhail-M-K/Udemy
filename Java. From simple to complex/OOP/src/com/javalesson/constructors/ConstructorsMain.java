package com.javalesson.constructors;

import com.javalesson.domainmodel.Employee;

public class ConstructorsMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Alex","developer", 100);
        System.out.println(employee);
    }
}
