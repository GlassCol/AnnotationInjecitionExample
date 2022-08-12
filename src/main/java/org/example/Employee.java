package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Component
public class Employee {
    @Value("111111")
    private int id;
    @Value("Employee")
    private String name;
    @Autowired
    private List<Phone> ph;
    @Autowired
    private Address add;

    public void setPh(List<Phone> ph) {
        this.ph = ph;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "\nid - " + id +
                ",\nname - '" + name + '\'' +
                ",\nphones - " + ph +
                ",\naddress - " + add.toString() + "\n" +
                '}';
    }
}
