package test;

import algorithm.ExamGenerator;
import beans.Answer;
import beans.Exam;
import beans.Question;
import input.Parser;

public class TestingParser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Parser test = new Parser("D:\\XML_EntryFile.xml");
		ExamGenerator test2 = new ExamGenerator(new Exam(test.getQuestions()), 6);
		for(Exam e :test2.getExams()){
		System.out.println(e.getQuestions());
		}

	}

}
