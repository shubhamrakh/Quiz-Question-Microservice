package com.quiz.QuizService.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;


import com.quiz.QuizService.Entities.Quiz;
import com.quiz.QuizService.Repository.QuizRepository;

@Service
public class QuizServiceImpl implements QuizService {
	
	private QuizRepository quizRepository;
	
	private QuetionClient quetionClient;
	
	
	
	public QuizServiceImpl(QuizRepository quizRepository, QuetionClient quetionClient) {
		super();
		this.quizRepository = quizRepository;
		this.quetionClient = quetionClient;
	}

/*	public QuizServiceImpl(QuizRepository quizRepository) {
		this.quizRepository = quizRepository;
	}*/

	@Override
	public Quiz add(Quiz quiz) {
		// TODO Auto-generated method stub
				
		return quizRepository.save(quiz);
	}

	@Override
	public List<Quiz> get() {
		List<Quiz> quizzes=quizRepository.findAll();
		
		List<Quiz> newQuizList = quizzes.stream().map(quiz -> {
			quiz.setQuestions(quetionClient.getQuestionsOfQuiz(quiz.getId()));
			return quiz;
		}).collect(Collectors.toList());
		
		return newQuizList;
	}

	@Override
	public Quiz get(Long id) {
		// TODO Auto-generated method stub
	Quiz quiz=	quizRepository.findById(id).orElseThrow(() -> new RuntimeException("Quiz Not Found"));
	quiz.setQuestions(quetionClient.getQuestionsOfQuiz(quiz.getId()));	
		return quiz;
	}

	

}
