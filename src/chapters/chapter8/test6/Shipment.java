package chapters.chapter8.test6;

public class Shipment extends BoxWeight {
    double cost;

    Shipment(Shipment Ob) {
        super(Ob);
        cost = Ob.cost;
    }

    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        cost = c;
    }

    Shipment() {
        super();
        cost = -1;
    }

    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}
