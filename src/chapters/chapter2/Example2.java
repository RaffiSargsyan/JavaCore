package chapters.chapter2;

public class Example2 {
    public static void main(String[] args) {
        int num;          // only created variable,which name is - num
        num = 100;        // but in this line variable num already has value
        System.out.println("This is variable num: " + " = " + num);

        num = num * 2;
        System.out.print("This variable num * 2 equals: ");
        System.out.println(num);

        if (num < 500) {
            System.out.println("num: less is 500");
        }
        if (num > 300) {
            System.out.println("we won't see it in console");
        }
    }
}
