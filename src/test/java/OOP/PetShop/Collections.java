package OOP.PetShop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.PriorityQueue;

public class Collections {
    private ArrayList<Pet> arrayListPets;
    private MyLinkedList<Pet> linkedListPets;
    private HashSet<Pet> hashSetPets;
    private TreeMap<String, Pet> treeMapPets;
    private PriorityQueue<Pet> priorityQueuePets;

    public void PetShop() {
        arrayListPets = new ArrayList<>();
        linkedListPets = new MyLinkedList<>();
        hashSetPets = new HashSet<>();
        treeMapPets = new TreeMap<>();
        priorityQueuePets = new PriorityQueue<>();
    }

    public void addPet(Pet pet) {
        arrayListPets.add(pet);
        linkedListPets.add(pet);
        hashSetPets.add(pet);
        treeMapPets.put(pet.getName(), pet);
        priorityQueuePets.add(pet);
    }

    public void removePet(String name) throws PetNotFoundException {
        boolean found = false;
        for (int i = 0; i < linkedListPets.size(); i++) {
            Pet pet = linkedListPets.get(i);
            if (pet.getName().equals(name)) {
                linkedListPets.remove(i);
                found = true;
                break;
            }
        }
        if (!found) {
            throw new PetNotFoundException("Pet with name " + name + " not found.");
        }

        hashSetPets.removeIf(pet -> pet.getName().equals(name));

        if (!treeMapPets.containsKey(name)) {
            throw new PetNotFoundException("Pet with name " + name + " not found.");
        }
        treeMapPets.remove(name);

        found = priorityQueuePets.removeIf(pet -> pet.getName().equals(name));
        if (!found) {
            throw new PetNotFoundException("Pet with name " + name + " not found.");
        }
    }

    public ArrayList<Pet> getAllPetsAsArrayList() {
        return arrayListPets;
    }

    public MyLinkedList<Pet> getAllPetsAsLinkedList() {
        return linkedListPets;
    }

    public HashSet<Pet> getAllPetsAsHashSet() {
        return hashSetPets;
    }

    public TreeMap<String, Pet> getAllPetsAsTreeMap() {
        return treeMapPets;
    }

    public PriorityQueue<Pet> getAllPetsAsPriorityQueue() {
        return priorityQueuePets;
    }
}
