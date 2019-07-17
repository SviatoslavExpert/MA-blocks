package com.granovskiy;

/*
    This is an example of Open-Closed principle
    from SOLID principles
    The code is open for extension and closed
    for modification.
    I extended the code. Now it is OldCollaborator
    and NewCollaborator instead of Collaborator.
    I can change NewCollaborator to OldCollaborator -
    the messages in the console will be different.
 */

public class Demo {
    public static void main(String[] args) {
        Has has = new Has(new NewCollaborator());
        has.doSmth();
    }
}

class Has {
    private Collaborator collaborator;

    public Has(Collaborator collaborator) {
        this.collaborator = collaborator;
    }

    public void doSmth() {
        collaborator.doSmth();
    }
}

interface Collaborator {
    void doSmth();
}

class OldCollaborator implements Collaborator {
    @Override
    public void doSmth() {
        System.out.println("Message from OldCollaborator.");
    }
}

class NewCollaborator implements Collaborator {
    @Override
    public void doSmth() {
        System.out.println("Message from NewCollaborator.");
    }
}