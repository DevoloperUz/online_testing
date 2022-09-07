import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Answer {
    private String id;
    private String text;
    private boolean status;
}
