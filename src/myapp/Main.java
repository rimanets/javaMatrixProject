package myapp;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Alice");
        Person p2 = new Person("Bob");

        p1.print(); // → Name: Alice, Species: Homo sapiens
        p2.print(); // → Name: Bob, Species: Homo sapiens
    }
}
