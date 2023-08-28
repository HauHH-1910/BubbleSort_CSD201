
public class Main {

    static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        //sample array
        int[] Array = {1,5,3,2,4,0,7,8,9,4};
        System.out.print("Before using Bubble sort: ");
        display(Array);
        BubbleSort ob = new BubbleSort();
        ob.Sort(Array);
        System.out.println("");
        System.out.print("After using Bubble sort: ");
        display(Array);
    }

}
