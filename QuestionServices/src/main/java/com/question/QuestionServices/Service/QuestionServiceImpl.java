package com.question.QuestionServices.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.question.QuestionServices.Entities.Question;
import com.question.QuestionServices.Repository.QuestionRepository;
@Service
public class QuestionServiceImpl implements QuestionService {
	
	private QuestionRepository questionRepository;
	
	public QuestionServiceImpl(QuestionRepository questionRepository) {
		this.questionRepository = questionRepository;
	}
	
	@Override
	public Question add(Question question) {
		
		return  questionRepository.save(question) ;
	}

	@Override
	public List<Question> get() {
		
		return questionRepository.findAll();
	}

	@Override
	public Question get(Long id) {
		
		return questionRepository.findById(id).orElseThrow(() -> new RuntimeException("Question Not Found")) ;
	}

	@Override
	public List<Question> getQuestionOfQuiz(Long quizId) {

		return questionRepository.findByQuizId(quizId);
	}

	
}
