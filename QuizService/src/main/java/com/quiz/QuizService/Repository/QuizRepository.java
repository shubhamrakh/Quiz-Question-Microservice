package com.quiz.QuizService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.QuizService.Entities.Quiz;

public interface QuizRepository extends JpaRepository<Quiz,Long> {

	
}
