package chapters.chapter7.inheritance2;

import chapters.chapter7.inheritance2.Box2;

public class OverloadCons2 {
    public static void main(String[] args) {
        Box2 myBox1 = new Box2(2, 3, 4);
        Box2 myBox2 = new Box2();
        Box2 myCube = new Box2(7);
        Box2 myClone = new Box2(myBox1); //copy constructor

        myCube.setWidth(12);
        System.out.println(myCube.getWidth());

        Box2 myClone2 = new Box2(myCube);

        myClone2.setWidth(202);//I have changed copy Object myClone2
        System.out.println(myClone2.getWidth());


        double volume;

        volume = myBox1.volume();
        System.out.println("Volume myBox1 is equals: " + volume);

        volume = myBox2.volume();
        System.out.println("Volume myBox1 is equals: " + volume);

        volume = myCube.volume();
        System.out.println("Volume myCube is equals : " + volume);

        volume = myClone.volume();
        System.out.println("Volume myClone is equals : " + volume);
    }
}
