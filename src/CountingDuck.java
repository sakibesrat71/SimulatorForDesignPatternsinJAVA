public class CountingDuck extends DuckDecorator{

    public CountingDuck(Quackable duck) {
        super(duck);
    }

    public void quack() {
        duck.quack();
        incrementCounter();
    }
    public  int counter = 0;
    public int incrementCounter() {
        counter++;
        System.out.println("Quack counter: " + counter);
        return counter;
    }
}
