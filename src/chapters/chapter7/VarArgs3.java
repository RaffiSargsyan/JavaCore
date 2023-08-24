package chapters.chapter7;

public class VarArgs3 {
    static void vaTest(boolean b, boolean b1, boolean b2, int... v){
        System.out.println("vaTest(int...) " +
                "Количество аргументов "
                + v.length + "Содержимое");

        for (int x: v)
            System.out.print(x + " ");
        System.out.println();
    }
    static void vaTest(String проверка, int i, int i1, boolean... v){
        System.out.println("vaTest(boolean...)"+
                "Количество аргументов:"+
                v.length + "Содержимое");
        for (boolean x : v) {
            System.out.print(x + " ");
            System.out.println();
        }    
    }

    public static void main(String[] args) {
        vaTest(1,2,3);
        vaTest("Проверка", 10,20);
        vaTest(true,false,false);
    }

    private static void vaTest(int i, int i1, int i2) {
    }


}
