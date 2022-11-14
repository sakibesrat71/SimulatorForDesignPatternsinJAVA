public class WoodenDuck implements Quackable {
    String name;
    NotificationService notificationService = new NotificationService();

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    // constructor
    public WoodenDuck(String name) {
        this.name = name;
    }

    public void quack() {
        System.out.println(name + "Squeak");
        Duck.playQuackSound("squeak.wav");
        notificationService.setDuckType("woodenDuck");
        notificationService.notifyListeners();
    }
}

