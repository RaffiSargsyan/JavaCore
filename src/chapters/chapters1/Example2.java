package chapters.chapters1;

public class Example2 {
    public static void main(String[] args) {
        int num;             // в этой строке кода объявляется переменная, с именем num
        num = 100;           // в этой строке кода переменной num, присваивается значение 100
        System.out.println("Этo переменная num: " + " = " + num);

        num = num * 2;
        System.out.println("Знaчeниe переменной num * 2 равно " + num);

        if (num > 100) {
            System.out.println("num больше 100");
        }
        if (num < 200) {
            System.out.println("Вы не увидите этого");
        }
    }
}