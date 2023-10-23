package chapters.chapter9.test1;

public class Client implements CallBack {
    @Override
    public void callBack(int p) {
        System.out.println("In interface CallBack");
    }

    void nonInterface() {
        System.out.println("We can have own methods");
    }
}
