package com.jack.csci1660.exercise10;

/*
Create a class to store contact information consisting of a name and email address. Additionally, create a class to
store a collection of contacts that implements the Iterable interface so that a for-each loop can be used with the the
collection class.
Demonstrate this functionality with a for-each loop in the Main.main() method that displays contact information.
 */

public class Main {

    public static void main(String[] args) {
        ContactCollection clist = new ContactCollection();
        clist.add(new Contact("First", "one@email.com"));
        clist.add(new Contact("Second", "two@email.com"));
        clist.add(new Contact("Third", "three@email.com"));
        clist.add(new Contact("Fourth", "four@email.com"));
        clist.add(new Contact("Fifth", "five@email.com"));

        for (Contact c: clist) {
            System.out.println(c.toString() + "\n");
        }
    }
}
