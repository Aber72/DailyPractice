public class SortingAlgo {
    public static void BubbleSort(int arr[], int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                   int temp= arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        
    }

    public static void SelectionSort(int arr[],int n){
        for(int i=0;i<n;i++){
            int min  = i;
            for(int j =i;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
                int temp = arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }
    }

    public static void InsertionSort(int arr[],int n){
        for(int i=0;i<n;i++){
            int j =i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j];
                arr[j]= arr[j-1];
                arr[j-1]= temp;
                j--;
            }
        }
    }

    public static void Print(int arr[], int n,String s){
        System.out.println(s);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.println("______________________________________");
    }


    public static void main(String[] args) {
        int[] arr = {5,2,3,4,1,6};
        BubbleSort(arr,6);
        Print(arr,6,"Bubble Sort");
        SelectionSort(arr, 6);
        Print(arr,6,"Selection Sort");
        InsertionSort(arr, 6);
        Print(arr, 6, "Insertion Sort");
        
    }
    
}
