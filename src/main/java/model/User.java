package model;

import lombok.*;
import model.enums.RoleEnum;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private String email;
    private String password;
    private RoleEnum role;
}
