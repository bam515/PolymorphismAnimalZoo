import animal.*;
import zoo.ZooKeeper;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("초코");
        Animal cat = new Cat("나비");
        Animal tiger = new Tiger("호돌이");
        Animal penguin = new Penguin("펭수");

        ZooKeeper zooKeeper = new ZooKeeper();

        Animal[] animals = {dog, cat, tiger, penguin};

        for (Animal animal : animals) {
            zooKeeper.makeAnimalMove(animal);
            if (animal instanceof Soundable) {
                zooKeeper.makeAnimalSound((Soundable) animal);
            }
        }
    }
}
