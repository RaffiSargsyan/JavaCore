package chapters.chapter7.aboutModifiers;

public class Modifiers {
    int a; //package private
    public int b;// can use everyone
    private int c; //only can use same class Modifiers
    protected int z; // only can use classes which have inheritance

    public void setC(int i) {
        c = i;
    }

    int getC() {
        return c;
    }
}
