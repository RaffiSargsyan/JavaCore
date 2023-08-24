package chapters.chapter5;

public class SampleSwitch {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            switch (i) {
                case 0:
                    System.out.println("i equals 0.");
                    break;
                case 1:
                    System.out.println("i equals 1.");
                    break;
                case 2:
                    System.out.println("i equals 2.");
                    break;
                case 3:
                    System.out.println("i equasl 3.");
                    break;
                default:
                    System.out.println("i is greater than three.");
            }

        }

    }

}
