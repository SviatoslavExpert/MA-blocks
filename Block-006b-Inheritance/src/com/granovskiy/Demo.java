package com.granovskiy;

public class Demo {
    public static void main(String[] args) {
        Has has = new Has();
        has.doSmth();
    }
}

/*
    Composition is preferable in many cases because it allows
    more flexibility: classes depend on each other less than
    in case of inheritance
 */

/*
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

}
*/

class Has extends Collaborator {

}

class Collaborator {
    public void doSmth() {
        System.out.println("This is Something!");
    }

}
