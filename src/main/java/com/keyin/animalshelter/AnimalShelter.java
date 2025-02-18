package com.keyin.animalshelter;

import java.util.LinkedList;
import java.util.Queue;

public class AnimalShelter {
    private Queue<Dog> dogQueue;
    private Queue<Cat> catQueue;
    private int timeStamp;

    public AnimalShelter() {
        this.dogQueue = new LinkedList<>();
        this.catQueue = new LinkedList<>();
        this.timeStamp = 0;
    }

    public void enqueue(Animal animal) {
        animal.setArrivalTime(timeStamp++);

        if (animal instanceof Dog) {
            dogQueue.add((Dog) animal);
        } else if (animal instanceof Cat) {
            catQueue.add((Cat) animal);
        }
    }

    public Animal dequeueAny() {
        if (dogQueue.isEmpty() && catQueue.isEmpty()) return null;
        if (dogQueue.isEmpty()) return catQueue.poll();
        if (catQueue.isEmpty()) return dogQueue.poll();

        Dog oldestDog = dogQueue.peek();
        Cat oldestCat = catQueue.peek();

        return (oldestDog.getArrivalTime() < oldestCat.getArrivalTime()) ? dogQueue.poll() : catQueue.poll();
    }

    public Dog dequeueDog() {
        return dogQueue.poll();
    }

    public Cat dequeueCat() {
        return catQueue.poll();
    }
}
