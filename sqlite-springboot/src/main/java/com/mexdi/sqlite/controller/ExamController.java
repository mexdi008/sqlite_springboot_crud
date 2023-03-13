package com.mexdi.sqlite.controller;

import com.mexdi.sqlite.entity.Exam;
import com.mexdi.sqlite.service.ExamService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/exam")
public class ExamController {

	private final ExamService examService;

	public ExamController(ExamService examService) {
		this.examService = examService;
	}

	@PostMapping("/save")
	public Exam saveExam(@RequestBody Exam exam) {
		return examService.addQuestion(exam);
	}

	@GetMapping("/All")
	public List<Exam> listAllQuestions() {
		return examService.getQuestions();
	}

	@GetMapping("/getQuestionById/{id}")
	public Exam getQuestionById(@PathVariable Long id) {
		return examService.getQuestionById(id);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteQuestion(@PathVariable Long id) {
		examService.deleteQuestion(id);
		return "Question " + id + " Successfully Deleted";
	}

	@PutMapping("/update")
	public Exam updateQuestion(@RequestBody Exam exam) {
		return examService.updateProduct(exam);
	}
}
