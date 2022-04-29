package com.example.dependency.dependency.service.controller;

import com.example.dependency.dependency.service.entity.Department;
import com.example.dependency.dependency.service.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/save")
    public Map<String,Department> saveDepartment(@RequestBody Department department){
        departmentService.saveDepartment(department);
        Map<String,Department> resultMap=new HashMap<>();
        resultMap.put("Department Created",department);
        log.info("Inside /save controller: "+department);
        return resultMap;
    }

    @GetMapping("/getData/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId){
        log.info("finding department based on department id: "+ departmentId);
        return departmentService.getDepartment(departmentId);
    }

}
