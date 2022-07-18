package homework.students;

import java.util.Scanner;

public class StudentDemo {

    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("Please input 0 for exit");
            System.out.println("Please input 1 for add student");
            System.out.println("Please input 2 for print all student");
            System.out.println("Please input 3 for delete student by index");
            System.out.println("Please input 4 for print student by lesson ");
            System.out.println("Please input 5 for students student count");
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case 0:
                    run = false;
                    break;
                case 1:
                    addStudent();
                    break;
                case 2:
                    studentStorage.print();
                    break;

                case 3:
                    studentStorage.print();
                    System.out.println("Please choose student index");
                    int index = Integer.parseInt(scanner.nextLine());
                    studentStorage.deleteByIndex(index);
                    break;
                case 4:
                    System.out.println("Please input lesson name");
                    String lessonName = scanner.nextLine();
                    studentStorage.printStudentsByLessonName(lessonName);
                    break;
                case 5:
                    System.out.println("Student count");
                    System.out.println(studentStorage.getSize());
                default:
                    System.out.println("Invalid command");


            }
        }


    }

    private static void addStudent() {
        System.out.println("Please input students name");
        String name = scanner.nextLine();
        System.out.println("Please input students surname");
        String surname = scanner.nextLine();
        System.out.println("Please input students age");
        String ageStr = scanner.nextLine();
        System.out.println("Please input students phoneNumber");
        String phoneNumber = scanner.nextLine();
        System.out.println("Please input students city");
        String city = scanner.nextLine();
        System.out.println("Please input students lesson");
        String lesson = scanner.nextLine();

        int age = Integer.parseInt(ageStr);

        //   String a = String.valueOf(54); 54 tvi tesqov kdarcne stringi tesqov


        Student student = new Student(name, surname, age, phoneNumber, city,lesson);
        studentStorage.add(student);
        System.out.println("Student crated");

    }
}
