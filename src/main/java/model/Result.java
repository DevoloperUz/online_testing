package model;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    private Long id;
    private User user;
    private Subject subject;
    private Double score;
    private LocalDateTime localDateTime;

}
