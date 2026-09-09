// class Solution {
//     public long countCommas(long n) {
//         if(n<999999) return 0;
//         long res=n-1000;
//         return (long)res+1;

//     }
// }
class Solution {
    public long countCommas(long n) {
        long count = 0;
        long base = 1000;
        
        while (n >= base) {
            count += (n - base + 1);
            base *= 1000;
        }
        
        return count;
    }
}