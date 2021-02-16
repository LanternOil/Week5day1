package com.company.dahms;

import javax.jnlp.PersistenceService;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Person person1= new Person("George",18);
        Person person2= new Person("Lily",16);

        System.out.println( person1.toString());
        System.out.println(person2.toString());

        Book book1 = new Book("Goosebumps","R.L. Stine","Thriller", 100);
        System.out.println(book1.toString());

        person1.read(book1);
    }
}
