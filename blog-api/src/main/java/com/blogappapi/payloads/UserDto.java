package com.blogappapi.payloads;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserDto {

    private int id;
    @NotEmpty
    @Size(min = 4,message = "Username must be of character 4 !!")
    private String name;
    @Email(message = "Email adress is not valid !!")
    private String email;

    @NotEmpty
    @Size(min = 4,max = 10,message = "password must be minimum of 4 char and max of 10 !!")
    private String password;

    @NotEmpty
    private String about;

}

