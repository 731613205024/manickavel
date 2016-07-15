/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Pos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner a=new Scanner(System.in);
        int b=a.nextInt();
        if(b<0)
        {
            System.out.println("no is negative:"+b);
        }
        else
        {
            System.out.println("no is Positive:"+b);
        }
    }
}
