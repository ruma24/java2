package lab4;



/**

 *



 */

public class Lab4 {



    /**

     * @param args the command line arguments

     */

    int len;

    int width;

    void fun(int l,int w) 

    {

        len=l;

        width=w;

    }

    void show()

    {

        System.out.println(len*width);

        

    }

    public static void main(String[] args) {

        // TODO code application logic here

        Lab4 a=new Lab4();

        Lab4 a1=new Lab4();

        a.fun(4,5);

        a1.fun(5,6);

        a.show();

        a1.show();

    }

    

}
