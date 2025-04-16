package animal;

public class Dog extends Animal implements Soundable {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(name + "가 네 발로 달립니다.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": 멍멍!");
    }
}
