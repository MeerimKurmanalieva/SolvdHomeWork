import java.lang.reflect.*;
import java.util.*;

public class CollectionHierarchyExample {
    public static void main(String[] args) throws Exception {
        // Create an arraylist
        Class<?> arrayListClass = ArrayList.class;
        printClassInformation(arrayListClass);

        // Create a linked list
        Class<?> linkedListClass = LinkedList.class;
        printClassInformation(linkedListClass);

        // Create a hash set
        Class<?> hashSetClass = HashSet.class;
        printClassInformation(hashSetClass);

        // Create a tree set
        Class<?> treeSetClass = TreeSet.class;
        printClassInformation(treeSetClass);

        // Create a hash map
        Class<?> hashMapClass = HashMap.class;
        printClassInformation(hashMapClass);

        // Create a tree map
        Class<?> treeMapClass = TreeMap.class;
        printClassInformation(treeMapClass);

        // Create a priority queue
        Class<?> priorityQueueClass = PriorityQueue.class;
        printClassInformation(priorityQueueClass);
    }

    public static void printClassInformation(Class<?> cls) {
        System.out.println("Class Name: " + cls.getName());
        System.out.println("Modifiers: " + Modifier.toString(cls.getModifiers()));

        System.out.println("\nFields:");
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Name: " + field.getName());
            System.out.println("Type: " + field.getType().getName());
            System.out.println("Modifiers: " + Modifier.toString(field.getModifiers()));
            System.out.println();
        }

        System.out.println("Constructors:");
        Constructor<?>[] constructors = cls.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("Name: " + constructor.getName());
            System.out.println("Modifiers: " + Modifier.toString(constructor.getModifiers()));
            Parameter[] parameters = constructor.getParameters();
            System.out.print("Parameters: ");
            for (Parameter parameter : parameters) {
                System.out.print(parameter.getType().getName() + " " + parameter.getName() + ", ");
            }
            System.out.println("\n");
        }

        System.out.println("Methods:");
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Name: " + method.getName());
            System.out.println("Return Type: " + method.getReturnType().getName());
            System.out.println("Modifiers: " + Modifier.toString(method.getModifiers()));
            Parameter[] parameters = method.getParameters();
            System.out.print("Parameters: ");
            for (Parameter parameter : parameters) {
                System.out.print(parameter.getType().getName() + " " + parameter.getName() + ", ");
            }
            System.out.println("\n");
        }
        System.out.println("---------------------------------------------------\n");
    }
}
