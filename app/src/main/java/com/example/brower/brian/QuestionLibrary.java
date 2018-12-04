package com.example.brower.brian;

public class QuestionLibrary {

    private String mQuestions [] = {
            "The brain uses what percentage of the body's energy?",//1
            "Which statement is true of grey matter?",//2
            "What is not a part of the brain?",//3
            "What part of the brain stem regulates your heartbeat?",//4
            "What percentage of nuerons do babies lose at birth?",//5
            "How much of your blood does your brain use?",//6
            "Approximately how much does your brain weigh?",//7
            "Approximately how many nuerons are in your brain?", //8
            "How many 'sections' does your brain have?"//9
    };


    private String mChoices [][] = {
            {"2%", "10%", "20%"},//1
            {"It is the primary source of intelligence", "It is located mainly in the frontal lobes", "It processes information"},//2
            {"Cerebellum", "Foramen magnum", "Brain stem"},//3
            {"Pons", "Medulla", "Hypothalamus"},//4
            {"50%", "0%", "75%"},//5
            {"10%", "15%", "20%"},//6
            {"10lb", "1lb", "3lb"},//7
            {"1 billion", "10 billion", "100 billion"},//8
            {"1", "2", "3"}//19
    };


                                          //1        2                          3               4        5        6    7       8               9    10
    private String mCorrectAnswers[] = {"20%", "It processes information", "Foramen magnum", "Medulla", "50%", "20%", "3 lb","100 billion","3"};




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
