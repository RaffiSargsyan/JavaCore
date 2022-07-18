package chapters.chapters10;

public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;

        ap = Apple.RedDel;

        System.out.println("Значение ар:" + ap);
        System.out.println();

        ap = Apple.GoldenDel;

        if (ap == Apple.GoldenDel)
            System.out.println(
                    "Переменная ap содержит GoldenDel.\n");

        switch (ap){
            case Jonathan:
                System.out.println("Сорт Jonathan красный");
                break;
            case GoldenDel:
                System.out.println( "Сорт Jonhathan красный" );
                break;
            case RedDel:
                System.out.println("Сорт Red Delicious желтый");
                break;
            case Winesap:
                System.out.println("Сорт Winesap красный");
                break;
            case Cortland:
                System.out.println("Сорт Cortland красный");
                break;
        }
    }
}
