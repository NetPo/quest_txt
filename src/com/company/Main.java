package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String an_gm;
        int local_answ, res;
        Scanner scan = new Scanner(System.in);
        String ins;
        ArrayList<Answers> answer = new ArrayList<>();
        answer.add(new Answers("1 - Monster"));
        answer.add(new Answers("2 - Little Dark age"));
        answer.add(new Answers("3 - Glass Hand"));
        answer.add(new Answers("4 - Swimming Pool"));

        Question question1 = new Question("Какой из этих треков принадлежит группе 'Imagine Dragons'?", answer, 1);

        ArrayList<Answers> answer2 = new ArrayList<>();
        answer2.add(new Answers("1 - Meanwhile"));
        answer2.add(new Answers("2 - Plastic beach"));
        answer2.add(new Answers("3 - Demon days"));
        answer2.add(new Answers("4 - Humanz"));

        Question question2 = new Question("Как называается второй студийный альбом 'Gorillaz'?", answer2, 1);

        ArrayList<Answers> answer3 = new ArrayList<>();
        answer3.add(new Answers("1 - Crystal Castles"));
        answer3.add(new Answers("2 - Sidewalks and Skeletons"));
        answer3.add(new Answers("3 - MGMT"));
        answer3.add(new Answers("4 - Mr.Kitty"));

        Question question3 = new Question("Какому исполнителю принадлежит трек 'Goth'?", answer3, 1);

        ArrayList<Answers> answer4 = new ArrayList<>();
        answer4.add(new Answers("1 - 404"));
        answer4.add(new Answers("2 - Ep#2"));
        answer4.add(new Answers("3 - Quo Vadis"));
        answer4.add(new Answers("4 - 505"));

        Question question4 = new Question("Как называется последний выщедший альбом группы 'Электррофорез'?", answer4, 1);

        ArrayList<Answers> answer5 = new ArrayList<>();
        answer5.add(new Answers("1 - 2017"));
        answer5.add(new Answers("2 - 2012"));
        answer5.add(new Answers("3 - 2018"));
        answer5.add(new Answers("4 - 2010"));

        Question question5 = new Question("В каком году вышел альбом 'Этажи' группы 'Молчат Дома'?", answer5, 1);

        ArrayList<Question> questions = new ArrayList<>();
        questions.add(question1);
        questions.add(question2);
        questions.add(question3);
        questions.add(question4);
        questions.add(question5);

        res = 0;
        System.out.println("Хочешь поиграть?");
        an_gm = scan.nextLine();
        if (an_gm.equals("Да")){
            Game game1 = new Game(questions);
            while(true){
                System.out.println(questions.get(0));
                System.out.println(answer.get(0));
                System.out.println(answer.get(1));
                System.out.println(answer.get(2));
                System.out.println(answer.get(3));
                local_answ = scan.nextInt();
                if (local_answ == 1){
                    System.out.println("Ура, ты угадал!");
                    res += question1.getPoints();
                } else {
                    System.out.println("О нет, ты ошибся! \n " +
                            "Правильный ответ - 'Monster'. Данный трек был выпущен группой 'Imagine dragons' в 2013 году \n" +
                            "'Little Dark age' - 'MGMT', 'Glass Hand' - 'Vundabar', 'Swimming Pool' - 'Marie Madeleine'");
                }
                System.out.println(questions.get(1));
                System.out.println(answer2.get(0));
                System.out.println(answer2.get(1));
                System.out.println(answer2.get(2));
                System.out.println(answer2.get(3));
                local_answ = scan.nextInt();
                if (local_answ == 3){
                    System.out.println("Ура, ты угадал!");
                    res += question2.getPoints();
                } else {
                    System.out.println("Дружище, ты не угадал!\n Правильный ответ - 'Demon days'. 'Meanwhile' - последний альбом, 'Plastic beach' - третий альбом" +
                            ", 'Humanz' - пятый альбом");
                }
                System.out.println(questions.get(2));
                System.out.println(answer3.get(0));
                System.out.println(answer3.get(1));
                System.out.println(answer3.get(2));
                System.out.println(answer3.get(3));
                local_answ = scan.nextInt();
                if (local_answ == 2){
                    System.out.println("Великолепно, правильно! Это один из моих любимых исполнителей, кстати!)" +
                            " Хотя мой самый любимый исполнитель - это 'Mr.Kitty'");
                    res += question3.getPoints();
                } else {
                    System.out.println("Ошибка! Правильный ответ был 'Sidewalks and Skeletons'!");
                }
                System.out.println(questions.get(3));
                System.out.println(answer4.get(0));
                System.out.println(answer4.get(1));
                System.out.println(answer4.get(2));
                System.out.println(answer4.get(3));
                local_answ = scan.nextInt();
                if (local_answ == 4){
                    System.out.println("Чудесно, ты угадал!");
                    res += question4.getPoints();
                } else {
                    System.out.println("Да, этот вопрос был не из лёгких!.. Правильный ответ - '505'!\n" +
                            "Альбома '404' никогда и не существовало, хехе! 'Ep#2' был выпущен в 2013, а 'Quo Vadis' - в 2017");
                }
                System.out.println(questions.get(4));
                System.out.println(answer5.get(0));
                System.out.println(answer5.get(1));
                System.out.println(answer5.get(2));
                System.out.println(answer5.get(3));
                local_answ = scan.nextInt();
                if (local_answ == 3){
                    System.out.println("Последний вопрос, и ты его отгадал!!!");
                    res += question5.getPoints();
                } else {
                    System.out.println("Эх-эх, ну и ладно! Правильный ответ - 2018 год!\n");
                }
                System.out.println("Ого, из 5 очков ты набрал целых" + res + "!");
                break;
            }
        } else{
            System.out.println("Ну и ладно!");
        }
    }
}