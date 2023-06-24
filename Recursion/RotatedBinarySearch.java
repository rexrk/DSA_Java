class RotatedBinarySearch{
    public static void main(String[] args){
        int[] arr = { 5, 6, 7, 8, 9, 1, 2, 3};
        System.out.println("index: "+rotatedAlgo(arr, 0, arr.length- 1,9));


    }

    static int rotatedAlgo(int[] arr, int s, int e, int target){
        //Not found condition
        if(s > e){
            return -1;
        }

        //mid finding
        int m = s + (e-s) / 2;

        //target return
        if(arr[m] == target){
            return m;
        }

        // modify indexes
        if(arr[s] <= arr[m]){
            if(target >= arr[s] && target <= arr[m]){
                return rotatedAlgo(arr, s, m-1, target);

            } else
                return rotatedAlgo(arr, m+1, e, target);

        }      

        if(target >= arr[m] && target <= arr[e]){
            return rotatedAlgo(arr, m+1, e, target);

        }
        
        return rotatedAlgo(arr, s, m-1, target);

    }
}