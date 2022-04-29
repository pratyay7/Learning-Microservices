package com.example.user.VO;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Department {

    private long departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}
