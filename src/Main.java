public class Main {
    public static void main(String[] args) {
        Arraylist<Integer> arr1=new Arraylist<>();
        Arraylist<String> arr2=new Arraylist<>();

        System.out.println("              Example 1\n");

        arr1.add(1);
        arr1.add(2);
        arr1.add(3);

        System.out.println(arr1);

        System.out.println("arr1 size is "+arr1.size());

        System.out.println("arr1 is empty:" +arr1.isEmpty());

        System.out.println("arr1 index of 2 :"+arr1.indexOf(2));

        System.out.println("arr1 get 2:"+arr1.get(2));

        System.out.println("arr1 get first:"+arr1.getFirst());

        System.out.println("arr1 get last:"+arr1.getLast());

        arr1.addFirst(0);

        System.out.println("arr1 add first "+arr1.getFirst()+". \n"+arr1 );

        arr1.addLast(4);

        System.out.println("arr1 add last "+arr1.getLast()+". \n"+arr1 );

        System.out.println("arr1 remove "+ arr1.remove(1)+". \n"+arr1 );

        System.out.println("arr1 remove first ("+ arr1.removeFirst()+"). \n"+arr1 );

        System.out.println("arr1 remove last ("+ arr1.removeLast()+"). \n"+arr1 );

        arr1.add(4);
        arr1.addFirst(1);
        arr1.addFirst(0);

        System.out.println(arr1);

        arr1.removeRange(1,3);

        System.out.println("arr1 remove range 1-3:" +arr1);

        arr1.clear();

        System.out.println("arr1 is clear.\n" +arr1);

        System.out.println("                    Example 2");

        arr2.add("S");
        arr2.add("a");
        arr2.add("l");
        arr2.add("a");
        arr2.add("m");

        System.out.println(arr2);

        System.out.println("arr2 size is "+arr2.size());

        System.out.println("arr2 is empty:" +arr2.isEmpty());

        System.out.println("arr2 index of l :"+arr2.indexOf("l"));

        System.out.println("arr2 get 1:"+arr2.get(1));

        System.out.println("arr2 get first:"+arr2.getFirst());

        System.out.println("arr2 get last:"+arr2.getLast());

        arr2.addFirst("Ilkin Teacher");

        System.out.println("arr2 add first "+arr2.getFirst()+". \n"+arr2 );

        arr2.addLast("How are you?");

        System.out.println("arr2 add last "+arr2.getLast()+". \n"+arr2 );

        System.out.println("arr2 remove "+ arr2.remove(1)+". \n"+arr2 );

        System.out.println("arr2 remove first ("+ arr2.removeFirst()+"). \n"+arr2 );

        System.out.println("arr2 remove last ("+ arr2.removeLast()+"). \n"+arr2 );

        arr2.addFirst("S");

        System.out.println(arr2);

        arr2.removeRange(1,3);

        System.out.println("arr2 remove range 1-3:" +arr2);

        arr2.clear();

        System.out.println("arr2 is clear.\n" +arr2);


    }
}