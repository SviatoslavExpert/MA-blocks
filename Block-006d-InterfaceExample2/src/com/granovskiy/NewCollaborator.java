package com.granovskiy;

class NewCollaborator implements Collaborator {
    @Override
    public void doSmth() {
        System.out.println("Message from NewCollaborator.");
    }
}
