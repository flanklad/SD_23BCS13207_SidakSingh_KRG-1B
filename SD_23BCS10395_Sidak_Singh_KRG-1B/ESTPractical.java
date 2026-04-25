import java.util.*;
public class ESTPractical{   
    public static void main(String args[]){
        int[] arr={2,2,1,1,3,4,4,5,5};
        int ele=0;
        for(int i=0;i<arr.length;i++){
            ele=ele^arr[i];
        }
        System.out.println(ele);
    }
}
