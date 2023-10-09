package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = Student.builder()
                .id(1)
                .name("Illyrio Mopatis")
                .address("Pentos")
                .grade(15)
                .build();
        System.out.println(student1);
        Student student2 = Student.builder()
                .id(2)
                .name("Hot Pie")
                .address("Street")
                .grade(2)
                .build();
        System.out.println(student2);
        Student student3 = Student.builder()
                .id(3)
                .name("Bobby B")
                .address("King's Landing")
                .grade(1)
                .build();
        System.out.println(student3);
        Teacher teacher1 = Teacher.builder()
                .id(4)
                .name("Lady Stoneheart")
                .subject("Family values and resurrections")
                .build();
        System.out.println(teacher1);

        Teacher teacher2 = teacher1.withSubject("Science");
        System.out.println(teacher2);

        List<Student> students1 = Arrays.asList(student1, student2, student3);

        Course course1 = Course.builder()
                .id(1)
                .name("Westerosi procrastinators")
                .teacher(teacher1)
                .students(students1)
                .build();
        System.out.println(course1);


/*
        Car vw = car.withBrand("VW");
        car.setBrand("Toyota");
        System.out.println(car);
        System.out.println(vw);

        CarRepository carRepository = new CarRepository();
        CarService carService = new CarService(carRepository);

        carService.addCar(car);
        System.out.println(carService.getCarById("1"));
*/
        }
    }
