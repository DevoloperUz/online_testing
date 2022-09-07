import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Question {
    private Integer id;
    private String text;
    private List<Answer> answerList;
    private boolean check;
    private String userAnswer;
}
