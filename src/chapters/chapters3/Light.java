package chapters.chapters3;

public class Light {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        lightspeed = 186000;

        days = 1000;
        seconds = days * 24 * 60 * 60;

        distance = lightspeed * seconds;

        System.out.print("luys@ " + days);
        System.out.print(" orva  kancni ");
        System.out.println(distance + " milivarkyan");
    }
}
