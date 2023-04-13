
package com.klyucherov.collectionsvarietyofimplementations.service.impl;

import com.klyucherov.collectionsvarietyofimplementations.model.Employee;
import com.klyucherov.collectionsvarietyofimplementations.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    Map<String, Employee> employeeMap = new HashMap<>();
    @Override
    public void add(Employee employee) {
        Set<String> person = new HashSet<>();
        person.add(employee.toString());
    }

    @Override
    public void deletions(Employee employee) {
        List<Employee> person = new ArrayList<>();
        person.add(employee);
        for (Employee employees : person) {
            if (employee.equals(employees)) {
                employeeMap.remove(employee.getPassport(), employee);
            }
        }
        throw new RuntimeException("человека с таким номером пасрорта не существует");
    }

    @Override
    public String search(String passport) {
        for (Employee employee : employeeMap.values()){
            if (employee.getPassport().equals(passport)) {
                final String person = employee.getName() + " "
                        + employee.getPassport();
                return person;
            }
        }
        throw new RuntimeException("человека с таким номером пасрорта не существует");
    }
}


