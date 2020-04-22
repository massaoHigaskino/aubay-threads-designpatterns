package com.designsall.alldesigntogether.dto;

import lombok.Getter;
import lombok.Setter;


public class LoginDTO extends TokenDto {

    @Getter
    @Setter
    private String login;

    @Getter
    @Setter
    private String password;

}
