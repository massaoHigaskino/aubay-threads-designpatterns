package com.designsall.alldesigntogether.controller;

import com.designsall.alldesigntogether.dto.LoginDTO;
import com.designsall.alldesigntogether.entity.User;
import com.designsall.alldesigntogether.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginHandler {

    @Autowired
    private LoginRepository loginRepository;

    @PostMapping("/login")
    public String login(@RequestBody LoginDTO loginDto) {
        User utilizador = loginRepository.findByLoginAndPasswd(loginDto.getLogin(), loginDto.getPassword());
        return utilizador.getToken();
    }
}
