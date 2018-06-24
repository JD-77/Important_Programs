/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Shidhhi
 */
public class AddWioutPl 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
            int a=20;
            int b=10;
            while (b != 0)
            {
            	int carry = (a & b) ;
		a = a ^b;
		b = carry << 1; //shifts carry to 1 bit to calculate sum
            }
       System.out.println(a);
    
       int c[]=new int[5];
       for(int i=0;i<c.length;i++)
       {
           System.out.println(""+c[i]);
       }
    }
}
