package homeWork2;

import homeWork2.Persons.Employee;
import homeWork2.Persons.Owner;
import homeWork2.Persons.Person;
import homeWork2.Pets.Bird;
import homeWork2.Pets.Cat;
import homeWork2.Pets.Dog;
import homeWork2.Pets.Pet;
import homeWork2.Products.Food;
import homeWork2.Products.Product;
import homeWork2.Products.Toy;

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
