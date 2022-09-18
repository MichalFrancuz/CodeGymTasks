package com.codegym.task.task13.task1306;

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(Matrix.NEO);
        // Printing text ( --> @Override public String toString() ) and data of variable from Matrix class
        System.out.println(Matrix.TRINITY);
        // Printing text ( --> @Override public String toString() ) and data of variable from Matrix class
    }

    static class Matrix {
        public static DBObject NEO = new User().initializeIdAndName(1, "Neo");
        // Put data in this method from User() class
        public static DBObject TRINITY = new User().initializeIdAndName(2, "Trinity");
        // Put data in this method from User() class
    }

    interface DBObject {

        DBObject initializeIdAndName(long id, String name); // this method is declared here

        DBObject initializeIdAndName(User user); // this method is declared here
    }

    static class User implements DBObject {
        long id;
        String name;

        public User initializeIdAndName(long id, String name) { // and here is implemented for User object
            this.id = id;
            this.name = name;
            return this;
        }

        @Override
        public DBObject initializeIdAndName(User user) { // and here is implemented
            return new User();
        }

        @Override
        public String toString() { // Override method in Object (java.lang) --> result of this is printing this text in
            // System.out.println() with correct data depending on the witch variables from Matrix class is calling in
            // parameter of System.out.println().
            return String.format("The user's name is %s, id = %d", name, id);
        }
    }

}