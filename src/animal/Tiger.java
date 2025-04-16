package animal;

public class Tiger extends Animal implements Soundable {
    public Tiger(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(name + "가 힘차게 달립니다.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": 으르렁!");
    }
}
