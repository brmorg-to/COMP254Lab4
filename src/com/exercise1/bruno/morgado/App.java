package com.exercise1.bruno.morgado;

import java.util.NoSuchElementException;

public class App {
    public static void main(String[] args) {
       LinkedPositionalList<String> positionalNames = new LinkedPositionalList<>();

       Position<String> bruno = positionalNames.addFirst("Bruno");
       Position<String> sissa =positionalNames.addFirst("Sissa");
       Position<String> lucas =positionalNames.addFirst("Lucas");
       Position<String> leonardo =positionalNames.addFirst("Leonardo");
       Position<String> carolina =positionalNames.addFirst("Carolina");
       Position<String> francisco =positionalNames.addFirst("Francisco");
       Position<String> edina =positionalNames.addFirst("Edina");
       Position<String> jose =positionalNames.addFirst("Jose");
       Position<String> alvina =positionalNames.addFirst("Alvina");
       Position<String> joe =positionalNames.addFirst("Joe");
       Position<String> jair =positionalNames.addFirst("Jair");

       LinkedPositionalList<String> positionalControl = new LinkedPositionalList<>();
       Position<String> test = positionalControl.addFirst("Test");

       try {
          // Test a position that does not belong to the Positional List
          System.out.println("\nThe index of the element test = " + positionalNames.indexOf(test));
       } catch (NoSuchElementException e) {
          e.printStackTrace();
       }
          System.out.println("\nThe index of the element stored at first position = " + positionalNames.indexOf(positionalNames.first()));
          System.out.println("\nThe index of the element francisco = " + positionalNames.indexOf(francisco));
          System.out.println("\nThe index of the element lucas = " + positionalNames.indexOf(lucas));
          System.out.println("\nThe index of the element leonardo = " + positionalNames.indexOf(leonardo));
          System.out.println("\nThe index of the element sissa = " + positionalNames.indexOf(sissa));
          System.out.println("\nThe index of the element bruno = " + positionalNames.indexOf(bruno));
          System.out.println("\nThe index of the element jair = " + positionalNames.indexOf(jair));
          System.out.println("\nThe index of the element stored at last position = " + positionalNames.indexOf(positionalNames.last()));
          System.out.println();




    }
}
