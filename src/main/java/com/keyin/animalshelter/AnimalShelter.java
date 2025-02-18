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
}
