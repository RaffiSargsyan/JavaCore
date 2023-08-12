package chapters.chapters1;

public class Example2 {
    public static void main(String[] args) {
        int num;       // only variable,which name is - num
        num = 100;     // variable num already have value
        System.out.println("Этo переменная num: " + " = " + num);

        num = num * 2; //here num 100 then 100 * 2 = 200
        System.out.print("Знaчeниe переменной num * 2 равно: ");
        System.out.println(num);

        if (num < 500) {
            System.out.println("num: меньше 300");
        }
        if (num > 300) {
            System.out.println("Мы не увидим этого в консоле");
        }
    }
}
