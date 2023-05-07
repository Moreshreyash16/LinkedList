package Bridgelabz.Linklist;


import java.util.Iterator;
import java.util.LinkedList;

public class Liinklist {

    public static void main(String[] args) {
        LinkedList list = new LinkedList<Integer>();
        list.add(70);
        list.add(30);
        list.add(56);
//        uc 2
        list.addFirst(70);
        list.add(30);
        list.add(56);

//        uc 3
        list.addFirst(56);
        list.add(30);
        list.add(70);

//        uc4
        list.addFirst(56);
        list.add(30);
        list.add(1,70);
        Iterator i = list.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
//        uc5
        list.addFirst(56);
        list.add(30);
        list.add(70);
        list.removeFirst();
        while(i.hasNext()){
            System.out.println(i.next());
        }
//        uc6
        list.addFirst(56);
        list.add(30);
        list.add(70);
        list.removeLast();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
//        uc7
        list.addFirst(56);
        list.add(30);
        list.add(70);
        while (i.hasNext()) {
            if(list.contains(30)){
                System.out.println(i.next());
                break;
            }
        }
//      uc8
        int indx=1;
        list.addFirst(56);
        list.add(30);
        list.add(70);
        indx=list.indexOf(30);
        list.add(indx,40);

        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

}