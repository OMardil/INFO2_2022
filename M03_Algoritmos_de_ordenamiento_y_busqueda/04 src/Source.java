public class Source{

    public static void main(String[] args){

        int[] arr1 = {1,3,2,5,8,1,3,4,11};
        for(int out:arr1){
            System.out.print(out + " ");
        }
        System.out.println();

        bubbleSort(arr1);
        for(int out:arr1){
            System.out.print(out + " ");
        }
        System.out.println();

        arr1 = new int[]{1,3,2,5,8,1,3,4,11};
        bubbleSort(arr1);

        arr1 = new int[]{1,2,3,4,5,6,7,8,9};
        bubbleSort(arr1);
        
        arr1 = new int[]{9,8,7,6,5,4,3,2,1};
        bubbleSort(arr1);
        
        arr1 = new int[]{1,9,2,8,3,7,6,4,5,2};
        bubbleSort(arr1);        

    }


    //Linear search
    public static int findElement(int[] array, int target){
        for(int i=0; i<array.length; i++){
            if (array[i] == target)
                return  i;
        }
        return -1;
    } 


    //Selection Sort
    public static void selectionSort(int[] array){

        //check valid input array
        if (array == null)
            return;

        //Iterate over every position, trying to find the smallest element and 
        // put it on index i
        for(int i = 0; i<array.length-1; i++){

            //Starting from i (since every element before i is already sorted),
            // look for the smallest array element, and store its index in min.
            // Assuming initially the smallest element is i, we will store it on min.
            int min = i; 

            //Well begin our internal loop on i+1, since min was alreay initated with i
            for(int j=i+1; j<array.length; j++){
                //If we encounter a smaller element than array[min], we store its index on min
                if (array[j] < array[min]){
                    min = j;
                }
            }

            //Swap the contents of array[i] with array[min]
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }


    //Selection Sort
    public static void bubbleSort(int[] array){

        //check valid input array
        if (array == null)
            return;

        //
        boolean flagSwap = true;

        //Iterate over every position, trying to find the smallest element and 
        // put it on index i
        for(int i = 0; i<array.length-1 && flagSwap; i++){
            flagSwap = false;

            //Well begin our internal loop on i+1, since min was alreay initated with i
            for(int j=0; j<array.length-1-i; j++){
                //Swap the contents of array[j] with array[j+1]
                if (array[j+1] < array[j]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                    flagSwap = true;
                }
            }
        }
    }    


}