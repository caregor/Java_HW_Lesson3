import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ArrayList<Integer> al = new ArrayList<>();
        System.out.print("Time LinkedList add: ");
        TestLists(ll);
        System.out.print("Time ArrayList add: ");
        TestLists(al);
        System.out.print("Time LinkedList set: ");
        TestSets(ll);
        System.out.print("Time ArrayList set: ");
        TestSets(al);
        System.out.print("Time LinkedList get: ");
        TestGets(ll);
        System.out.print("Time ArrayList get: ");
        TestGets(al);
    }
    static void TestLists(List<Integer> lst){
        Date beginTime = new Date();
        for (int i = 0; i < 100000; i++) {
            lst.add(i, i);
        }
        Date finishTime = new Date();
        long msDelay = finishTime.getTime() - beginTime.getTime();
        System.out.println(msDelay);
    }
    static void TestSets(List<Integer> lst){
        Date beginTime = new Date();
        for (int i = 0; i < 10000; i++) {
            lst.set(i, i);
        }
        Date finishTime = new Date();
        long msDelay = finishTime.getTime() - beginTime.getTime();
        System.out.println(msDelay);
    }
    static void TestGets(List<Integer> lst){
        Date beginTime = new Date();
        for (int i = 0; i < 10000; i++) {
            lst.get(i);
        }
        Date finishTime = new Date();
        long msDelay = finishTime.getTime() - beginTime.getTime();
        System.out.println(msDelay);
    }
}
