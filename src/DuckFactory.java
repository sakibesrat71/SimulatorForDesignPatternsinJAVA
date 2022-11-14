public class DuckFactory extends AbstractDuckFactory {
    public Quackable createDuck() {
        System.out.println("Creating Duck in factory");
        return new Duck();
    }
    public CountingDuck createCountingDuck() {
        System.out.println("Wrong method called");
        return null;
    }
}

