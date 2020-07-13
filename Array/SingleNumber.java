class Solution {
    public int singleNumber_Math(int[] nums) {
        
        // 2*(a+b+c) - a+b+c+a+b = c;
        
        Set<Integer> set = new HashSet<Integer>();
        
        int sumOfnums = 0;
        int setSum = 0;
        
        for(int a : nums){
            set.add(a);
            sumOfnums += a;
        }
         
        for(int a : set)
            setSum += a;
        
        
        return 2*(setSum)-sumOfnums;
     
   }
    
   public int singleNumber_Arraylist(int[] nums){
       ArrayList<Integer> single = new ArrayList<Integer>();
       
       for(int i : nums){
           if(! single.contains(i)){
               single.add(i);
           }
           else{
               single.remove(new Integer(i)); // Removing the object from the list
           }
       }
       
       return single.get(0);
   }
    
    
    public int singleNumber_Bit (int[] nums){
     int a = 0;
        
     for(int i : nums){
         a ^= i;
     }
        return a;
    }
    
}
