package model;

import lombok.*;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 9/18/2022
 * Time: 5:50 PM
 */

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
