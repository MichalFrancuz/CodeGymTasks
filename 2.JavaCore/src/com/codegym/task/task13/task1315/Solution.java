package com.codegym.task.task13.task1315;

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanMove {
        void move();
    }

    public interface Edible {
        void beEaten();
    }

    public interface CanEat {
        void eat();
    }

    abstract static class Dog implements CanMove, CanEat {
    }

    abstract static class Cat implements CanMove, Edible, CanEat {
    }

    abstract static class Mouse implements CanMove, Edible {
    }
}