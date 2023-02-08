
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        int temp = 0;
        for(int i = 0; i< nums.size()-1; i++){

            for(int x = i+1; x < nums.size(); x++){
                if(nums.get(i) + nums.get(x) > temp){
                    temp = nums.get(i) + nums.get(x);
                }
            }
        }
        
        return temp;
    }
}