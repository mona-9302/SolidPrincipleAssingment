import java.util.*;
import java.util.LinkedList;

class CompareListPerformance {
    public static void main(String[] args) {

        List<Integer> sizes = Arrays.asList(10000, 50000, 100000);

        for (Integer size : sizes) {

            List<Integer> arrayList = new ArrayList<>();
            long arrayInsertTime = insertElements(arrayList, size);
            long arrayDeleteTime = deleteElements(arrayList, size);

            System.out.println("arrayListInsertion  ----->" + arrayInsertTime);
            System.out.println("arrayListDeletion ------>" + arrayDeleteTime);

            List<Integer> linkedList = new LinkedList<>();
            long linkInsertTime = insertElements(linkedList, size);
            long linkDeleteTime = deleteElements(linkedList, size);

            System.out.println("LinkedListInsertion ----->" + linkInsertTime);
            System.out.println("LinkedListDeletion ------>" + linkDeleteTime);
        }
    }

    public static long insertElements(List<Integer> list, int size) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            list.add(i);  // inserting at end
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long deleteElements(List<Integer> list, int size) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.remove(0);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}
