class Solution {
    public int[] plusOne(int[] digits) {
        int sum=0;
        int carry =0; 
        for(int d=digits.length-1;d>=0;d--){
            if (digits[d]<9){
                digits[d]++;
                return digits;

            }
            
             digits[d]=0;
                
        
        }
      int [] arr = new int[digits.length+1];
      arr[0]=1;
      return arr;
    }
}
