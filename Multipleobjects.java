public class Multipleobjects {

public static void main(String[] args){

Student s1= new Student();
Student s2= new Student();

s1.id= 12;
s1.name="Ali";
s1.completedCredits=15;


s2.id= 13;
s2.name="Alian";
s2.completedCredits=16; 

s1.printSummary();
s2.printSummary();

s1.name = "Ahmed";
s1.completedCredits = 25;

s1.printSummary();
s2.printSummary();

s1.addCredits(6);

s1.printSummary();
s2.printSummary();
}

}
