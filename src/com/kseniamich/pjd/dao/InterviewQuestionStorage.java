package com.kseniamich.pjd.dao;

import com.kseniamich.pjd.model.InterviewQuestion;

import java.util.List;

public interface InterviewQuestionStorage {

    InterviewQuestion createInterviewQuestion(InterviewQuestion question);

    List<InterviewQuestion> getAll();

    InterviewQuestion creatInterviewQuestion(InterviewQuestion interviewQuestion);
}
