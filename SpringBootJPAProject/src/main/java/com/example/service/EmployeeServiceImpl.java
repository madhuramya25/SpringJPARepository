package com.example.service;

import com.example.dao.EmployeeDAO;
import com.example.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {



@Autowired
private EmployeeDAO employeeDao;



@Override
public List<Employee> getEmployees() {
return employeeDao.findAll();
}



@Override
public Employee getEmployeeById(long employeeid) {
return employeeDao.getOne(employeeid);
}



@Override
public Employee addEmployee(Employee employee) {
employeeDao.save(employee);
return employee;
}



@Override
public void deleteEmployee(long employeeid) {
Employee obj= employeeDao.getOne(employeeid);
employeeDao.delete(obj);
}



@Override
public Employee updateEmployee(Employee employee) {
employeeDao.save(employee);
return employee;
}


}
