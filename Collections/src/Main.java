import models.Student;
import models.Teacher;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Добавляем студентов в список
        List<Student> students = new ArrayList<>();

        Student student1 = new Student();
        student1.setFullName("Алия");
        student1.setAge(19);
        student1.setCourse(2);
        student1.setGroup(306);
        student1.setEmail("aliya.5645@mail.com");

        Student student2 = new Student();
        student2.setFullName("Илона");
        student2.setAge(19);
        student2.setCourse(2);
        student2.setGroup(306);
        student2.setEmail("ilona.567@mail.com");

        Student student3 = new Student();
        student3.setFullName("Диана");
        student3.setAge(19);
        student3.setCourse(2);
        student3.setGroup(306);
        student3.setEmail("diana.456@mail.com");

        Student student4 = new Student();
        student4.setFullName("Ангелина");
        student4.setAge(19);
        student4.setCourse(2);
        student4.setGroup(307);
        student4.setEmail("angelina.4321@mail.com");

        //Добавляем учителей в стек
        Stack<Teacher> teachers = new Stack<>();

        Teacher teacher1 = new Teacher();
        teacher1.setFullName("Полосатая");
        teacher1.setAge(30);
        teacher1.setSubject("Русский");
        teacher1.setEmail("alexeyeva876@mail.com");

        Teacher teacher2 = new Teacher();
        teacher2.setFullName("Сова");
        teacher2.setAge(40);
        teacher2.setSubject("История");
        teacher2.setEmail("valeyeva1861@mail.com");

        Teacher teacher3 = new Teacher();
        teacher3.setFullName("Груша");
        teacher3.setAge(50);
        teacher3.setSubject("Математика");
        teacher3.setEmail("sharapova345@mail.com");

        Teacher teacher4 = new Teacher();
        teacher4.setFullName("Дениска");
        teacher4.setAge(40);
        teacher4.setSubject("Физика");
        teacher4.setEmail("ephimov314@mail.com");

    // Работа со списком студентов (ArrayList)
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        System.out.println("Студенты: ");
        students.forEach(System.out::println);

        System.out.println("Удалили 1-го и последнего студента: ");
        students.remove(student1);
        students.removeLast();
        students.forEach(System.out::println);

        System.out.println("Размер списка: " + students.size());

    // Добавление студентов с помощью конструктора
    //     students.add(new Student("Матвей", 20, 4, 310, "mot.325@mail.com"));

    //Работа со стеком учителей (Stack)
        teachers.push(teacher1);
        teachers.push(teacher2);
        teachers.push(teacher3);
        teachers.push(teacher4);

        System.out.println("Стек учителей: ");
        teachers.forEach(System.out::println);

        System.out.println("Удаляем и возвращаем верхний элемент стека: " + teachers.pop());
        System.out.println("Возвращаем верхний элемент, не удаляя его: " + teachers.peek());
        System.out.println("Количество элементов: " + teachers.size());
        System.out.println("Проверка на пустоту: " + teachers.isEmpty());

        //Работа с Map
        Map<String, Student> studentMap = new HashMap<>();
        studentMap.put("Алия", student1);
        studentMap.put("Илона", student2);
        studentMap.put("Диана", student3);
        studentMap.put("Ангелина", student4);

        System.out.println("Студенты в Map: ");
        for (Map.Entry<String, Student> entry :studentMap.entrySet()){
            System.out.println("Ключ: " + entry.getKey() + " -> Значение: " + entry.getValue());
        }

        System.out.println("Получаем студента по ключу: " + studentMap.get("Диана"));
        System.out.println("Проверяем, есть ли студент с именем Алибаба: " + studentMap.containsKey("Алибаба"));

        //Удаляем студента
        System.out.println("Удаляем студента: " + studentMap.remove("Ангелина"));
        studentMap.forEach((k, v) -> System.out.println(k +  "->" + v));

        //Очищаем map
        studentMap.clear();
        System.out.println("Проверка на пустоту: " + studentMap.isEmpty());


    }
}