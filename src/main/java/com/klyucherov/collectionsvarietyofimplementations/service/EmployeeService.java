
package com.klyucherov.collectionsvarietyofimplementations.service;

import com.klyucherov.collectionsvarietyofimplementations.model.Employee;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {
    void add(Employee employee);

    void deletions(Employee employee);

    String search(String passport);
}

