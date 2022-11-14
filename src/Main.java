import javax.swing.*;

public class Main {
    public static void main(String[] args) {
//        NotificationService notificationService = new NotificationService();
//        notificationService.addListener(new Listeners("1","mallardDuck"));
//        notificationService.addListener(new Listeners("2","simpleDuck"));
//        notificationService.addListener(new Listeners("3","woodenDuck"));

        GUI gui = new GUI();
        gui.addQuackButton();
//        AbstractDuckFactory duckFactory = new DuckFactory();
//        Quackable duck = duckFactory.createDuck();
//        System.out.println("Simple Duck says:");
//        duck.quack();
//        Honkable goose = new Goose();
//        System.out.println("Simple Goose says:");
//        goose.honk();
//        Quackable quacker;
//        quacker = new Duck();
//
//        // adapter demo
////        System.out.println("Again Simple quacker when calls quack in line 12:");
////        quacker.quack();
//        System.out.println("Now the same Simple quacker wants to honk");
//        quacker = new GooseDuckAdapter(goose);
//        quacker.quack();
//        Honkable honker;
//        honker = new Goose();
//        System.out.println("Simple honker says:");
//        honker.honk();
//        System.out.println("Now the same Simple honker wants to quack");
//        honker = new GooseDuckAdapter(duck);
//        honker.honk();
//
//        // decorator demo
//        Quackable quacker2 = new DuckDecorator(new CountingDuck(new Duck()));
//        System.out.println("The new quacker that has a counter property is called 2 times");
//        for(int i = 0; i < 2; i++) {
//            quacker2.quack();
//        }
//
//        // composite and iterator demo
//        Duck[] ducks = new Duck[4];
//        for (int i = 0; i < 2; i++) {
//            ducks[i]= (Duck) duckFactory.createDuck();
//        }
//        FlockOfDucks flockOfDucks = new FlockOfDucks(ducks);
//        System.out.println("Flock of 3 ducks says:");
//        flockOfDucks.quack();
//
//        // observer demo
////        Duck quacker3 = new Duck();
////        for (int i = 0; i <2 ; i++) {
////            NotificationService notificationService = new NotificationService() ;
////        }
////         quacker3.quack();
    }
}
