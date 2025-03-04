package com.kseniamich.pjd.dto;

import java.util.Objects;

public class InterviewQuestionDto {
    Long id;
    String question;
    String answer;

    public InterviewQuestionDto() {

    }

    public InterviewQuestionDto(Long id, String question, String answer) {
        this.id = id;
        this.question = question;
        this.answer = answer;
    }
    public InterviewQuestionDto(String question, String answer){
    this ( null, question, answer);
    }

    public Long getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InterviewQuestionDto that = (InterviewQuestionDto) o;
        return Objects.equals(id, that.id) && Objects.equals(question, that.question) && Objects.equals(answer, that.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, question, answer);
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }
}
