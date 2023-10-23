package chapters.chapter8.test5;

 class B extends A {
    int i;

    B(int a, int b) {
        super.i = a;
        i = b;
    }
    void show (){
        System.out.println("This is in superclass i " + super.i);
        System.out.println("That is in subclass i " + i);

    }
}
