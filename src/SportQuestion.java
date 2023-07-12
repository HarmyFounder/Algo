import java.util.Arrays;

public class SportQuestion {
    public static void main(String[] args) {

        String table = "1 3 6" + '\n' +
                "4 5 11" + '\n' +
                "8 19 23";


        String[] arr = table.split("\\s");



        System.out.println(table);

        System.out.println();

        int[] nums = new int[arr.length];
        int i =0;
        for(String el : arr){
            int index = Integer.parseInt(el);
            nums[i] = index;
            i++;
        }

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));
    }
}