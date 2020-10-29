package com.company;


public class Solution {
    public static void main(String[] args) {
        String string = new String("Hello");
        System.out.println(string);

        Human h1 = new Human("Bob", 15);
        System.out.println(h1);

    }
}
    class Human {
        private String name;
        private int age;


        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String toString() {
            return name + " ," + age;
        }


    }

