package com.org.cts.service;

import com.org.cts.model.Employee;
import com.org.cts.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void createEmployeeRecords(Employee e) {
        employeeRepository.save(e);
    }
}
