/***
 * Bianca Cervantes
 * Exercise 1, 2, and 3
 * CS 151 Object-Oriented

 */
package org.example;

import java.util.Locale;

public class Main{
    public static void main(String[] args)
    {
        Candidate candidate1 = new Candidate("Milo Cervantes","Love");
        Voter voter1 = new Voter("Snuggles Cervantes","Free");

        Utility.printInfoCandidate();
        Utility.printInfoVoter();

        Utility person = new Utility();
        person.setFirstName("Meilin ");
        person.setLastName("Lee");
        System.out.println(person.getFirstName().toUpperCase());
        System.out.println(person.getLastName().toUpperCase());
    }

}