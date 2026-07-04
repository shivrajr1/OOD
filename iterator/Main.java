public class Main {
    public static void main(String[] args) {
        Concrete concrete=new Concrete();
        concrete.add(new Obj("name1",1));
        concrete.add(new Obj("name2",2));
        concrete.add(new Obj("name3",3));
        concrete.add(new Obj("name4",4));
        concrete.add(new Obj("name5",5));
        ObjIterator<Obj> iterator=concrete.getIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().name);
        }
    }
}
