package com.kseniamich.pjd.controller;

import com.kseniamich.pjd.dto.InterviewQuestionDto;
import com.kseniamich.pjd.model.InterviewQuestion;
import com.kseniamich.pjd.service.mappers.InterviewQuestionService;

import java.util.List;

public class InterviewQuestionController {

    private final InterviewQuestionService service;

    public InterviewQuestionController(InterviewQuestionService service) {
        this.service = service;
    }

    public InterviewQuestion createInterviewQuestion(InterviewQuestionDto questionDto) {
        return service.create(questionDto);
    }

    public List<InterviewQuestionDto> getAllInterviewQuestions() {
        return service.getAll();
    }
}


