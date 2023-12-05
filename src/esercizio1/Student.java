package esercizio1;

import java.util.Random;

public class Student {
    String name;
    String surname;
    int age;
    int id;

    // COSTRUTTORE

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        Random rndm = new Random();
        this.id = rndm.nextInt(1, 10000000);
    }

    //GETTER SETTER


    //METODI


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
