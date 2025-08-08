public class Student {
    String name;
    int age;
    String course;
    double g1, g2, g3;

    public Student(String name, int age, String course, double g1, double g2, double g3) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.g1 = g1;
        this.g2 = g2;
        this.g3 = g3;
    }

    public void showInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course );
        System.out.println("Grades :" + g1 +", "+ g2 +", " + g3);

    }

    public double getAverage() {
        return (g1 + g2 + g3) / 3;
    }

    public String getGrade() {
        double avg = getAverage();
        if (avg >= 90) return "A";
        else if (avg >= 80) return "B";
        else if (avg >= 70) return "C";
        else if (avg >= 60) return "D";
        else return "F";
    }

    public boolean isPass() {
        return getAverage() >= 70;
    }
}