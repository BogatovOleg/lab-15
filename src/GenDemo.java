public class GenDemo {
    GenDemo(){
        Gen<Integer> iOb;
        iOb=new Gen<Integer>(322);
        iOb.showType();
        int v = iOb.getOb();
        System.out.println("Значение: "+v);
        System.out.println();
        Gen<String> strOb = new Gen<String>("Тест1");
        strOb.showType();
        String str = strOb.getOb();
        System.out.println("Значение: "+str);
    }

}
