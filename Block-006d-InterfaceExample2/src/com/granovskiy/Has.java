package com.granovskiy;

public class Has {
    private Collaborator collaborator;

    public Has(Collaborator collaborator) {
        this.collaborator = collaborator;
    }

    public void doSmth() {
        collaborator.doSmth();
    }
}