import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwitterCodingChallenge {
	private static Date startDate;
	private static Date endDate;
	private static List<String> initialList = new ArrayList<>();
	private static List<Data> intermediateList = new ArrayList<>();

	private static List<OutputData> outputDatas = new ArrayList<>();
	
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
	    		checkData(line);
	    	}
    	}
    	
    	convertInitialtoFinalList();
    	
    	for(OutputData outputData : outputDatas)
    	{
    	System.out.println(outputData.toString());
    	}
    	in.close();
    }
    
    private static void convertInitialtoFinalList() {
	    for(String line : initialList) {
	    		String[] datas = line.split(", *");
	    		intermediateList.add(new Data(findDates(datas[0].trim()), new Description(datas[1].trim(), Integer.parseInt(datas[2].trim()))));
	    }
	    
	    ListComparator listComparator = new ListComparator();
	    	sortList(listComparator);
	
	    	if (intermediateList.size() <= 1)
	    	{
	    	return;
	    	}
	    	OutputData last = new OutputData(intermediateList.get(0));
	    	for(int i = 1; i < intermediateList.size(); i ++)
	    	{
		    	Data current = intermediateList.get(i);
		    	if(last.getDate().isInSameMonth(current.getDate()))
		    	{
		    		last.addDescription(current.getDescription());
		    	}
		    	else
		    	{
			    	outputDatas.add(last);
			    	last = new OutputData(current);
		    	}
	    	}
	    	outputDatas.add(last);
    }

	private static void sortList(ListComparator listComparator) {
		Collections.sort(intermediateList, listComparator);
	}

	private static void checkData(String line) {
		String[] data = line.split(", *");
		Date curDate = findDates(data[0].trim());
    	 	if(curDate.compareTo(startDate) <= 0 && curDate.compareTo(endDate) > 0) {
    	 		initialList.add(line);
    	 	}	
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