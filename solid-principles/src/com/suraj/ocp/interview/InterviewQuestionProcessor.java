package com.suraj.ocp.interview;

public class InterviewQuestionProcessor {
    // This is a typical implementation of Loosely Coupled systems
    // This class knows nothing about Question and its type
    // This is pure Abstraction
    public static void process(InterviewQuestion question){
        question.execute();
    }
}
