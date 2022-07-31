package classwork.string;

public class StringTest {
    public static void main(String[] args) {
        String name = "Poxos Poxosyan Poxosi";
        char[] chars = name.toCharArray();
        String result = "";
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'o') {
                result += "o".toUpperCase();//ete ka o tar@ darcra mecatar

            } else {
                result += chars[i];
            }
        }
        System.out.println(result);
        for (int i = 0; i < name.length() ; i++) {
            System.out.print(name.charAt(i));
        }
        //String[] split = name.split(" ");


        //  System.out.println(split[0]);//split@ kverace masvi Stringin
        //  System.out.println(split[1]);
        //  System.out.println(split[2]);
    }
    //System.out.println("length " + name.length());
    //String substring = name.substring(4 );
    //System.out.println(substring);


//        System.out.println(name);
//        System.out.println(name.trim());//prabelner@ khane bayc voch mejtexine
//        System.out.println(name.trim().toUpperCase());
//        System.out.println(name.trim().toLowerCase());
//
//        String ly = "asdsfly";
//        System.out.println(ly.endsWith("ly"));//verjanag@ mer tvacov te che es depqum true
//        System.out.println(ly.startsWith("ly"));//sksvig# te che
//        System.out.println(ly.contains("ly"));//parunakek@ te che gone me texm


}



