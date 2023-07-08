package org.example.polymorphism;

/*
Run-time polymorphism relies on two principles:
a reference variable of the superclass can refer to any subtype object;
a superclass method can be overridden in a subclass.
Run-time polymorphism works when an overridden method is called through the reference variable of a superclass. Java determines at runtime which version of the method (superclass/subclasses) is to be executed based on the type of the object being referred, not the type of reference. It uses a mechanism known as dynamic method dispatching.
 */
public class MythicalAnimal {
    public static void main(String[] args) {
        MythicalAnimal mythicalAnimal2 = new Dragon();
        mythicalAnimal2.makeSound();

        MythicalAnimal mythicalAnimal3 = new Unicorn();
        mythicalAnimal3.makeSound();
    }

    public void makeSound() {
        System.out.println("MythicalAnimal");
    }
}

class Dragon extends MythicalAnimal {
    @Override
    public void makeSound() {
        System.out.println("Dragon");
    }
}

class Unicorn extends MythicalAnimal {
    @Override
    public void makeSound() {
        System.out.println("Unicorn");
    }
}


