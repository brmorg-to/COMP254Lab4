package com.exercise1.bruno.morgado;

public class App {
    public static void main(String[] args) {
       LinkedPositionalList<String> positionalNames = new LinkedPositionalList<>();

       Position<String> bruno = positionalNames.addFirst("Bruno");
       Position<String> sissa =positionalNames.addAfter(bruno, "Sissa");
       Position<String> lucas =positionalNames.addFirst("Lucas");
       Position<String> leonardo =positionalNames.addBefore(lucas,"Leonardo");
       Position<String> carolina =positionalNames.addFirst("Carolina");
       Position<String> francisco =positionalNames.addFirst("Francisco");
       Position<String> edina =positionalNames.addFirst("Edina");
       Position<String> jose =positionalNames.addFirst("Jose");
       Position<String> alvina =positionalNames.addFirst("Alvina");
       Position<String> joe =positionalNames.addFirst("Joe");
       Position<String> jair =positionalNames.addFirst("Jair");


       System.out.println("\nThe index of the element stored at first position = " + positionalNames.indexOf(positionalNames.first()));
       System.out.println("\nThe index of the element francisco = " + positionalNames.indexOf(francisco));
       System.out.println("\nThe index of the element lucas = " + positionalNames.indexOf(lucas));
       System.out.println("\nThe index of the element leonardo = " + positionalNames.indexOf(leonardo));
       System.out.println("\nThe index of the element sissa = " + positionalNames.indexOf(sissa));
       System.out.println("\nThe index of the element stored at last position = " + positionalNames.indexOf(positionalNames.last()));

       System.out.println(carolina);

    }
}
