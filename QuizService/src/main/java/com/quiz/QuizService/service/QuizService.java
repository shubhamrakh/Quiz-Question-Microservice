package com.quiz.QuizService.service;

import java.util.List;

import com.quiz.QuizService.Entities.Quiz;

public interface QuizService {

Quiz add(Quiz quiz);// to add single quiz 

List<Quiz> get(); //To retrieve list of quiz


Quiz get(Long id);//To retrieve single quiz


	
}
