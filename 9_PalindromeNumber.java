class Solution {
    public boolean isPalindrome(int x) {
     int r,sum=0;
     int temp=x;
     while(x>0)   {
        r=x%10;
        sum=sum*10+r;
        x=x/10;
     }
     if(temp==sum){
        return true;
     }
     return false;
    }
}