package school.management.system;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kawa Noman on 14/6/2021.
 */
public class Main {
    public static void main(String[] args) {
        Teacher kawa = new Teacher(1,"Kawa",500);
        Teacher tina = new Teacher(2,"Tina",700);
        Teacher donato = new Teacher(3,"Donato",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(kawa);
        teacherList.add(tina);
        teacherList.add(donato);


        Student mattis = new Student(1,"Mahttis",11);
        Student julie = new Student(2,"Julie",11);
        Student sarah = new Student(3,"Sarah",5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(mattis);
        studentList.add(julie);
        studentList.add(sarah);




        School kks = new School(teacherList,studentList);

        Teacher megan = new Teacher(6,"Megan", 900);

        kks.addTeacher(megan);


        julie.payFees(5000);
        sarah.payFees(6000);
        System.out.println("KKS has earned $"+ ghs.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        kawa.receiveSalary(kawa.getSalary());
        System.out.println("KKS has spent for salary to " + kawa.getName()
        +" and now has $" + ghs.getTotalMoneyEarned());

        donato.receiveSalary(vanderhorn.getSalary());
        System.out.println("KKS has spent for salary to " + donato.getName()
                +" and now has $" + ghs.getTotalMoneyEarned());


        //System.out.println(kawa);

        tina.receiveSalary(tina.getSalary());

        System.out.println(mellisa);


    }
}
