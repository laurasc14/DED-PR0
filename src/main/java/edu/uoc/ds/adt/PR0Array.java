package edu.uoc.ds.adt;


public class PR0Array {

    private int[] array;


    //constructor
    public PR0Array(){
        this.array = new int[50];
        this.setValuesArray();
    }

    private void setValuesArray() {
        int a = 0;
        for (int i = 0; i < array.length; ++i){
            array[i] = a;
            a+=2;
        }
    }

    public int[] getArray(){
        return array;
    }

    public int getIndexOf(int num){

        for(int i = 0; i < array.length; ++i){
            if(array[i] == num)
                return i; //found
        }

        return -1;
    }


    public int binarySearch(int num){
        int first = 0;
        int last = array.length -1;
        int mid = (first + last)/2;

        while(first <= last){
            if (array[mid] < num)
                first = mid + 1;
            else if (array[mid] == num)
                return mid;
            else
                last = mid - 1; //found

            mid = (first + last)/2;
        }

        return -1; //not found
    }

}
