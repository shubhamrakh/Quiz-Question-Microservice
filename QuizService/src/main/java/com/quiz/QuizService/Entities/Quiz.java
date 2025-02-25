package com.quiz.QuizService.Entities;

import java.util.List;



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
@NoArgsConstructor
@AllArgsConstructor
public class Quiz {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column(name = "tittle")
private String tittle;

transient private List<Question> questions;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getTittle() {
	return tittle;
}

public void setTittle(String tittle) {
	this.tittle = tittle;
}

public List<Question> getQuestions() {
	return questions;
}

public void setQuestions(List<Question> questions) {
	this.questions = questions;
}


  

}
