// Problem 1: Animal Hierarchy (Basic Inheritance + Method Overriding + Polymorphism)
// Inheritance type: Simple inheritance (Animal -> Dog/Cat/Bird)
// Demonstrates: 'is-a' relationship, @Override, dynamic dispatch via base-class references.
class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Some generic animal sound...");
    }
}

class Dog extends Animal {
    public Dog(String name, int age) { super(name, age); }
    @Override public void makeSound() { System.out.println(name + " (Dog): Woof!"); }
}

class Cat extends Animal {
    public Cat(String name, int age) { super(name, age); }
    @Override public void makeSound() { System.out.println(name + " (Cat): Meow!"); }
}

class Bird extends Animal {
    public Bird(String name, int age) { super(name, age); }
    @Override public void makeSound() { System.out.println(name + " (Bird): Tweet!"); }
}

public class AnimalHierarchy {
    public static void main(String[] args) {
        // Polymorphism: base-class reference -> subclass objects
        Animal[] animals = {
            new Dog("Bruno", 3),
            new Cat("Mia", 2),
            new Bird("Kiki", 1)
        };
        for (Animal a : animals) a.makeSound();
    }
}
