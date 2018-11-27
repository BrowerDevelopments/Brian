package com.example.brower.brian;

public class QuestionLibrary {

    private String mQuestions [] = {
            "The brain uses what percentage of the body's energy?",
            "Which statement is true of grey matter?",
            "What is not a part of the brain?"
    };


    private String mChoices [][] = {
            {"2%", "10%", "20%"},
            {"It is the primary source of intelligence", "It is located mainly in the frontal lobes", "It processes information"},
            {"Cerebellum", "Foramen magnum", "Brain stem"},
    };



    private String mCorrectAnswers[] = {"20%", "It processes information", "Foramen magnum"};




    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

}
