package com.company.lab2.Task4;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task4
{
    public static void main(final String[] args) {
        final Subject physics = new Subject(1L,"Physics");
        final Subject english = new Subject(2L,"English");
        final Subject math = new Subject(3L,"Mathematics");

        final Set<Subject> subjects = new HashSet<Subject>(Arrays.asList(
                physics,
                english,
                math
        ));

        final ListStudents listStudents = new ListStudents (subjects, new Student[] {
                new Student (13L, "Duu", "Diii", 19, new HashSet<Mark>(Arrays.asList(
                        new Mark(3,75, physics),
                        new Mark (4,80, english),
                        new Mark(5,90, math)
                ))),
                new Student (14L, "Hanyn", "Maks", 19, new HashSet<Mark>(Arrays.asList(
                        new Mark(6,91, physics),
                        new Mark (5,100, english),
                        new Mark(9,92, math)
                ))),
                new Student (15L, "Q", "Tetris",30, new HashSet<Mark>(Arrays.asList(
                        new Mark(11,91, physics),
                        new Mark (12,92, english),
                        new Mark(13,93, math)
                )))
        });

        System.out.println(listStudents);

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        listStudents.addSubjectAndMarks (new Subject(4L,"Application programming"), Map.of(
                14L, 81,
                13L, 92,
                15L, 93) );


        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\nAfter add subject: ");
        System.out.println(listStudents);

        System.out.println("\nThe best student: ");
        System.out.println(listStudents.getTheBestMarksInStudent ());

        listStudents.getSearchStudentById (13L);
        final Subject subjectAdd = new Subject (5L,"OOP");
        listStudents.addSubject (subjectAdd);
        System.out.println("\nMark student`s math: ");
        for (final var entries : listStudents.getMarkForTheSubjectStudents (math).entrySet())
            System.out.println(entries.getKey() + ":" + entries.getValue ());

    }
}
