package com.question.QuestionServices.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.question.QuestionServices.Entities.Question;


public interface QuestionService {
	
	Question add(Question question);// to add single question
	
	List<Question> get(); //To retrieve list of question
	
	Question get(Long id);//To retrieve single question

	List<Question> getQuestionOfQuiz(Long quizId);
}
