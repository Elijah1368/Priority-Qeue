public class App {
    public static void main(String[] args) throws Exception {
        MyPriorityQueue test = new MyPriorityQueue<>();
        System.out.println(test.min());
        System.out.println(test);
        test.insert(4);
        System.out.println(test);
        test.insert(7);
        System.out.println(test.min());
        System.out.println(test);
        test.insert(5);
        System.out.println(test);
        test.insert(2);
        System.out.println(test.min());
        System.out.println(test);
        test.insert(3);
        System.out.println(test.min());
        System.out.println(test);
        test.insert(6);
        System.out.println(test.min());
        System.out.println(test);
        test.insert(8);
        System.out.println(test.min());
        System.out.println(test);
        test.insert(9);
        System.out.println(test.min());
        System.out.println(test);
        test.insert(1);
        System.out.println(test.min());
        System.out.println(test);
        test.insert(0);
        System.out.println(test.min());
        System.out.println(test);
   
        System.out.println(test.removeMin());
        System.out.println(test);

        System.out.println(test.removeMin());
        System.out.println(test);

        System.out.println(test.removeMin());
        System.out.println(test);

        System.out.println(test.removeMin());
        System.out.println(test);

        System.out.println(test.removeMin());
        System.out.println(test);

        System.out.println(test.removeMin());
        System.out.println(test);

        System.out.println(test.removeMin());
        System.out.println(test);

        System.out.println(test.removeMin());
        System.out.println(test);

        System.out.println(test.removeMin());
        System.out.println(test);

        System.out.println(test.removeMin());
        System.out.println(test);

        System.out.println(test.removeMin());
        System.out.println(test);
        System.out.println(test.isEmpty());

    }
}
