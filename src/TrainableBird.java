class TrainableBird extends Bird implements Trainable {
    public TrainableBird(String name, int age) {
        super(name, age);
    }

    @Override
    public void performTrick() {
        System.out.println("Training " + name + ": Flies in circles and lands on perch");
    }
}
