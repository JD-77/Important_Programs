
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

 class Test3
 {
    public static void main(String args[])
    {
        HashSet<Integer> ar=new HashSet<Integer>();
        ar.add(1);
        ar.add(2);
        ar.add(7);
        ar.add(5);
        
        System.out.println(ar);
        ar.add(8);
        
        
        System.out.println(ar);
        }
}