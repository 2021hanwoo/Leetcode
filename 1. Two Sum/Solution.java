class Solution 
{
    //The solution is a bit messy, and I am aware that it could be improved in many ways.
    public int[] twoSum(int[] nums, int target) 
    {
        for(int i=0;i<nums.length;i++)          //Search through all numbers in the array
        {
            for (int j=i+1;j<nums.length;j++)   //Again, search through all numbers, but exclude the combinations that has been tested before
            {
                if (nums[i]+nums[j] == target)  //If the two values of the indexes add up to the given target,
                {
                    int[] arr = {i,j};          //Initializing a return array
                    return arr;                 //Could be returned right away as it was given that there is only one solution
                }
            }
        }
        return null;                            //Returning null if there are no values that satisfy the condition
    }
}