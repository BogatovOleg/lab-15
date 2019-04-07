public class Gen<T> {
    T ob;//объявление объекта типа Т
    Gen(T o){
        ob=o;
    }//передаем консутруктору ссылку на объект типа Т

    T getOb(){
        return ob;
    }

    void showType(){
        System.out.println("Типом T является "+ob.getClass().getName());
    }//показать тип Т
}
