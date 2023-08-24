package chapters.chapter7;

public class VarArgs {
    static void vaTest(int ...v){
        System.out.print("Количество аргументов"
                + v.length + "Содержимое");
        for (int i : v) {
            System.out.print(i + " ");
            System.out.println();

        }
    }

    public static void main(String[] args) {
        vaTest(10);
        vaTest(1,2,3);
        vaTest();
    }
}
