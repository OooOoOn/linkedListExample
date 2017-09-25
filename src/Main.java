import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] array1 = {"Meatballs", "sausage", "pork", "beef"};
        List<String> list1 = new LinkedList<String>();

        //ordinary list to test if functionality below works for it as well
        List<String> ordinaryList = new ArrayList<>();
        ordinaryList.addAll(list1);


        for(String s : array1)
            list1.add(s);

        String[] array2 = {"lemon", "apple", "parsley"};
        List<String> list2 = new LinkedList<String>();

        for(String s : array2)
            list2.add(s);

        //Add all of list2 to list1.
        list1.addAll(list2);
        list2 = null;

        printMe(list1);
        removeStuff(list1, 2, 5);
        reverseMe(list1);
        reverseMe(ordinaryList);

    }

    private static void reverseMe(List<String> l) {
        ListIterator<String> it = l.listIterator(l.size());
        while(it.hasPrevious())
            System.out.printf("%s ", it.previous());

    }

    private static void removeStuff(List<String> list1, int start, int end) {
        list1.subList(start, end).clear();
        for(String s : list1)
            System.out.printf("%s\n", s);
    }

    private static void printMe(List<String> list1) {
        for(String s : list1)
            System.out.printf("%s\n", s);
    }
}


    //CONCLUSION
    // Both list and linkedList can use an Iterator to loop through them.
    //
    // Both list and linkedList can use addAll.
