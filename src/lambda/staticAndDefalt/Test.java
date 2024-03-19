package lambda.staticAndDefalt;

public class Test {
    public static void main(String[] args) {
        //anonymous inner class
        Musician pianist = new Musician() {
            @Override
            public void playMusic() {
                System.out.println("Playing piano");
            }
        };
        pianist.playMusic();

        //Lambda expressions
        Musician guitarist = () -> System.out.println("Lambda expressions");

        guitarist.playMusic();

        Message sms = (text) -> {
            System.out.println("Sending sms " + text);
        };
    }
}
