public class NonGenDemo {
    NonGenDemo(){
        NonGen iOb;
        iOb=new NonGen(777);
        iOb.showType();
        int v = (Integer) iOb.getOb();
        System.out.println("Значение: "+v);
        System.out.println();
        NonGen strOb = new NonGen("Тест без обобщений");
        strOb.showType();
        String str = (String) strOb.getOb();
        System.out.println("Значение: "+str);
        //iOb = strOb;
        //v=(Integer) iOb.getOb();
    }
}
