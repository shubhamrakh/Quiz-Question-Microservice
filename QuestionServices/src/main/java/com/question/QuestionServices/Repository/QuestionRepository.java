package com.question.QuestionServices.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.question.QuestionServices.Entities.Question;

public interface QuestionRepository extends JpaRepository<Question, Long> {

	List<Question> findByQuizId(Long quizId);
	
	

}
