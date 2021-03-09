package com.company;

interface A{
    void meth1();
    void meth2();

}
interface B extends A{
    void meth3();

}
public class classA implements B {
int i=10,j=20;
int sum=0;
void showij() {
    sum = i+j;
    System.out.println("The sum of i and j is " + sum );
}

 public void meth1() {
     System.out.println("This is meth 1");
}
public void meth2() {
    System.out.println("This is meth2");
}
public void meth3() {
    System.out.println("This is meth3");
}

}

