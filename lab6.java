package lab6;



/**

 *



 */

public class Lab6 {



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

         Lab6 a=new Lab6(), a1=new Lab6();

        a.fun(4,15);

        a1.fun(5,16);

        a.show();

        a1.show();

 

    }

    

}
