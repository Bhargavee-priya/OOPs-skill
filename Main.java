package oops;
class Arithmetic {
    void add(int a, int b) {
    int result = a + b;
    System.out.println("Addition: " + result);
}
void subtract(int a, int b) {
    int result = a - b;
    System.out.println("Subtraction: " + result);
}

void multiply(int a, int b) {
    int result = a * b;
    System.out.println("Multiplication: " + result);
}

void divide(int a, int b) {
    if (b != 0) {
        double result = (double) a / b;
        System.out.println("Division: " + result);
    } else {
        System.out.println("Error: number by zero is not allowed.");
    }
}
}

public class Main {
public static void main(String[] args) {
    Arithmetic obj = new Arithmetic();

    int x = 20, y = 5;

    obj.add(x, y);
    obj.subtract(x, y);
    obj.multiply(x, y);
   obj.divide(x, y);
}
}
