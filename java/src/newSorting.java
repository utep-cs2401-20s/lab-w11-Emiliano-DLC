public class newSorting {

    public void newSorting(int[] a, int size) {//size always the same
        if (a.length <= size) {
            quickSort(a);

        } else {
            int mid = a.length / 2;
            int[] leftHalf = new int[mid];
            for (int i = 0; i < leftHalf.length; i++) {
                leftHalf[i] = a[i];
            }
            int[] rightHalf = new int[a.length - mid];
            for (int k = 0; k < rightHalf.length; k++) {
                rightHalf[k] = a[mid + k];
            }
            newSorting(leftHalf, size);
            newSorting(rightHalf, size);
            mergeSortedHalves(a, leftHalf, rightHalf);

        }
    }


    public void mergeSortedHalves(int[] a, int[] left, int[] right) {
        int mainCount = 0;
        int leftCount = 0;
        int rightCount = 0;
        while (leftCount < left.length - 1 || rightCount < right.length - 1) {
            if (left[leftCount] < right[rightCount]) {
                a[mainCount] = left[leftCount];
                mainCount++;
                leftCount++;
            }
            if (right[rightCount] < left[leftCount]) {
                a[mainCount] = right[rightCount];
                mainCount++;
                rightCount++;
            }
            if (right[rightCount] == left[leftCount]) {
                a[mainCount] = right[rightCount];
                mainCount++;
                a[mainCount] = left[leftCount];
                mainCount++;
                leftCount++;
                rightCount++;
            }
        }
        if (leftCount < left.length) {
            for (int i = mainCount; i < a.length; i++) {
                a[i] = left[leftCount];
                leftCount++;
            }
        }
        if (rightCount < right.length) {
            for (int i = mainCount; i < a.length; i++) {
                a[i] = right[rightCount];
                rightCount++;
            }
        }
    }

    public void quickSort(int[] a) {
        quickSort(a, 1, a.length - 1);
    }

    public void quickSort(int[] a, int low, int high) {
        int pivot = a[0];
        while (a[low] <= pivot) {
            low++;
        }
        while (a[high] >= pivot && high > 0) {
            high--;
        }
        if (a[low] > pivot && a[high] < pivot) {
            int temp = a[low];
            a[low] = a[high];
            a[high] = temp;
            quickSort(a,1,a.length-1);
        }
        if(low<=high){
            int temp = a[high];
            a[high] = pivot;
            a[0] = temp;
            quickSort(a,1,a.length-1);
        }
    }
}
