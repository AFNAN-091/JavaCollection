import java.util.*;
import java.lang.*;
public class ArrayListExample {

    /*
  #Java ArrayList class can contain duplicate elements.
  #Java ArrayList class maintains insertion order.
  #Java ArrayList class is non synchronized.
  #Java ArrayList allows random access because the array works on an index basis.
  #In ArrayList, manipulation is a little bit slower than the LinkedList in
         Java because a lot of shifting needs to occur if any element is removed from the array list.
  #We can not create an array list of the primitive types, such as int, float, char, etc.
         It is required to use the required wrapper class in such cases.

   */
    public static void main(String[] args) {
        //  ArrayList<int> arr = ArrayList<int>; primitive types are not work
        ArrayList<String> arr = new ArrayList<String>();
        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(34);
        al.add(49);
        al.add(21);
        al.add(9);
        Collections.sort(al);
        System.out.println(al);

        // add method use

        arr.add("name");
        arr.add("AFnaN");
        arr.add("Mahmud");
        System.out.println(arr);
        // traversing through iterator
        Iterator it = arr.iterator();
//        while(it.hasNext())
//        {
//            System.out.println(it.next());
//        }

        // traversing trough for each loop
        for(String str: arr)
        {
            System.out.println(str);
        }

        // element get and set at index i
        System.out.println("My name is " + arr.get(1));
        arr.set(2,"BM");
        System.out.println(arr.get(2));
        Collections.sort(arr);
        System.out.println(arr);
        arr.add("Sahed rabbi");
        arr.add("naeem");
        arr.add("farhad");
        arr.add("anirban");
        System.out.println(arr + "\n");

        //using lambda expression
        arr.forEach(a->{
            System.out.print(a + " ");
        });
        System.out.println();
        al.forEach(a->{
            System.out.print(a + " ");
        });
        System.out.println();

        //Removing elements on the basis of specified condition
        arr.removeIf(st->st.contains("AFnaN")); // here using lamdba expression
        System.out.println(arr);
        // removing specific element from arraylist
        arr.remove("naeem");
        System.out.println(arr);

        // remove element on the basis of specifi position

        arr.remove(3 );
        System.out.println(arr);

        // remove all element from arraylist

        // check arraylist empty or not
        System.out.println(arr.isEmpty());
        // a element exist or not
        System.out.println(arr.contains("BM"));
        // check arraylist size
        System.out.println(arr.size());
        System.out.println(arr.indexOf("Afnan"));
        



    }
}
