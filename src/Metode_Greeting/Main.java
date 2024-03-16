package Metode_Greeting;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.greet(); // Memanggil metode greet dari kelas Person

        Student student = new Student();
        student.greet(); // Memanggil metode override greet dari kelas Student
        student.greet("John"); // Memanggil metode overload greet dari kelas Student
    }
}
