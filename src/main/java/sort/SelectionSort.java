package sort;

public class SelectionSort {
    void sort(int ar[])
    {
        for (int i = 0; i < ar.length-1; i++)
        {
            int min = i;
            for (int j = i+1; j < ar.length; j++){
            if (ar[j] < ar[min]) min = j;}

            int temp = ar[i];
            ar[i] = ar[min];
            ar[min] = temp;
        }
    }

    // Prints the array
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    // Driver code to test above
    public static void main(String args[])
    {
        SelectionSort ob = new SelectionSort();
        int arr[] = {64,25,12,22,11};
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
