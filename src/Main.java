public class Main {
    public static void main(String[] args) {
        PetService service = new PetService();

        System.out.println("Basic checkup: $" + service.calculateFee());
        System.out.println("Checkup with vaccination: $" + service.calculateFee(true));
        System.out.println("Full service: $" + service.calculateFee(true, true));
        System.out.println("Emergency: $" + service.calculateFee("emergency"));

        System.out.println();
        System.out.println("Welcome to the Pet Clinic!");
        System.out.println("==========================");

        Pet dog = new TrainableDog("Buddy", 3);
        Pet cat = new Cat("Whiskers", 2);
        Pet bird = new TrainableBird("Tweety", 1);

        dog.displayInfo();
        dog.makeSound();

        cat.displayInfo();
        cat.makeSound();

        bird.displayInfo();
        bird.makeSound();

        System.out.println();
        System.out.println("Training Session Started!");
        System.out.println("==========================");

        Trainable tDog = (Trainable) dog;
        Trainable tBird = (Trainable) bird;

        tDog.performTrick();
        tBird.performTrick();
    }
}