package org.example;

public class Utility {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    static void printInfoCandidate()
    {
        System.out.println("\n");
        Candidate c = new  Candidate("Milo","Free");
    }
    static void printInfoVoter()
    {
        System.out.println("\n");
        Voter v = new Voter("Snuggle","Love");
        System.out.println("\n");
    }

}

