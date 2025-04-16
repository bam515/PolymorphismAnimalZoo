package animal;

public class Penguin extends Animal implements Soundable {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(name + "가 미끄러지듯 걷습니다.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": 꽥!");
    }
}
