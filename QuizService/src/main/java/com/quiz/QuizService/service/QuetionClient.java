package com.quiz.QuizService.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.quiz.QuizService.Entities.Question;

@FeignClient(url="http://localhost:8086", value="Question-Client")
public interface QuetionClient {
	
	@GetMapping("/question/quiz/{quizId}")
	List<Question> getQuestionsOfQuiz(@PathVariable Long quizId);

}
