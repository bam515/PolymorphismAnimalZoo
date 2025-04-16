package zoo;

import animal.Animal;
import animal.Soundable;

public class ZooKeeper {
    public void makeAnimalMove(Animal animal) {
        animal.move();
    }

    public void makeAnimalSound(Soundable soundable) {
        soundable.makeSound();
    }
}
