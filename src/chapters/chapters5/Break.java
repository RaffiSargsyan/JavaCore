package chapters.chapters5;

public class Break {
    public static void main(String[] args) {
        boolean t = true;
        first:
        {
            second:
            {
                third:
                {
                    System.out.println("ПРЕДШУСВУЕТ ОПЕРАТОРУ break.");
                    if (t) break second;
                    System.out.println("ЭТОТ ОПЕРАТОР НЕ БУДЕТ ВИПОЛНЯТЬСЯ");

                }
                System.out.println("ЭТОТ ОПЕРАТОР НЕ БУДЕТ ВИПОЛНЯТЬСЯ");
            }
            System.out.println("ЭТОТ ОПЕРАТОР СЛЕДУЕТ ЗА БЛОКОМ  second");
        }
    }
}
