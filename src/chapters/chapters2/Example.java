package chapters.chapters2;


public class Example {
    public static void main(String[] args) {
        System.out.println("Hello World");
        //  System.gc(); garbage collector
        System.currentTimeMillis();//time since 1970y.when made unix
        char c = 65;
        char b = '\'';
        char d = '\\';
        int x = 'A';   //without error,because with use Unicode,char place is 16 bit = short
        double a = 5; //5.0
        System.out.print(c + " " + b + " " + d + " " + x + " " + a);
    }
}
