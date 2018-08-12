package lab3;



/**

 *

 * @author Karthikeyan

 */

public class Lab3 {



    /**

     * @param args the command line arguments

     */

    int rno;

    String name;

    void fun(int roll_no,String na) 

    {

        rno=roll_no;

        name=na;

    }

    void show()

    {

        System.out.println("ROLL NO:"+rno);

        System.out.println("ROLL NO:"+name);

    }

    public static void main(String[] args) {

        // TODO code application logic here

        Lab3 a=new Lab3();

        Lab3 a1=new Lab3();

        a.fun(25,"ruma");

        a1.fun(16,"shanu");

        a.show();

        a1.show();

    }

    

}
