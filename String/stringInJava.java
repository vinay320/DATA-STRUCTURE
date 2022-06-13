package String;

public class stringInJava {
    public static void main(String[] args) {
        String s="Hello";
        System.out.println(s.length());
        System.out.println(s.charAt(1));
        System.out.println(s.substring(2));
        System.out.println(s.substring(2,4));  //from fisrt=2 to  last=(4-1)
        String s1="Hello";
        if(s==s1)
        {
            System.out.println("Yes");
        }
        String s3=new String("Hello");
        if (s==s3)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

        String s4="HelloWorld";
        System.out.println(s.equals(s4));
        System.out.println(s1.compareTo(s3));
        System.out.println(s4.indexOf("l",1));

    }
}
