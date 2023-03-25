class Demo{
    public static void main(String args[]){
        int[] arr={1,2,3,4};
        incby10(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void incby10(int arr_x[]){
        for(int i=0;i<arr_x.length;i++){
            arr_x[i]+=10;
        }
    }
}