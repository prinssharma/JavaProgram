class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }

    void makeSound(String name){
        System.out.println("Animal "+name+" is in overloading class.");
    }
}

class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Animal Dog barks is in overriding class.");
    }


}


public class InheritanceAndPolymorphism {
    public static void main(String[] args) {
        
        Animal myPet = new Dog();
        myPet.makeSound();
        myPet.makeSound("Lion");

        Animal animal = new Dog();
        animal.makeSound("Cat");

    }

}

