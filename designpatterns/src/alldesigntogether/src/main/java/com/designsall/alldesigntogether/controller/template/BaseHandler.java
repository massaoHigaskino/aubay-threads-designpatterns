package com.designsall.alldesigntogether.controller.template;

import com.designsall.alldesigntogether.dto.TokenDto;
import com.designsall.alldesigntogether.entity.User;
import com.designsall.alldesigntogether.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.Optional;

@Component
public abstract class BaseHandler<InClazz extends TokenDto, OutClazz> {

    @Autowired
    private LoginRepository loginRepository;

    public Boolean validarToken(String token) {
        User utilizador = loginRepository.findByToken(token);
        return Objects.nonNull(utilizador);
    }

    public abstract OutClazz executeBusiness(InClazz dto);

    public OutClazz runHandler(InClazz dto) {
        return Optional.ofNullable(dto).map(inClazz -> validarToken(inClazz.getToken()) ? executeBusiness(inClazz) : null).orElse(null);
    }
}
