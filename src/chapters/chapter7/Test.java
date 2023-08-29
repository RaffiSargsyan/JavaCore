package chapters.chapter7;

public class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    boolean equalTo(Test own) {
        if (own.a == a && own.b == b) {
            return true;
        } else {
            return false;
        }
    }
}