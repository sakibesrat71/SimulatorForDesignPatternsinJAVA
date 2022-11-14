public class GooseDuckAdapter implements Quackable, Honkable {
    private Honkable goose;
    private Quackable duck;


    public GooseDuckAdapter(Honkable goose) {
        this.goose = goose;
    }

    public GooseDuckAdapter(Quackable duck) {
        this.duck = duck;
    }

    public void quack() {
        goose.honk();
    }

    public void honk() {
        duck.quack();
    }
}

