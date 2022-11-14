public class Listeners {
    public String name;
    public String interest;
    // constructor
    public Listeners(String name, String interest) {
        this.name = name;
        this.interest = interest;

    }

    public String onEvent() {
        System.out.println("Hey " + name + " a duck just quacked");
        return "Hey " + name + " a duck just quacked";
    }
}
