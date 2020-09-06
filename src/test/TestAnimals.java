package test;

import animals.Cat;
import animals.Dog;
import animals.Animal;

public class TestAnimals {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setName("Filemon");
        Cat cat2 = new Cat();
        cat2.setName("Feliks");
        Cat cat3 = new Cat();
        cat3.setName("Mruczek");
        cat3.kill();
        Dog dog = new Dog();
        dog.setName("Reksio");
        Animal[] animals = {cat1, cat2, cat3, dog};
        for (Animal animal : animals) {
                if (animal.isAlive()) {
                    System.out.println(animal.getName());

                }
            }

        }
    }

