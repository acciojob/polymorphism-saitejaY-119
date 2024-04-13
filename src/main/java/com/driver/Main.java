package com.driver;

public class Main {
    // Task 1: Create a class Product inside Main class
    public static class Product {
        // Task 3: Create a method product(int, int)
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4: Create an overloaded method product(int, int, int)
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5: Create an overloaded method product(double, double)
        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        // Task 2: Create object of Product in Main function called p
        Product p = new Product();

        // Task 3: Call method product(int, int) using Product class object p
        int result1 = p.product(5, 3);
        System.out.println("Result of product(int, int): " + result1);

        // Task 4: Call overloaded method product(int, int, int) using Product class object p
        int result2 = p.product(5, 3, 2);
        System.out.println("Result of product(int, int, int): " + result2);

        // Task 5: Call overloaded method product(double, double) using Product class object p
        double result3 = p.product(2.5, 3.5);
        System.out.println("Result of product(double, double): " + result3);
    }
}
