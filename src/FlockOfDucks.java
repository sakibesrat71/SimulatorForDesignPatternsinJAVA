public class FlockOfDucks implements Quackable{
    Quackable[] ducks;
    public FlockOfDucks(Quackable[] ducks) {
        this.ducks = ducks;
    }


    public void quack() {
        Iterator iterator = new DuckIterator(ducks);
        while (iterator.hasNext()) {
            Quackable duck = (Quackable)iterator.next();
            duck.quack();

        }
    }
}
