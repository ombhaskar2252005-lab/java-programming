public class String1 {
    public static void main(String[] args) {

        //1.creation
        String s1 = "hello";
        String s2 = new String(" world");
        System.out.println(s1);
        System.out.println(s2);
        //2.comparison - returns boolean value
        System.out.println(s1.equals(s2));
        //question check admin
        //3.methods
        //length
        System.out.println(s1.length());
        //toUpperCase
        System.out.println(s1.toUpperCase());
        //toLowerCase
        System.out.println(s1.toLowerCase());
        //charAt
        System.out.println(s1.charAt(2));
        //concat
        System.out.println(s1 + s2);
        System.out.println(s1.concat(s2));
        // print individual characters of a string
        String name = "hlo bro";
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }

    }
}