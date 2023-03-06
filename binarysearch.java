public class binarysearch {
    public static void main(String[] args) {
        int[]a={2,3,5,6,9,11,24,35,56,77,89};
        int target=77;
        System.out.println(binary(a,77));
    }
    static int binary(int[]a, int target){
        int start=0;
        int end=a.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(target<a[mid])
                end=mid-1;
            else if (target>a[mid]) {
                start=mid+1;

            }else return mid;
        }return -1;
    }
}