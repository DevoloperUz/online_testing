package model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserAnswer {
    private Long id;
    private User user;
    private Answer answer;
    private Question question;
    private Subject subject;

}
