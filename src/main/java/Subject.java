import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Subject {
    private Integer id;
    private String name;
    private List<Question> questions;
    private Integer score;
}
