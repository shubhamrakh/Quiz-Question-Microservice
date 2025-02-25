package com.question.QuestionServices.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Question {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)	
private Long id;

@Column(name = "question")
private String question;

@Column(name = "quizId")
private Long quizId;

public Long getQuizId() {
	return quizId;
}

public void setQuizId(Long quizId) {
	this.quizId = quizId;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getQuestion() {
	return question;
}

public void setQuestion(String question) {
	this.question = question;
}


	
}
