class Solution {

    public int majorityElement(int[] nums) {

    Map<Integer,Integer> map = new HashMap<>(); 
    int result=0,count=0;

        for(int num :nums){
            
            map.put(num,map.getOrDefault(num,0)+1);

            if(map.get(num)>count){
                result=num;
                count=map.get(num);

            }
                    
        }
        return result;
        
    }
}