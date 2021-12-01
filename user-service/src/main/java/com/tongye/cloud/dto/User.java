package com.tongye.cloud.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 *
 * <p>
 *
 * @Author zhuhanqing
 * @Date 2021/12/1 10:44
 * @Version 1.0.0
 */
@Getter
@Setter
public class User {
    private Long id;
    private String username;
    private String password;
    private String email;
}
