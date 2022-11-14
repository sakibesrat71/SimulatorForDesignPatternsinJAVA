public class DuckIterator implements Iterator {
    Quackable[] ducks;
    int position = 0;
    public DuckIterator(Quackable[] ducks) {
        this.ducks = ducks;
    }
    public boolean hasNext() {
        if (position >= ducks.length || ducks[position] == null) {
            return false;
        } else {
            return true;
        }
    }
    public Object next() {
        Quackable duck = ducks[position];
        position = position + 1;
        return duck;
    }
}

