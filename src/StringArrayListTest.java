public class StringArrayListTest {

    public static void main(String[] args) {
        StringArrayList list = new StringArrayList();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        System.out.println("get() TEST: " + list.get(3));
        //get() TEST: 4
        list.add("6");
        list.add("7");
        list.println();
        //1 2 3 4 5 6 7

        list.insert(0, "0");
        list.insert(5, "55");
        list.println();
        //0 1 2 3 4 55 5 6 7

        list.remove(3);
        list.println();
        //0 1 2 4 55 5 6 7

        list.set(3, "33");
        list.println();
        //0 1 2 33 55 5 6 7

        list.add("8");
        list.println();
        //0 1 2 33 55 5 6 7 8

        if (list.contains("8")) {
            int tempIndex = list.indexOf("8");
            list.set(tempIndex, "9");
        }

        list.println();
        //0 1 2 33 55 5 6 7 9
    }
}
