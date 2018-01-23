//Author : Issac Koshy Panicker
//23-01-2018

public class leet191 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int sum =0;
        while(n!=0){
            sum += n&1;
            n>>>=1;
        }
        return sum;
    }
}
