package com.klyucherov.collectionsvarietyofimplementations.controllers;

import com.klyucherov.collectionsvarietyofimplementations.controllers.dto.ResponseDto;
import com.klyucherov.collectionsvarietyofimplementations.model.Employee;
import com.klyucherov.collectionsvarietyofimplementations.service.EmployeeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
@Tag(name = "API по работе с сотрудниками", description = "журнал сотрудников")
public class EmployeeControllers {

    private final EmployeeService employeeService;


    @PostMapping
    @Operation(summary = "добавление сотрудника")
    public ResponseEntity<ResponseDto> addPerson(@RequestBody Employee employee) {
        employeeService.add(employee);
        return ResponseEntity.ok(new ResponseDto("сотрудник успешно добавлен."));
    }

    @GetMapping
    @Operation(summary = "поиск сотрудника")
    public ResponseEntity<ResponseDto> searchPerson(@RequestParam String passport) {
        employeeService.search(passport);
        return ResponseEntity.ok(new ResponseDto(" сотрудник найден."));
    }

    @PutMapping
    @Operation(summary = "удаление сотрудника")
    public ResponseEntity<ResponseDto> deletionsPerson(@RequestBody Employee employee) {
        employeeService.deletions(employee);
        return ResponseEntity.ok(new ResponseDto("сотрудник успешно удалён."));
    }


}