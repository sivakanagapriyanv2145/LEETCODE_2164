class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int i,j,ecount=0,ocount=0;
      for(i=0;i<nums.length;i++)
        {
            if(i%2==0)
            {
                ecount++;
            }
            else{
                ocount++;
            }
        };
        int eve[]=new  int[ecount];
        int odd[]=new int[ocount];
        int res[]=new int[nums.length];
        
        int k=0;
        j=0;
        for(i=0;i<nums.length;i++)
        {
            if(i%2==0)
            {
                eve[j++]=nums[i];
            }
            else{
                odd[k++]=nums[i];
            }
        }
        Arrays.sort(eve);
        Arrays.sort(odd);
        int revodd[]=new int[odd.length];
        int z=0;
        for(i=odd.length-1;i>=0;i--){
            revodd[z++]=odd[i];
        }
    j=0;
    z=0;
    for(i=0;i<nums.length;i++)
    {
        if(i%2==0){
            res[i]=eve[j++];
        }
        else{
            res[i]=revodd[z++];
        }
    }
return res;
        
    }
}
