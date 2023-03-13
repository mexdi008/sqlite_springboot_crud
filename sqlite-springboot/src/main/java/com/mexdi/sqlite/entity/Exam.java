package com.mexdi.sqlite.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Slf4j
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Exam")
public class Exam {
	@javax.persistence.Id
	@GeneratedValue
	@Column(nullable = false)
	private long Id;
	private String question;
	private String answer1;
	private String answer2;
	private String answer3;
	private String true_answer;

}
