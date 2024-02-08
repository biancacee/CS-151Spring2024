package org.example;

public class Voter extends Utility{
    String name;
    final int id = 1;
    String party;
    Voter(String name, String party)
    {
        System.out.println("\nVoter Name: "+name);
        System.out.println("Party Name: "+party);
    }
}
