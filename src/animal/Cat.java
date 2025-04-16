package animal;

public class Cat extends Animal implements Soundable {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(name + "가 조용히 걷습니다.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": 야옹~");
    }
}
