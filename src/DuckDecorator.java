public class DuckDecorator implements Quackable {
    protected Quackable duck;

    public DuckDecorator(Quackable duck) {
        this.duck = duck;
    }

    public void quack() {
        duck.quack();
    }

}


