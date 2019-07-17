package com.granovskiy;

public interface Collaborator {
    int NUMBER = 10;

    void doSmth();   //  abstract method for lambda
    /*
        2-nd abstract method without realization can be here
        because it is inherited from Object class
     */
    boolean equals(Object o);
    /*
        3-d abstract method without realization can be here
        because it is inherited from Object class
     */
    String toString();
    /*
        4-th abstract method without realization can be here
        because it is inherited from Object class
     */
    int hashCode();

    default void doSmth2() {
        System.out.println("doSmth2 from Collaborator Interface");
    }

    static void doSmth3() {
        System.out.println("doSmth3 from Collaborator Interface");
    }
}
