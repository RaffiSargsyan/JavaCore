package chapters.chapter5.keywordBreak;

public class Break {
    public static void main(String[] args) {
        boolean t = true;
        first:{
            second:{
                third:{
                    System.out.println("before statement, break.");
                    if (t) break first;
                    System.out.println("This statement will not be executed");
                }
                System.out.println("This statement will not be executed");
            }
            System.out.println("\"This statement follows the block,second");
        }
    }
}
