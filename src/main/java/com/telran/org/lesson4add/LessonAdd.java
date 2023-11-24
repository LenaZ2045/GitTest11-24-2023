package com.telran.org.lesson4add;

import com.telran.org.lesson4.Parent;
import com.telran.org.lesson4.ParentMiddleChild;

public class LessonAdd {
    public static void main(String[] args) {
        Parent parent;
        parent = new ParentMiddleChild();
        parent.printGreetings();
        parent.printThanks(); // no ne mojem vazvat method printWishes as it is protected
        // i ne dostypno pole protected name
    }

}
