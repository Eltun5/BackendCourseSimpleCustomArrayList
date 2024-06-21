import java.util.Arrays;
import java.util.NoSuchElementException;
public class Arraylist<T> {
    private final int DefNum =10;
    private T[] arr;
    private int length=DefNum;
    private int lastIndex=0;
    public Arraylist() {
        this.arr =(T[]) new Object[DefNum];
    }
    public void add(T t){
        if(lastIndex==length-1){
            T[] newArr=(T[]) new Object[arr.length*2];
            length= newArr.length;
            System.arraycopy(arr, 0, newArr, 0, arr.length);
            arr=newArr;
        }
        arr[lastIndex]=t;
        lastIndex++;
    }
    public int size() {
        return lastIndex;
    }
    public boolean isEmpty() {
        return lastIndex == 0;
    }
    public int indexOf(T t) {
        for (int i=0;i<lastIndex+1;i++){
            if(t==arr[i]){
                return i;
            }
        }
        return -1;
    }
    public T get(int index) {
        return arr[index];
    }
    public T getFirst() {
        if (lastIndex == 0) {
            throw new NoSuchElementException();
        } else {
            return arr[0];
        }
    }
    public T getLast() {
        if (lastIndex == 0) {
            throw new NoSuchElementException();
        } else {
            return arr[lastIndex-1];
        }
    }
    public void addFirst(T t) {
        T[] newArr=(T[]) new Object[arr.length+1];
        length= newArr.length;
        System.arraycopy(arr, 0, newArr, 1, arr.length);
        arr=newArr;
        arr[0]=t;
        lastIndex++;
    }
    public void addLast(T t) {
        add(t);
    }
    @Override
    public String toString() {
        StringBuilder a=new StringBuilder();
        for (int i = 0; i < lastIndex; i++) {
            a.append(arr[i]).append(",");
        }
        if (!a.isEmpty()) a.deleteCharAt(a.length()-1);
        return "{"+a+"}";
    }
    public T remove(int index) {
        if (index>lastIndex){
            throw new IndexOutOfBoundsException();
        }
        T[] newArr=(T[]) new Object[arr.length-1];
        length= newArr.length;
        if (index >= 0) System.arraycopy(arr, 0, newArr, 0, index);
        T remove=arr[index];
        if (arr.length - (index + 1) >= 0)
            System.arraycopy(arr, index + 1, newArr, index, arr.length - (index + 1));
        arr=newArr;
        lastIndex--;
        return remove;
    }
    public T removeFirst() {
        if (lastIndex==0){
            throw new IndexOutOfBoundsException();
        }
        T[] newArr=(T[]) new Object[arr.length-1];
        length= newArr.length;
        System.arraycopy(arr, 1, newArr, 0, arr.length-1);
        T first=arr[0];
        arr=newArr;
        lastIndex--;
        return first;
    }
    public T removeLast() {
        if (lastIndex==0){
            throw new IndexOutOfBoundsException();
        }
        T[] newArr=(T[]) new Object[arr.length-1];
        length= newArr.length;
        System.arraycopy(arr, 0, newArr, 0, arr.length-1);
        T last=arr[lastIndex-1];
        arr=newArr;
        lastIndex--;
        return last;
    }
    public void clear() {
        lastIndex=0;
        arr=(T[]) new Object[length];
    }
    protected void removeRange(int first, int last) {
        if (last>lastIndex||first>last||last>lastIndex){
            throw new IndexOutOfBoundsException();
        }
        T[] newArr=(T[]) new Object[arr.length-(last-first)];
        length= newArr.length;
        if (first >= 0) System.arraycopy(arr, 0, newArr, 0, first);
        if (arr.length - (last + 1) >= 0)
            System.arraycopy(arr, last + 1, newArr, first, arr.length - (last + 1));
        arr=newArr;
        lastIndex-=1+(last-first);
    }
}
