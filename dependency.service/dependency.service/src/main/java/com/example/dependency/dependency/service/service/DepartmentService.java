package com.example.dependency.dependency.service.service;

import com.example.dependency.dependency.service.entity.Department;
import com.example.dependency.dependency.service.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public void saveDepartment(Department department) {
        departmentRepository.save(department);
        log.info("inside Service: "+ department);
        return;
    }

    public Department getDepartment(Long departmentId) {

        return departmentRepository.findByDepartmentId(departmentId);
    }
}
