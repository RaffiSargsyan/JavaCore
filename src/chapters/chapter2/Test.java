package chapters.chapter2;

public class Test {
    public static void main(String[] args) {
        byte a;
        int x = 129;
        a = (byte) x;
        System.out.println(a);

        String s = "12";
        int z = Integer.parseInt(s);
        System.out.println(12 + z);

        String ss = a + " 1";
        System.out.println(ss);
        Test aa = new Test();
        aa.setName("asd");
        String name1 = aa.getName();
        System.out.println(name1);
    }
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
