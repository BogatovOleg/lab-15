public class SimpGen {
    SimpGen(){
        TwoGen<Integer, String> tgobj = new TwoGen<Integer, String>(322,"Обобщения");
        tgobj.showTypes();
        int v = tgobj.getOb1();
        System.out.println("Значение: "+v);
        String str = tgobj.getOb2();
        System.out.println("Значение: "+str);
    }
}
