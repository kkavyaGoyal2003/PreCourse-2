package Exercise2;
// Time Complexity : average- O(nlogn) , but in our case of end as the pivot worst case - O(n^2)
// Space Complexity : O(log n) recursive calls
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

class QuickSort
{ 
    /* This function takes last element as pivot, places the pivot element at its correct
       position in sorted array, and places all  smaller (smaller than pivot) to left of
       pivot and all greater elements to right of pivot */
    void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    int partition(int arr[], int low, int high) 
    {
            int pivot = arr[high];
            int i = low - 1;
            for(int j = low; j < high; j++) {
                if(arr[j] < pivot) {
                    i++;
                    swap(arr, i, j);
                }
            }
            i++;
            swap(arr, i, high);
            return i;
    } 

    void sort(int arr[], int low, int high) 
    {
            if(low < high)  {
                // finding the new pivot
                int pivot = partition(arr, low, high);

                // left subarray of pivot
                sort(arr, low, pivot-1);

                // right subarray of pivot
                sort(arr, pivot+1, high);
            }
    } 
  
    /* A utility function to print array of size n */
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
  
    // Driver program 
    public static void main(String args[]) 
    { 
        int arr[] = {10, 7, 8, 9, 1, 5}; 
        int n = arr.length; 
  
        QuickSort ob = new QuickSort(); 
        ob.sort(arr, 0, n-1); 
  
        System.out.println("sorted array"); 
        printArray(arr); 
    } 
} 
