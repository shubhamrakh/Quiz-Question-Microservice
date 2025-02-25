package com.question.QuestionServices.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.question.QuestionServices.Entities.Question;
import com.question.QuestionServices.Service.QuestionService;


@RestController
@RequestMapping("/question")
public class QuestionController {

	public QuestionService questionService;

	public QuestionController(QuestionService questionService) {
		this.questionService = questionService;
	}

	// To add single question
	@PostMapping()
	public Question create(@RequestBody Question question) {

		return questionService.add(question);
	}

	@GetMapping()
	public List<Question> getList() {

		return questionService.get();
	}

	@GetMapping("/{id}")
	public Question getOne(@PathVariable Long id) {

		return questionService.get(id);
	}
	
	@GetMapping("/quiz/{quizId}")
	public List<Question> getQuestionOfQuiz(@PathVariable Long quizId) {

		return questionService.getQuestionOfQuiz(quizId);
	}
}
