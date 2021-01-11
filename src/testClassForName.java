public class testClassForName {

    public  static  void  main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String str = "classForName";
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class<?> obj =  Class.forName(str,true,loader);
        System.out.println(obj.getClass());

        //System.out.println("b="+((classForName)obj).b);
        classForName target = (classForName) obj.newInstance();
        System.out.println("a="+target.a);
        System.out.println("b="+target.b);
    }

}
