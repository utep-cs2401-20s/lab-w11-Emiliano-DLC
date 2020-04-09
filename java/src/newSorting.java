public class newSorting {

    public void newSorting(int[]a, int size){//size always the same
        if(a.length <= size){
            //quick sort
            quickSort(a);

        }
        else {
            int mid = a.length/2;
            int[] leftHalf = new int[mid];
            for(int i = 0; i<leftHalf.length; i++){
                leftHalf[i]=a[i];
            }
            int[] rightHalf = new int [a.length-mid];
            for(int k = 0; k<rightHalf.length; k++){
                rightHalf[k]=a[mid+k];
            }
            newSorting(leftHalf, size);
            newSorting(rightHalf, size);
            mergeSortedHalves(a,leftHalf,rightHalf);

        }
    }


    public void mergeSortedHalves(int[]a, int []left, int[] right){
        int leftCount = 0;
        int rightCount = 0;
        for(int i = 0; i<a.length; i++) {
            if(leftCount >= left.length){
                a[i]=right[rightCount];
                rightCount++;
            }
            if(rightCount >= right.length){
                a[i]=left[leftCount];
                leftCount++;
            }
            if(left[leftCount] < right[rightCount]){
                a[i]=left[leftCount];
                leftCount++;
            }
            if(right[rightCount] < left[leftCount]){
                a[i]=right[rightCount];
                rightCount++;
            }
        }
    }

    public void quickSort(int[]a){
        quickSort(a, 0, a.length);
    }

    public void quickSort(int[] a, int start, int end){

    }



}
