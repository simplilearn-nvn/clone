package com.org.cts.controller;


import com.org.cts.model.Employee;
import com.org.cts.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeController {


    @Autowired
    EmployeeService employeeService;

    @PostMapping("/create")
    public void createEmployeeRecord(@RequestBody Employee employee){
        employeeService.createEmployeeRecords(employee);
    }
}
