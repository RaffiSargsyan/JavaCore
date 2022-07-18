package homework.students;

public class StudentStorage {
    private Student[] array = new Student[10];
    private int size = 0;

    public void add(Student student) {
        if (size == array.length) {
            increaseArray();

        }
        array[size++] = student;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ". " + array[i]);

        }
    }

    public void increaseArray() {
        Student[] temp = new Student[array.length + 10];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];

        }
        array = temp;
    }

    public void deleteByIndex(int index) {
        if (index < 0 || index>= size){
            System.out.println("Invalid index");
        }else {


        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }
}

    public void printStudentsByLessonName(String lessonName) {
        for (int i = 0; i < size ; i++) {
            if (array[i].getLesson().equals(lessonName)){
                System.out.println(array[i]);

            }

        }
    }

    public int getSize() {
        return size;
    }
}
