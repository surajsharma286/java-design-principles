package com.suraj.ocp;

import com.suraj.ocp.interview.AIInterviewQuestions;
import com.suraj.ocp.interview.AlgorithmInterviewQuestion;
import com.suraj.ocp.interview.FinanceInterviewQuestion;
import com.suraj.ocp.interview.InterviewQuestionProcessor;
import com.suraj.ocp.sort.InsertionSortingAlgorithm;
import com.suraj.ocp.sort.MergeSortingAlgorithm;
import com.suraj.ocp.sort.SelectionSortingAlgorithm;
import com.suraj.ocp.sort.SortingEngine;

public class App {

    public static void main(String[] args){
        System.out.println("\n ************** Processing Interview Questions **************** \n");
        InterviewQuestionProcessor.process(new FinanceInterviewQuestion());
        InterviewQuestionProcessor.process(new AIInterviewQuestions());
        InterviewQuestionProcessor.process(new AlgorithmInterviewQuestion());

        System.out.println("\n *************** Sorting *************** \n");
        SortingEngine.performSorting(new SelectionSortingAlgorithm());
        SortingEngine.performSorting(new MergeSortingAlgorithm());
        SortingEngine.performSorting(new InsertionSortingAlgorithm());
    }
}
