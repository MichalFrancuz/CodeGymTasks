package com.codegym.task.task13.task1307;

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    //write your code here
    static class StringObject implements SimpleObject<String> {
        public SimpleObject<String> getInstance() {
            return null;
        }
    }
}