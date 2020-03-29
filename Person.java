package Lesson5.person;

import java.util.ArrayList;

public class Person {
    private String fio;
    private String position;
    private int age;
    private String salary;
    private String email;
    private String phone;


    @Override
    public String toString() {
        return "Person{" +
                "fio='" + fio + '\'' +
                ", position='" + position + '\'' +
                ", age=" + age +
                ", salary='" + salary + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public Person(String fio, int age, String position,
                   String salary, String email, String phone){
        this.fio = fio;
        this.age = age;
        this.position = position;
        this.salary = salary;
        this.email = email;
        this.phone= phone;
    }

    public static void main(String[] args) {
        ArrayList<Person> Persons = new ArrayList<>();
        Persons.add(new Person("Afanasii Nikiforovich", 38, "Director",
                "$10000", "afnik@post.com", "65577554"));
        Persons.add(new Person("Vladlen Semenovich", 42, "Manager",
                "$3000", "vlasem@post.com", "35465464"));
        Persons.add(new Person("Agafia Pavlovna", 26, "Secretary",
                "$2500", "agafpifpaf@post.com", "79845656"));
        Persons.add(new Person("Luka Fedorovich", 45, "Engineer",
                "$4000", "feluk@post.com", "21354865"));
        Persons.add(new Person("Till Lindemann", 31, "Developer",
                "$5000", "lindemann@post.com", "35465452"));

        for (int i = 0; i < Persons.size(); i++) {
            if (Persons.get(i).age > 40)
                System.out.println(Persons.get(i));
        }
    }
}
