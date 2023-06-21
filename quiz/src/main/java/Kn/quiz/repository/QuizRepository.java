package Kn.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Kn.quiz.model.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long>{
    
}