public class newSorting {

    public void newSorting(int[]a, int size){//size always the same
        if(a.length <= size){
            //quick sort
        }
        else {
            int mid = a.length;
            int[] leftHalf = new int[mid];
            int[] rightHalf = new int [a.length-mid];

        }
    }

    public void mergeSortedHalves(int[]a, int []left, int[] right){
        int leftCount = 0;
        int rightCount = 0;
        for(int i = 0; i<a.length; i++) {
            if (left[leftCount] < right[rightCount]) {
                a[i] = left[leftCount];
                leftCount++;
            }
            if(right[rightCount]<left[leftCount]){
                a[i] = right[rightCount];
                rightCount++;
            }
        }
    }


}
