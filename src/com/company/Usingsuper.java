package com.company;

public class Usingsuper {

    static class Parent {
        int x;
        int m = 100;
        public Parent(int x) {
            this.x = x;

        }
        void show() {
            System.out.println("I'm a superstar");
        }
        void aviator(String s1, String s2) {
            System.out.println(s1 + " is always greater hai than " + s2  );

        }


    }

    static class Child extends Parent {
        int y;
        int u=1;
        String s1 = "Sanskar";

        public Child(int x,int y) {
            super(100);
            this.y = y;
            System.out.println(x + " and " + y + " and " + m);
        }
        void aviator(String s1, int u) {
            System.out.println(u + ":" + s1);
        }


    }
    public static void main(String[] args) {
        Child obj = new Child(500,102);
        obj.show();
        obj.aviator("Labim", 2);


    }
}
