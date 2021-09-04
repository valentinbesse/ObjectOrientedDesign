package EncapsulationInJavaAndUML;

import java.util.UUID;

public class Person {
    private UUID iD;
    private String firstName;
    private String lastName;
    private String phoneNumber;


    public Person(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.iD = UUID.randomUUID();
    }

    public String getfirstName() {
        return firstName;
    }
    
    public String getlastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public UUID getID() {
        return iD;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}