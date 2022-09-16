package com.codegym.task.task13.task1304;

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }

    //write your code here

    public static class Screen implements Selectable, Updatable {
        public void onSelect() {
        }

        public void refresh() {
        }
    }
}