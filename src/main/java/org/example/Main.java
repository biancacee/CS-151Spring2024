/***
 * Bianca Cervantes
 * Exercise 1, 2, and 3
 * CS 151 Object-Oriented

 */

package org.example;
class Candidate
{
    final int candidateKey = 1;
    static String candidateName;
    public static String getName() {return candidateName.toUpperCase();}
    String party;

    public void setName(String N)
    {

        // This keyword refers to current instance itself
        Candidate.candidateName =N;
    }


    Candidate()
    {
        Candidate.candidateName = candidateName;
    }
}

class getVoter
{
    final int voterId = 1;
    static String voterName;
    public static String getName() {return voterName.toUpperCase();}
    String party;

    public void setName(String N)
    {

        // This keyword refers to current instance itself
        getVoter.voterName =N;
    }


    getVoter()
    {
        Voter.voterName = voterName;
    }
}
class Voter
{
    final int voterKey = 1;
    static String voterName;
    public static String getName() {return voterName.toUpperCase();}
    boolean hasVoted;

    Voter(String voterName, boolean hasVoted)
    {
        Voter.voterName = voterName;
        this.hasVoted = true;
    }
}
class Utility
{
    static void printInfo()
    {
        System.out.println(Candidate.candidateName);
        System.out.println(Voter.voterName);
    }
}
class Person {
    public static void main(String[] args)
    {
        System.out.println("\nCandidate name printed below using setter and getter:");
        Candidate person1 = new Candidate();
        person1.setName("Milo Cervantes");
        System.out.println(Candidate.getName());

        System.out.println("\nVoter name printed below using setter and getter:");
        getVoter person1_v2 = new getVoter();
        person1_v2.setName("Milo Cervantes");
        System.out.println(getVoter.getName());

        System.out.println("\nVoter information printed below using:");
        Voter person1Vote = new Voter("Bianca Cervantes", true);
        System.out.println("Voter Name:" + Voter.voterName
                + "\nHas Voted:" + person1Vote.hasVoted);

        System.out.println("\nCandidate and Voter information printed using static method below: ");
        Utility printInfo = new Utility();
        Utility.printInfo();
    }
}