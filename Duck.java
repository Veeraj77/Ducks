abstract public class Duck {
    QuackBehaviour quackBehaviour;
    SwimBehaviour swimBehaviour;
    FlyingBehaviour flyingBehaviour;
    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void setSwimBehaviour(SwimBehaviour swimBehaviour) {
        this.swimBehaviour = swimBehaviour;
    }

    public void setFlyingBehaviour(FlyingBehaviour flyingBehaviour) {
        this.flyingBehaviour = flyingBehaviour;
    }

    abstract public void display();


    public void performQuack(){
        quackBehaviour.quack();
    }
    public void performSwim(){
        swimBehaviour.swim();
    }
    public void performFly(){
        flyingBehaviour.fly();
    }

}
