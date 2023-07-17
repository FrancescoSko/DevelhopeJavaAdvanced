package JavaAdvanced.DevelhopeJavaAdvanced.Polymorphism;

class Animal {
    private String animalName;

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public void animalSound() {
        System.out.println("Roarr!");
    }

    public void animalSound(String intensity) {
        if (intensity.equals("high")) {
            System.out.println("Roarrrrrrrr!");
        } else if (intensity.equals("low")) {
            System.out.println("Roar");
        } else {
            System.out.println("Cannot reproduce the sound properly.");
        }
    }
}

class AnimalTester {
    public static void main(String[] args) {
        Animal animal = new Animal("Lion");
        animal.animalSound();
        animal.animalSound("high");
    }
}
