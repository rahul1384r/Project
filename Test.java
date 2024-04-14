public class Test {
    public static void main(String[] args) {
        int arr1[]={1,2};
        int arr2[]={3,4};
        int n=arr1.length+arr2.length;
        int arr3[]=new int[n];
        int i=0;
        int j=0;
        while(i!=arr1.length){
            arr3[i]=arr1[i];
            i++;
        }
        while ((j!=arr2.length)){
            arr3[j]=arr2[j];
        }
        for(int k=0;k<n;k++){
            System.out.println(arr3[k]+" ");
        }
    }
}
