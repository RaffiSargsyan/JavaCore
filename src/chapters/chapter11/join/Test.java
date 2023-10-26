
package chapters.chapter11.join;

public class Test {
    public static void main(String[] args) {
        JoinExample2 myThread = new JoinExample2();
        myThread.start();


        // Waiting

        try {

            myThread.join(8000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread continues work,after myThread is finish.");
    }
}
