package com.green.smartGrade.security.sign.model;

import lombok.Data;

@Data
public class UpdForgetPasswordDto {
    private String uid;
    private String upw;
    private String role;
}
