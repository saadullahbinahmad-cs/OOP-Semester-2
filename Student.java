public class Student {
    int id;
    String name;
    int completedCredits;
void addCredits(int amount) {
    completedCredits = completedCredits + amount;
}

    void printSummary() {
        System.out.println(id + " " + name + " " + completedCredits);
    }
}