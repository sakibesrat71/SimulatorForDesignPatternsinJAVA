public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createDuck() {
        System.out.println("Wrong method called");
        return null;
    }

    public CountingDuck createCountingDuck() {
        System.out.println("Creating COunting Duck in factory");
        return new CountingDuck(new Duck());
    }
}

