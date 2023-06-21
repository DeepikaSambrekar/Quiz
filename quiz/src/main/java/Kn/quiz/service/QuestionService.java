package Kn.quiz.service;

import java.util.List;
import java.util.Optional;

import Kn.quiz.model.Question;
import Kn.quiz.repository.QuestionRepository;

public class QuestionService {

    private final QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public Question saveQuestion(Question question) {
        return questionRepository.save(question);
    }

    public Optional<Question> getQuestionById(Long id) {
        return questionRepository.findById(id);
    }

    public List<Question> getQuestionsByTopic(String topic) {
        return questionRepository.findByTopic(topic);
    }

    public void deleteQuestionById(Long id) {
        questionRepository.deleteById(id);
    }
}