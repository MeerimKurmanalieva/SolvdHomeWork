package OOP.PetShop;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PetShop { private static final Logger logger = LogManager.getLogger(PetShop.class);

    private List<Pet> inventory;

    public PetShop() {
        inventory = new ArrayList<>();
    }

    public void addPet(Pet pet) {
        inventory.add(pet);
        logger.info("Added pet to inventory: " + pet.getName());
    }

    public void removePet(String name) throws PetNotFoundException {
        for (Pet pet : inventory) {
            if (pet.getName().equals(name)) {
                inventory.remove(pet);
                logger.info("Removed pet from inventory: " + pet.getName());
                return;
            }
        }
        throw new PetNotFoundException("Pet not found: " + name);
    }

    public void sellPet(String name, double price) throws PetNotFoundException, InsufficientStockException, PaymentException {
        Pet pet = null;
        for (Pet p : inventory) {
            if (p.getName().equals(name)) {
                pet = p;
                break;
            }
        }
        if (pet == null) {
            throw new PetNotFoundException("Pet not found: " + name);
        }
        if (pet.getStock() <= 0) {
            throw new InsufficientStockException("No stock for pet: " + name);
        }
        if (!processPayment(price)) {
            throw new PaymentException("Payment failed for pet: " + name);
        }
        pet.sell();
        logger.info("Sold pet: " + pet.getName() + ", Price: " + price);
    }

    private boolean processPayment(double amount) {
        // payment processing logic here
        return true;
    }

    public static void main(String[] args) {
        PetShop shop = new PetShop();

        // load inventory from file
        try (BufferedReader reader = new BufferedReader(new FileReader("inventory.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(",");
                String name = tokens[0].trim();
                int age = Integer.parseInt(tokens[1].trim());
                int stock = Integer.parseInt(tokens[2].trim());
                double price = Double.parseDouble(tokens[3].trim());
                shop.addPet(new Pet(name, age, stock, price) {
                    @Override
                    public String makeSound() {
                        return null;
                    }

                    @Override
                    public int getStock() {
                        return 10;
                    }


                    @Override
                    public void sell() {

                    }
                });
            }
        } catch (IOException e) {
            logger.error("Error reading inventory file", e);
            System.exit(1);
        } catch (NumberFormatException e) {
            logger.error("Error parsing inventory file", e);
            System.exit(1);
        } catch (Exception e) {
            logger.error("Unknown error", e);
            System.exit(1);
        }

        // sell pets
        try {
            shop.sellPet("Cat", 50.0);
            shop.sellPet("Dog", 100.0);
            shop.sellPet("Parrot", 30.0);
        } catch (PetNotFoundException e) {
            logger.error("Pet not found", e);
        } catch (InsufficientStockException e) {
            logger.error("Insufficient stock", e);
        } catch (PaymentException e) {
            logger.error("Payment failed", e);
        } catch (Exception e) {
            logger.error("Unknown error", e);
        }

        // remove a pet
        try {
            shop.removePet("Fish");
        } catch (PetNotFoundException e) {
            logger.error("Pet not found: {}", e.getMessage());
        }
    }
}
