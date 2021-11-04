package com.company.lab2.Task2;

public class Task2 {
    public static void main(final String[] args) {


        final StackUsingLinkedlist obj = new StackUsingLinkedlist();

        obj.push(11);
        obj.push(22);
        obj.push(33);
        obj.push(44);

        obj.display();

        System.out.printf("\nTop element is %d\n", obj.peek());

        obj.pop();
        obj.pop();

        obj.display();

        System.out.printf("\nTop element is %d\n", obj.peek());

    }
}

