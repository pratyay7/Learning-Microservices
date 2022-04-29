package com.example.dependency.dependency.service.repository;

import com.example.dependency.dependency.service.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {


    Department findByDepartmentId(Long departmentId);
}
