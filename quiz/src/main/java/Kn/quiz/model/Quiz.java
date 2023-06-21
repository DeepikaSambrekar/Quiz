package Kn.quiz.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "quiztable")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Quiz {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    private String topic;
    private int difficultyRank;
    private List<Response> responses;

    public Quiz(Long id) {
        this.id = id;
    }

}
