public class Main{
    public static void main(String[] args){
        String[] names = {"Hari","Prasath","Hello","Vikram"};
        int[] nums = {10,20,30,40};

        for(int i=0; i<names.length; i++){
            for(int j=0; j<nums.length; j++){
                System.out.println(names[i]);
                System.out.println(nums[j]);
            }
        }
    }
}
