package com;

public class Main {
    public static void main(String[] args){
        var emp = new Employee(100,50);
        int wage = emp.calculateWage(10);
        System.out.println(wage);
    }
}
