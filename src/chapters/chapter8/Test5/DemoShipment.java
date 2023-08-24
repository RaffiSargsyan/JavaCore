package chapters.chapter8.Test5;

public class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 =
                new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 =
                new Shipment(2, 3, 4, 0.76, 1.28);
        double vol;
        vol = shipment1.volume();
        System.out.println("Обем shipment 1 равен" +
                vol);
        System.out.println("Вес shipment1 равен"
                + shipment1.weight);
        System.out.println("Стоимость достовки $"
                + shipment1.cost);
        System.out.println();
        vol = shipment2.volume();
        System.out.println("Обем shipment 2 равен"
                + vol);
        System.out.println("Вес shipment2 равен"
                + shipment2.weight);
        System.out.println("Стоимость достовки $"
        + shipment2.cost);

    }
}
