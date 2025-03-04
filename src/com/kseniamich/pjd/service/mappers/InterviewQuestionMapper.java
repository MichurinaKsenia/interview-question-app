package com.kseniamich.pjd.service.mappers;

import com.kseniamich.pjd.dto.InterviewQuestionDto;
import com.kseniamich.pjd.model.InterviewQuestion;

public class InterviewQuestionMapper {

    public InterviewQuestion toInterviewQuestion(InterviewQuestionDto interviewQuestionDto) {
        return new InterviewQuestion(interviewQuestionDto.getQuestion(), interviewQuestionDto.getAnswer());
    }

    public InterviewQuestionDto toInterviewQuestionDto(InterviewQuestion interviewQuestion) {
        return new InterviewQuestionDto(
                interviewQuestion.getId(),
                interviewQuestion.getQuestion(),
                interviewQuestion.getAnswer()
        );
    }
}
