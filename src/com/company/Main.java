package com.company;

import com.company.models.Options;
import com.company.models.Questions;
import com.company.models.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        Questions[] questions = new Questions[]{
                new Questions(1, "Что такое Java", new Options[]{
                        new Options(1, "Это язык программирвания", 1),
                        new Options(2, "Не язык программирвания", 0),
                        new Options(3, "Англис язык программирвания", 0),
                        new Options(4, "Русский язык программирвания", 0),
                }),

                new Questions(2, "Что такое C#?", new Options[]{
                        new Options(1, "Язык разработки", 1),
                        new Options(2, "Не знаю", 0),
                        new Options(3, "Игрвой язык", 0),
                        new Options(4, "Немецкий язык", 0)
                }),
                new Questions(2, "Что такое C#?", new Options[]{
                        new Options(1, "Язык разработки", 1),
                        new Options(2, "Не знаю", 0),
                        new Options(3, "Игрвой язык", 0),
                        new Options(4, "Немецкий язык", 0)
                }),

                new Questions(3, "Что такое Python?", new Options[]{
                        new Options(1, "Язык разработки", 1),
                        new Options(2, "Змея", 0),
                        new Options(3, "Язык змей", 0),
                        new Options(4, "Немецкий язык", 0)
                }),

        };

        Test[] acceptTest = {new Test(1, questions, "Exam", "12.02.2021", "Языки программирования")};

//foreach печать
        Arrays.stream(acceptTest)
                .forEach(show -> System.out.println(show.getId() + "\n" + show.getTestName() + "\n" + show.getTestType() + "\n" + show.getCreateDate()));


//filter найти все правильные ответы
        Arrays.stream(questions)
                .filter(questions1 -> questions1.getOptions().getKey() == 1)
                .forEach(s -> System.out.println(s.getId() + " \n" + s.getQuestion() + " \n" + s.getOptions()));

        //limit,
        Arrays.stream(questions)
                .limit(2)
                .forEach(s -> System.out.println(s));

        //sorted сортировка по id
        List<Questions> questions1 = Arrays.stream(questions)
                .sorted(Comparator.comparingInt(Questions::getId)).collect(Collectors.toList());
        System.out.println(questions1);


        //max найти самый длинный вопрос
        Questions maxLengQues = Arrays.stream(questions)
                .max(Comparator.comparing(Questions::getQuestion)).get();
        System.out.println(maxLengQues);


        //max найти самый короткий вопрос
        Questions minLengQues = Arrays.stream(questions)
                .min(Comparator.comparing(Questions::getQuestion)).get();
        System.out.println(minLengQues);


        //map плюсить 2 для каждого айди
        Arrays.stream(questions)
                .map(Questions::getId)
                .mapToInt(s -> s + 2)
                .forEach(show -> System.out.println(show));
        //flatMap найти вопрос с  словом java

        Arrays.stream(questions)
                .flatMap(p -> Stream.of(String.format(p.getQuestion())))
                .filter(s -> s.contains("Java"))
                .forEach(f -> System.out.println(f));

        //limit
        Arrays.stream(questions)
                .limit(2)
                .forEach(s -> System.out.println(s));

        //skip

        Arrays.stream(questions)
                .skip(2)
                .forEach(s -> System.out.println(s));
        //distinct
        System.out.println("distinct-----");
        Arrays.stream(questions)
                .distinct()
                .forEach(s-> System.out.println(s));
        //peek
        System.out.println("Peek");
        Arrays.stream(questions)
                .peek(s -> System.out.println(s.getQuestion()+" peeked"))
                .forEach(s-> System.out.println(s.getQuestion()));
        //count
        long counter =  Arrays.stream(questions).count();
        System.out.println(counter);

        //anyMatch

        boolean isTrue = Arrays.stream(questions)
                .anyMatch(s-> s.getOptions().getKey()== 1);
        System.out.println(isTrue);

        ///allMatch,
        boolean isJava = Arrays.stream(questions)
                .allMatch(s-> s.getQuestion().contains("Java"));
        System.out.println(isJava);
        // noneMatch
        boolean isAllPython = Arrays.stream(questions)
                .noneMatch(s-> s.getQuestion().contains("Pon"));
        System.out.println(isAllPython);



    }
}
