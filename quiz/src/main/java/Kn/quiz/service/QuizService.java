package Kn.quiz.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import Kn.quiz.model.Quiz;
import Kn.quiz.repository.QuizRepository;

@Service
public class QuizService {
private final QuizRepository quizRepository;

    public QuizService(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    public Quiz saveQuiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    public Optional<Quiz> getQuizById(Long id) {
        return quizRepository.findById(id);
    }

    public List<Quiz> getAllQuizzes() {
        return quizRepository.findAll();
    }

    public void deleteQuizById(Long id) {
        quizRepository.deleteById(id);
    }
}
