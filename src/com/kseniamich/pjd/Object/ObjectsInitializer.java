package com.kseniamich.pjd.Object;

import com.kseniamich.pjd.cli.CommandLineInterface;
import com.kseniamich.pjd.controller.InterviewQuestionController;
import com.kseniamich.pjd.dao.InterviewQuestionStorage;
import com.kseniamich.pjd.dao.inmemory.InMemoryInterviewQuestionStorage;
import com.kseniamich.pjd.initdata.InitDataLoader;
import com.kseniamich.pjd.service.mappers.InterviewQuestionMapper;
import com.kseniamich.pjd.service.mappers.InterviewQuestionService;

public class ObjectsInitializer {


        private final InterviewQuestionStorage interviewQuestionStorage;
        private final InterviewQuestionMapper interviewQuestionMapper;
        private final InterviewQuestionService interviewQuestionService;
        private final InterviewQuestionController interviewQuestionController;
        private final InitDataLoader initDataLoader;
        private final CommandLineInterface commandLineInterface;

        public ObjectsInitializer() {
            this.interviewQuestionStorage = new InMemoryInterviewQuestionStorage();
            this.interviewQuestionMapper = new InterviewQuestionMapper();
            this.interviewQuestionService = new InterviewQuestionService(
                    interviewQuestionMapper, interviewQuestionStorage);
            this.interviewQuestionController = new InterviewQuestionController(interviewQuestionService);
            this.commandLineInterface = new CommandLineInterface(interviewQuestionController);
            this.initDataLoader = new InitDataLoader(interviewQuestionController);
        }

        public void run() {
            commandLineInterface.run();
        }

    }

