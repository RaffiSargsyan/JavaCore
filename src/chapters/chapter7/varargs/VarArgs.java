package chapters.chapter7.varargs;

public class VarArgs {
    static void vaTest(int... v) {
        System.out.println("Argument count: "
                + v.length + " content: ");

        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(12,4,5,6,2);
        vaTest(10);
        vaTest();
    }
//    int dolt(int x,int y, int z,double d,int ... var){
//        System.out.println("This is ok");
//    }

//    int dolt(int x, int y, int ... var ,double d){
//        System.out.println("This isn't ok,because JVM don't understand which int have to call");
//    }

//    int dolt(int ... x,int ... y){
//        System.out.println("This is error too");
//    }
}
