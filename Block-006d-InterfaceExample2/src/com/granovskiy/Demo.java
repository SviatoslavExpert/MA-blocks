package com.granovskiy;

public class Demo{
    public static void main(String[] args) {
        Has has = new Has(new NewCollaborator());
        has.doSmth();

        //  another example of lambda
        Collaborator collaborator = () -> System.out.println("TEST");
        collaborator.doSmth();
    }

}