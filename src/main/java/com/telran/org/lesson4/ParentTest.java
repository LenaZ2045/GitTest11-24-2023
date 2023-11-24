package com.telran.org.lesson4;

public class ParentTest {
    public static void main(String[] args) {
        Parent childOne = ChildOne.create();
        Parent childTwo = new ChildTwo();

        childOne.printGreetings(); // esli zacommentirovat to vizovetsya method that in parent but nto in child one (dynamic vipolnenie vremeni polimarfizm)
        childTwo.printGreetings();

        Parent parent = new ParentMiddleChild();
        parent.printGreetings();
        parent.printThanks();
        parent.name = "Oleg";

        ChildTwo childTwo1 = new ChildTwo();
        childTwo1.printAll();


        System.out.println(ChildTwo.HELLO);

        // example for same but next sposob as objet create - Parent parent: parent - new ChildOne(); parent.printGreetings(); parent = new ChildTwo(); parent.printGreetings();
    }
}
