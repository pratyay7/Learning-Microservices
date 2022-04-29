package com.example.user.service;

import com.example.user.VO.Department;
import com.example.user.VO.ResponseTemplate;
import com.example.user.entity.User;
import com.example.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service

public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;
    public void saveUser(User user) {
        userRepository.save(user);
    }


    public ResponseTemplate getUserWithDepartment(Long userId) {
        ResponseTemplate rt=new ResponseTemplate();
        User user=userRepository.getByUserId(userId);
        Department department=restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/getData/"+user.getDepartmentId()
                ,Department.class);
        rt.setDepartment(department);
        rt.setUser(user);
        return rt;
    }
}
