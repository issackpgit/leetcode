import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class twitter {
	private static Date startDate;
	private static Date endDate;
//	private static List<Request> requstList = new ArrayList<>();
//	private static List<OutputEntity> outputEntities = new ArrayList<>();
	
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    	Scanner in = new Scanner(System.in);
    	int lineNo = 0;
    	while(in.hasNextLine())
    	{
	    	String line = in.nextLine();
	    	lineNo ++;
	    	if(line.equalsIgnoreCase("exit"))
	    	{
	    		break;
	    	}
	    	if (lineNo==1)
	    	{
	    		 String[] dates = line.split(", *");
	    		 startDate = findDates(dates[0].trim());
	    		 endDate = findDates(dates[1].trim());
	    	}
	    	else if(lineNo>=3)
	    	{
	//    	Request request = createRequestFromString(line);
	//    	if (isValidRequest(request))
	//    	{
	//    	requstList.add(request);
	//    	}
	//    	}
	//    	else
	//    	{
	//    	//do nothing
	    	}
    	}
    
    	in.close();
    }
    
    private static Date findDates(String dates)
    {
    Date retDate = null;
    String[] date = dates.split("-");
    if (date.length==2)
    {
    		retDate = new Date(Integer.parseInt(date[0].trim()), Integer.parseInt(date[1].trim()), 1);
    }
    else if (date.length==3)
    {
    		retDate = new Date(Integer.parseInt(date[0].trim()),Integer.parseInt(date[1].trim()),Integer.parseInt(date[2].trim()));
    }
    return retDate;
    }
   
}