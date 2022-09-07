import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class User {
    private String name;
    private String email;
    private String password;
    private String role;   // user - test topshiririshi va natijalarini ko'rishi mumkin, admin - test qo'shishi mumkin
}
