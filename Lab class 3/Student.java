public class Student {

    String Name;

    int age;

    String Id;

    float Cgpa;

    void display() {

        System.out.println("Name: " + Name);

        System.out.println("ID: " + Id);

        System.out.println("Age: " + age);

        System.out.println("CGPA: " + Cgpa);

    }

    public static void main(String[] args) {

        Student S1 = new Student();

        S1.Name = "Mehedi Hassan";

        S1.Id = "221-15-4994";

        S1.age = 20;

        S1.Cgpa = 3.68f;

        S1.display();

    }
}