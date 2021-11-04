package com.company.lab2.Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Task3 {

    public static void main(final String[] args) {
        final Subject ukr = new Subject(1,"Ukraine");
        final Subject math = new Subject(2,"Probability theory");
        final Subject oop = new Subject(3,"OOP");

        final Mark mark1forStudent = new Mark (3,90);
        final Mark mark2forStudent = new Mark (4,91);
        final Mark mark3forStudent = new Mark (5,92);

       final Student student1 = new Student (1,"Maksym","Hanyn",19);
       student1.addMapSubjectAndMark (ukr,mark1forStudent);
       student1.addMapSubjectAndMark (math,mark2forStudent);
       student1.addMapSubjectAndMark (oop,mark3forStudent);
       System.out.println (student1.toString ());

    }

}
