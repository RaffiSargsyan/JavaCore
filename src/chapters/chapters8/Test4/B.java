package chapters.chapters8.Test4;

public class B extends A {
    int i;

    B(int a, int b){
        super.i = a; //iz a klasa
        i = b; // iz b klasa
    }
    void show(){
        System.out.println("Член i в суперклассе " + super.i);
        System.out.println("Член i в подклассе " + i);
    }
}
