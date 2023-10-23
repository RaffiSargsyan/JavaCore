package chapters.chapter3;

public class Light {
    public static void main(String[] args) {
        int lightSpeed;
        long days;
        long seconds;
        long distance;

        lightSpeed = 186000;
        days = 1000;
        seconds = days * 24 * 60 * 60;

        distance = lightSpeed * seconds;

        System.out.print("for " + days);
        System.out.print(" days the light will pass about ");

        System.out.print(distance );
    }
}
