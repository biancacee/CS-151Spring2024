package org.example;

public class Candidate extends Utility{
    final int id = 0;
    String name;
    public Candidate(String name, String party)
    {
        System.out.println("Candidate Name: "+name);
        System.out.println("Candidate Party: "+party);
    }
}
