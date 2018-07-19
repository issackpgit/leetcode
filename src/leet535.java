//Author : Issac Koshy Panicker
//07-19-2018

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class leet535 {

    static List<String> urls = new ArrayList<String>();
    
    public static String encode(String longUrl) {
        urls.add(longUrl);
        return String.valueOf(urls.size()-1);
    }

    public String decode(String shortUrl) {
        int index = Integer.valueOf(shortUrl);
        return (index<urls.size())?urls.get(index):"";
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line,line1;
        line = in.readLine();
        line1 = in.readLine();
        
        System.out.println(encode(line));

    }
    
    
}

//During encoding the string is added to the list, the position of the url in the list is returned. While decoding
//