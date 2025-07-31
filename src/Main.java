import java.util.Scanner;
public class Main {

    String StudentID = "";
    String LastName = "";
    String FirstName = "";
    String Course = "";
    String Section = "";

    int Midterm = 0;
    int Final = 0;
    int Project = 0;
    int Attendance = 0;

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        System.out.println("Welcome to Student Grade Calculator");

        System.out.print("\nID number: ");
        String StudentID = Scan.nextLine();

        System.out.print("Last name: ");
        String LastName = Scan.nextLine();

        System.out.print("First name: ");
        String FirstName = Scan.nextLine();

        System.out.print("Course: ");
        String Course = Scan.nextLine();

        System.out.print("Section: ");
        String Section = Scan.nextLine();

        System.out.println("\nHello! " + LastName + ", " + FirstName + " " + Course + " " + Section);

        System.out.print("\nPlease input your scores");

        System.out.print("\nMidterm Exam: ");
        int Midterm = Scan.nextInt();

        System.out.print("Final Exam: ");
        int Final = Scan.nextInt();

        System.out.print("Projects: ");
        int Project = Scan.nextInt();

        System.out.print("Attendance: ");
        int Atten = Scan.nextInt();

        int allOverScore = Midterm + Final + Project + Atten;

        double averageScore = allOverScore / 400.0 * 100;

        if (averageScore > 75) {
            System.out.println("\nPASSED! Your average score is: " + averageScore);
        }
        else {
            System.out.println("\nFAILED. Your average score is: " + averageScore);
        }

        Scan.close();
    }
}