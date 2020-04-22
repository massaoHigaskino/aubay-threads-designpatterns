package com.designsall.alldesigntogether.controller;

import com.designsall.alldesigntogether.entity.User;
import com.designsall.alldesigntogether.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class BaseHandler {

    @Autowired
    private LoginRepository loginRepository;

    public Boolean validarToken(String token) {
        User utilizador = loginRepository.findByToken(token);
        return Objects.nonNull(utilizador);
    }
}
