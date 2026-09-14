public class Student {

    public static void main(String[] args) {

        String name = "Saadullah";

        int mark1 = 80;
        int mark2 = 75;
        int mark3 = 90;

        int total = mark1 + mark2 + mark3;

        double average = total / 3.0;

        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);

        if (average >= 50) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
}