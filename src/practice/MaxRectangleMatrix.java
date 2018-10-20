package practice;

public class MaxRectangleMatrix {
	public static void main(String args[]) {
		MaxRectangleMatrix m = new MaxRectangleMatrix();
		
		int[][] a = {{1,0,1,1},
				{1,1,1,0},
				{1,1,0,0},
				{1,0,0,0}};
		
		int n = m.findarea(a);
		System.out.println(n);
		
	}

	private int findarea(int[][] a) {
		int rows = a.length;
        if(rows==0) return 0;
        int cols = a[0].length;
        
        int arr[] = new int[cols];
        int max = -1;
        for(int i =0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                int p = a[i][j];
                if(p==1)
                    arr[j] += p;
                else if(p==0)
                    arr[j] = p;
            }
            max = Math.max(max, hist(arr)); 
        }
        return max;
    }
	
	public int hist(int[] a){
        Stack<Integer> s = new Stack<Integer>();
        
        int n = a.length;
        int i =0, max = -1, area = 0;
        
        while(i<n){
            if(s.isEmpty() || a[s.peek()]<=a[i]){
                s.push(i);
            }
            else{
                while(!s.isEmpty()&& a[s.peek()]>a[i]){
                    int top = s.pop();
                    if(s.isEmpty()){
                        area = a[top]*i;
                    }
                    else{
                        area = a[top] * (i - s.peek() -1);
                    }
                    max = Math.max(max, area);
                }
                s.push(i);
            }
            i++;
        }
        
        while(!s.isEmpty()){
            int top = s.pop();
                    if(s.isEmpty()){
                        area = a[top]*i;
                    }
                    else{
                        area = a[top] * (i - s.peek() -1);
                    }
                    max = Math.max(max, area);     
        }
        return max;
    }
}
