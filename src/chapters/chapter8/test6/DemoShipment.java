package chapters.chapter8.test6;

public class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);

        double vol;
        vol = shipment1.volume();
        System.out.println("Volume shipment1 equals " + vol);
        System.out.println("Weight shipment1 equals " + shipment1.weight);
        System.out.println("Price shipment1 equals " + shipment1.cost);
        System.out.println();
        System.out.println("Volume shipment2 equals " + vol);
        System.out.println("Weight shipment2 equals " + shipment2.weight);
        System.out.println("Price shipment2 equals " + shipment2.cost);
    }
}
