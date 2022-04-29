package com.example.user.VO;

import com.example.user.entity.User;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ResponseTemplate {

    private User user;
    private Department department;
}
