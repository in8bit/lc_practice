package recursion;

public class MergeSort {

    public static void main(String[] args) {
        int [] data = new int[]{-4,5,67,89,-10,34,5};
        mergeSort(data,0, data.length-1 );
        for(int d: data){
            System.out.println(d);
        }
    }

    //divide the given array into two halves and sort them in ascending order.
    public static void mergeSort(int [] data, int start, int end){
        //only sort when start < end
        if(start < end){
            int mid = (start+end) /2;
            mergeSort(data, start, mid); //calling on the left half
            mergeSort(data, mid+1, end); //calling on the right half
            merge(data, start, mid, end);
        }

    }

    // merge the given array
    public static void merge(int [] data, int start, int mid, int end){
        int [] tempArray = new int[end-start+1]; // TODO understand the size selection
        int i = start;
        int j = mid+1; //mid +1 : because now i have 4 pointers now in the data
        int k =0;

        /*
         i<= mid : means there is the value in the left sub array
         mid+1 <= end : means that there is value in the right sub array
         so if these conditions are true - the sub arrays are not empty yet
         */

        while(i<=mid && j<=end){
            /*
            check if the data in the left sub array is less than the value
            of data in right sub array
             */
            if(data[i] <= data[j]){
                tempArray[k] = data[i];
                i++;
                k++;
            }else{
                tempArray[k] = data[j];
                j++;
                k++;
            }
        }// end of while that check of there is data in both the left and right sub array

        /*if anyone of the two subarray get empty but the other doesnt,
         put the remaining sorted values in the tempArray */

        // from leftsubarray
        while(i <= mid){
            tempArray[k] = data[i];
            k++;
            i++;
        }

        //from right subarray
        while(j <= end){
            tempArray[k] = data[j];
            k++;
            j++;
        }
        //override the original array with the sorted values
        for(int x= start; x<=end ;x++){
            data[x] = tempArray[x-start];
        }
    }// end of merge method


}
