public class newSorting {

    public void newSorting(int[]a, int size){//size always the same
        if(a.length <= size){
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


    public void mergeSortedHalves(int[]a, int []left, int[]right){
        mergeSorted(a,left,right,0,0,0);
    }
    public void mergeSorted(int[]a, int[]b, int[]c, int bCount, int cCount, int count) {
        if (count == a.length - 1) {
            return;
        }
        if (bCount >= b.length - 1) {
            a[count] = c[cCount];
            mergeSorted(a, b, c, bCount, cCount + 1, count + 1);
        }
        if (cCount >= c.length - 1 && bCount < b.length - 1) {
            a[count] = b[bCount];
            mergeSorted(a, b, c, bCount + 1, cCount, count + 1);
        }
        if (b[bCount] < c[cCount] && bCount < b.length - 1) {
            a[count] = b[bCount];
            mergeSorted(a, b, c, bCount + 1, cCount, count + 1);
        }
        if (c[cCount] < b[bCount] && cCount < c.length - 1) {
            a[count] = c[cCount];
            mergeSorted(a, b, c, bCount, cCount + 1, count + 1);
        }
    }

    public void quickSort(int[]a){
        quickSort(a, 1, a.length-1);
    }

    public void quickSort(int[] a, int start, int end){
        int pivot = a[0];
        while (a[start]<=pivot){
            start++;
        }
        while (a[end]>=pivot && end > 0){
            end--;
        }
        if(a[start] > pivot && a[end] < pivot) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            quickSort(a,1,a.length-1);
        }
    }



}
