/*
public class Ex {
    public <E> void printArray(E[] args) {
        for (E x : args) {
            System.out.println(x);
        }
    }

    public static void main(String args[]) {
        Ex ex = new Ex();
        String s[] = {"cat", "dog", "cow"};
        ex.printArray(s);
        Integer i[] = {1, 2, 3, 4, 5};
        ex.printArray(i);
    }
}
*/
//Use of Generic Class

class MyData <E>{
    E i;
    public void set(E i1)
    {
        i = i1;
    }
    public E get()
    {
        return i;
    }
}
public class Example
    {
        public static void main (String[] args) {
            MyData <Integer> m = new MyData <Integer>();
            MyData <String> m1 = new MyData <String>();
            Integer k = new Integer(5);
            m.set(k);
            m1.get();
            m1.set("Rohit");
            m1.get();
        }
    }