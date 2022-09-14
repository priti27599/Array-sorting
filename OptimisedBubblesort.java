
public class OptimisedBubblesort{

    public static void bubble(int arr[]){
        for(int i=0; i<arr.length;i++)
        {
            boolean swapped = false;
            for(int j=0; j<arr.length-1-i;j++)
            {
                if(arr[j]> arr[j+1])
                {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false)
            {
                break;
            }
        }
    }

    public static void printarr(int arr[])
    {
        for(int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
         int arr[]={5,4,1,3,2};
        bubble(arr);
        printarr(arr);
    }
}