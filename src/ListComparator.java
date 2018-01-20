import java.util.Comparator;

class ListComparator implements Comparator {
	
	public int compare(Object o1, Object o2) {
		
		if (null == o1)
		{
			return 1;
		}
		if (null == o2)
		{
			return -1;
		}
		
		Data d1 = (Data)o1;
		Data d2 = (Data)o2;
		
		return d1.getDate().compareTo(d2.getDate());
	}
}
