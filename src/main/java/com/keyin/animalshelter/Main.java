package com.keyin.animalshelter;

public class Main {
    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();

        shelter.enqueue(new Dog("King", 0));
        shelter.enqueue(new Cat("Atreus", 0));
        shelter.enqueue(new Dog("Loki", 0));
        shelter.enqueue(new Cat("Kratos", 0));

        System.out.println("Dequeued any: " + shelter.dequeueAny().getName());
        System.out.println("Dequeued doggie: " + shelter.dequeueDog().getName());
        System.out.println("Dequeued catto: " + shelter.dequeueCat().getName());
    }
}