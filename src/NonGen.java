public class NonGen {
    Object ob;

    NonGen(Object o){
        ob=o;
    }

    Object getOb(){
        return ob;
    }

    void showType(){
        System.out.println("Объект ob относится к типу "+getOb().getClass().getName());
    }
}
