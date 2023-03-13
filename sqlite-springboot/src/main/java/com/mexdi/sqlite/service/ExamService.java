package com.mexdi.sqlite.service;

import com.mexdi.sqlite.entity.Exam;
import com.mexdi.sqlite.repository.ExamRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamService {
	private final ExamRepository examRepository;

	public ExamService(ExamRepository examRepository) {
		this.examRepository = examRepository;
	}

	public Exam addQuestion(Exam exam) {
		return examRepository.save(exam);
	}

	public List<Exam> getQuestions() {
		return examRepository.findAll();
	}

	public Exam getQuestionById(Long id) {
		return examRepository.findById(id).orElse(null);
	}

	public String deleteQuestion(Long id) {
		examRepository.deleteById(id);
		return "Question " + id + " Deleted Successfully";
	}

	public Exam updateProduct(Exam exam) {
		Exam existingProduct = examRepository.findById(exam.getId()).orElse(null);
		existingProduct.setQuestion(exam.getQuestion());
		existingProduct.setAnswer1(exam.getAnswer1());
		existingProduct.setAnswer2(exam.getAnswer2());
		existingProduct.setAnswer3(exam.getAnswer3());
		existingProduct.setTrue_answer(exam.getTrue_answer());

		return examRepository.save(existingProduct);
	}


}

