package hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class gs {
    
	 static int dotProduct(int[] x, int[] y) {
	        if(x.length != y.length){
				return 0;
			}
	        int sum = 0;
	        
	        for(int i =0;i<x.length;i++)
	            System.out.println(x[i]);
	        
	        for(int i = 1; i < x.length; i++){
				sum += x[i] * y[i];
			}
			return sum;

	    }

	public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        int res;
        
        int _x_size = 0;
        _x_size = Integer.parseInt(in.nextLine().trim());
        int[] _x = new int[_x_size];
        int _x_item;
        for(int _x_i = 0; _x_i < _x_size; _x_i++) {
            _x_item = Integer.parseInt(in.nextLine().trim());
            _x[_x_i] = _x_item;
        }
        
        
        int _y_size = 0;
        _y_size = Integer.parseInt(in.nextLine().trim());
        int[] _y = new int[_y_size];
        int _y_item;
        for(int _y_i = 0; _y_i < _y_size; _y_i++) {
            _y_item = Integer.parseInt(in.nextLine().trim());
            _y[_y_i] = _y_item;
        }
        
        res = dotProduct(_x, _y);
        bw.write(String.valueOf(res));
        bw.newLine();
        
        bw.close();
    }
}

