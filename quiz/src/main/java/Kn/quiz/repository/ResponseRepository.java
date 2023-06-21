package Kn.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Kn.quiz.model.Response;

public interface ResponseRepository extends JpaRepository<Response, Long> {
}
