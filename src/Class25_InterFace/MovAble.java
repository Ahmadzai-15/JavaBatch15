package Class25_InterFace;

public interface MovAble {
    void Move();
}
interface Ownable {
    void own();
}
class Car implements MovAble, Ownable {
    @Override
    public void Move() {
        System.out.println("i can Move");
    }

    @Override
    public void own() {
        System.out.println("you can own me");
    }
}
class Dog implements MovAble, Ownable {
    @Override
    public void Move() {
        System.out.println("I can move");
    }

    @Override
    public void own() {
        System.out.println("you can own me ");
    }
}