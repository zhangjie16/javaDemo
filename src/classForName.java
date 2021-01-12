public class classForName {


    {
        System.out.println("执行普通代码块");

    }
    static{
        b = 30 ;
        System.out.println("执行静态代码块");
        //System.out.println("执行静态代码块,b="+b);  //非法，不能访问
        System.out.println("执行静态代码块,c="+getValue());
    }
    int a = 10;
    static int b = 20;
    static int c = 50;
    static int getValue(){
        return c;
    }

}
