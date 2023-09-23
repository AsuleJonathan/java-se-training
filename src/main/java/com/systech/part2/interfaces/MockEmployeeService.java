package com.systech.part2.interfaces;

import com.systech.part2.accessmodifiers.Employee;

public class MockEmployeeService implements EmployeeService {

    @Override
    public Employee createEmployee(Employee employee) {
        return employee;
    }

}
