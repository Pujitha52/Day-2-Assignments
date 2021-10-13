import java.util.Scanner;

public class Hash
{
     public static void main(String args[])
     {
          Scanner s = new Scanner(System.in);
          String s1 = s.nextLine();
          String s2 = s.nextLine();
          System.out.println("Hashcode for "+s1+" : " + s1.hashCode());
          System.out.println("Hashcode for "+s2+" : " + s2.hashCode());
    }
}