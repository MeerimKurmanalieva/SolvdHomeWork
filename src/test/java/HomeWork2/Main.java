package HomeWork2;

import HomeWork2.Persons.Employee;
import HomeWork2.Persons.Owner;
import HomeWork2.Persons.Person;
import HomeWork2.Pets.Bird;
import HomeWork2.Pets.Cat;
import HomeWork2.Pets.Dog;
import HomeWork2.Pets.Pet;
import HomeWork2.Products.Food;
import HomeWork2.Products.Product;
import HomeWork2.Products.Toy;

public class Main {
    public static void main(String[] args) {
        // Create some pets
        Pet dog = new Dog("Buddy", 3, "Labrador", "Ball");
        Pet cat = new Cat("Fluffy", 2, "Persian", true);
        Pet bird = new Bird("Tweety", 1, "Canary");

        // Create some people
        Person owner = new Owner("John", "Doe", "123 Main St.");
        Person employee = new Employee("Jane", "Smith", "456 Broad St.", "Cashier");

        // Create some products
        Product food = new Food("Purina", 5.99, "Dog food");
        Product toy = new Toy("Kong", 10.99, "Rubber chew toy");


        // Display information about the pets, people, and products
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(bird);
        System.out.println(owner);
        System.out.println(employee);
        System.out.println(food);
        System.out.println(toy);

    }}
