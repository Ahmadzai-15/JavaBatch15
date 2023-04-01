package Class25_InterFace;

public interface MoveAbleTester {
    public static void main(String[] args) {

        MovAble []movAbles={new Car(),new Dog()};
        for(MovAble move: movAbles){
            move.Move();
        }
        Ownable[] ownables={new Car(),new Dog()};
        for(Ownable own: ownables){
            own.own();
        }
    }
}
