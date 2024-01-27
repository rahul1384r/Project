public class check{
    public static void main(String[] args) {
        // String arr[]={"h","e","l","l","o"," ","w","o","r","l","d"};
        // int indx=6;
        // int times=1;
        String arr[]={"a","p","n","a"," ","t","i","m","e"," ","a","y","e","g","a"};
        int indx=5;
        int times=3;
        while(times>0){
            for(int i=indx;i<arr.length;i++){
                if(arr[i]==" "){
                    continue;
                }
                System.out.print(arr[i]);
            }
            for(int i=0;i<indx;i++){
                if(arr[i]==" "){
                    continue;
                }
                System.out.print(arr[i]);
            }
            times--;
        }


    }
}