package practice;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;




public class Connet4 {
    // Complete the findGameStatus function below.
    static String findGameStatus(List<List<Character>> board) {
    	int rows = board.size();
        int cols = board.get(0).size();
        boolean flag = false;
        HashSet<Character> result = new HashSet<>();
        for(int i =0;i<rows;i++){
            for(int j =0;j<cols;j++){
                if(board.get(i).get(j)!='0'){
//                    System.out.println(board.get(i).get(j));
                    flag = helper(board, i, j, rows, cols);
                    if(flag) {
//                        System.out.println(board.get(i).get(j));
                        		result.add(board.get(i).get(j));
                    }
                   
                }
                flag=false;
            }
        }
        if(result.size()>1)
            return "B";
        else if(result.size()==0)
            return "N";
        else {
        		return Character.toString(result.iterator().next());

        }
    }

    public static boolean helper(List<List<Character>> board, int row, int col, int maxRow, int maxCol){
        char color = board.get(row).get(col);
        
        for (int j = 0; j<maxCol-3 ; j++ ){
            for (int i = 0; i<maxRow; i++){
                if (board.get(i).get(j) == color && board.get(i).get(j+1) == color && board.get(i).get(j+2) == color && board.get(i).get(j+3) == color){
                   return true;
                }           
            }
        }
        for (int i = 0; i<maxRow-3; i++){
        		for (int j = 0; j<maxCol ; j++ ){
                if (board.get(i).get(j) == color && board.get(i+1).get(j) == color && board.get(i+2).get(j) == color && board.get(i+3).get(j) == color){
                   return true;
                }           
            }
        }
        
        for (int i=3; i<maxRow; i++){
            for (int j=0; j<maxCol-3; j++){
                if (board.get(i).get(j) == color && board.get(i-1).get(j+1)  == color && board.get(i-2).get(j+2) == color && board.get(i-3).get(j+3) == color)
                    return true;
            }
        }
        
        for (int i=3; i<maxRow; i++){
            for (int j=3; j<maxCol; j++){
                if (board.get(i).get(j) == color  && board.get(i-1).get(j-1)  == color&& board.get(i-2).get(j-2)  == color && board.get(i-3).get(j-3)  == color)
                    return true;
            }
        }
		return false;
        
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int boardRows = Integer.parseInt(bufferedReader.readLine().trim());
        int boardColumns = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Character>> board = new ArrayList<>();

        IntStream.range(0, boardRows).forEach(i -> {
            try {
                board.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(e -> e.charAt(0))
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        String res = findGameStatus(board);
        System.out.println(res);

//        bufferedWriter.write(res);
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}



