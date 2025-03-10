package com.kseniamich.pjd.service.mappers;

import com.kseniamich.pjd.dao.InterviewQuestionStorage;
import com.kseniamich.pjd.dto.InterviewQuestionDto;
import com.kseniamich.pjd.model.InterviewQuestion;

import java.util.List;

public class InterviewQuestionService {

    private final InterviewQuestionMapper interviewQuestionMapper;
    private final InterviewQuestionStorage storage;

    public InterviewQuestionService(InterviewQuestionMapper interviewQuestionMapper, InterviewQuestionStorage storage) {
        this.interviewQuestionMapper = interviewQuestionMapper;
        this.storage = storage;
    }

    public InterviewQuestion create(InterviewQuestionDto questionDto) {
        InterviewQuestion interviewQuestion = interviewQuestionMapper.toInterviewQuestion(questionDto);
        return storage.creatInterviewQuestion(interviewQuestion);
    }

    public List<InterviewQuestionDto> getAll() {
        List<InterviewQuestion> questions = storage.getAll();
        return questions.stream()
                .map(interviewQuestionMapper::toInterviewQuestionDto)
                .toList();
    }
}
