package practical;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class methodoverriding {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.sound();

        Dog myDog = new Dog();
        myDog.sound();

        Cat myCat = new Cat();
        myCat.sound();

        Animal animalDog = new Dog();
        animalDog.sound();

        Animal animalCat = new Cat();
        animalCat.sound();
    }
}
