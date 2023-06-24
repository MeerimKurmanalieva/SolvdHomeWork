package PetShop;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


import java.util.ArrayList;
import java.util.List;

public class PetShop {
    private static final Logger logger = LogManager.getLogger(PetShop.class);

    private final List<Pet> inventory;

    public PetShop() {
        inventory = new ArrayList<>();
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

        // Rest of the code...
    }
}
