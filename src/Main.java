public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Alice", 20, "BSIT", 85, 90, 88);
        Student s2 = new Student("Bob", 19, "BSCS", 92, 95, 89);
        Student s3 = new Student("Charlie", 21, "BSIT", 65, 70, 68);

        Student[] list = {s1, s2, s3};

        int passCount = 0;

        System.out.println("\nStudent Information:\n");

        for (Student s : list) {
            s.showInfo();
            double avg = s.getAverage();
            String grade = s.getGrade();
            boolean pass = s.isPass();

            System.out.printf("Average: %.2f\n", avg);
            System.out.println("Letter Grade: " + grade);
            System.out.println("Status: " + (pass ? "PASSING\n" : "FAILING\n"));


            if (pass) {
                passCount++;
            }
        }

        System.out.println("Summary: " + passCount + " out of 3 students are passing");
    }
}