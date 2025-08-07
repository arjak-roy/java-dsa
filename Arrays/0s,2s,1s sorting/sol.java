import java.util.Scanner;

class sol{
    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    //Dutch National Flag Algorithm
    static void sort012(int arr[], int n){
        // three pointers 
        //low for 0s, mid for 1s, high for 2s
        // low = 0, mid = 0, high = n-1
        int low = 0, mid = 0, high = n-1;
        //traverse the array till mid <= high
        while(mid <= high){
            switch(arr[mid]){
                //if 0, swap low and mid, increment low and mid
                case 0:
                    swap(arr, low, mid);
                    low++;
                    mid++;
                    break;
                //if 1, increment mid
                case 1:
                    mid++;
                    break;
                //if 2, swap mid and high, decrement high
                case 2:
                    swap(arr, mid, high);
                    high--;
                    break;
            }
        }
    }
    public static void main(String args[]){
        int arr[]  = new int[6];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<6; i++){
            arr[i] = sc.nextInt();
        }
        sort012(arr, 6);
        for(int i = 0; i<6; i++){
            System.out.print(arr[i] + " ");
        }


        sc.close();
    }
}