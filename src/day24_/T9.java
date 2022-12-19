package day24_;

public class T9 {
    public static void main(String[] args) {
        /*
        	9. Create a method named contains that passes one integer array and one integer parameters,
        	the method returns true if the given integer is contained in the given array, otherwise returns false
				Ex:
					arr = {1,2,3,4,5,6,7};
					num = 10;
					contains(arr, num) ===> false
         */
       int[] arr = {1,2,3,4,5,6,7};
       int num=8;
       boolean result=contains(arr,num);
        System.out.println(result);
    }
    public static boolean contains(int[]arr,int num){
        boolean result=false;
        for (int i : arr) {
            if (i==num) {
                result=true;
                break;
            }
        }
        return result;
    }
}
