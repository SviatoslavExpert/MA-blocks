package com.granovskiy;

public class Demo {
    public static void main(String[] args) {
        Has has = new Has(new Collaborator());
        has.doSmth();
    }
}

class Has {
    private Collaborator collaborator;

    //  setter
    public Has(Collaborator collaborator) {
        this.collaborator = collaborator;
    }

    // it reminds of method overriding
    public void doSmth() {
        collaborator.doSmth();
    }
    /*
       This is the example of composition
       (class Collaborator is part of class Has).
       It is a "has a" type of relationship.
       Class Collaborator is put inside of class Has.
       The method doSmth of Class Collaborator is called from class Has.
     */
}

class Collaborator {
    public void doSmth() {
        System.out.println("This is Something!");
    }

}