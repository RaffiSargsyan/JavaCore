package chapters.chapter9.test1;

public class TestIFace {
    public static void main(String[] args) {
        Client client = new Client();
        client.nonInterface();
        client.callBack(12);
        CallBack callBack = new Client();
        callBack.callBack(12);
//        callBack.nonInterface()
    }
}
