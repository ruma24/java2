package lab15;



/**

 *

 

 */

public class Lab15 {



    /**

     * @param args the command line arguments

     */

    int rno;

    String name;

    Lab15(int a)

            {

               System.out.println(a);

            }

    Lab15(Lab15 n)

    {

        System.out.println(n.rno+" "+n.name);

    }

    public static void main(String[] args) {

        // TODO code application logic here

        Lab15 m=new Lab15(5);

        Lab15 l=new Lab15(m);

        

        

    }

    

}
