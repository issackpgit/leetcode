class Date {
	private int year;
	private int month;
	private int day;
	
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.year);
		sb.append('-');
		if (this.month < 10)
		{
			sb.append('0');
		} 
		sb.append(this.month);
		return sb.toString();
	}
	
	public boolean isInSameMonth(Date another)
	{
		return this.year == another.getYear() && this.month	== another.getMonth();
	}
	
	public int compareTo(Date another)
	{
		if (this.year > another.getYear())
		{
			return -1; 
		}
		else if (this.year == another.getYear())
		{
			if (this.month > another.getMonth())
			{
				return -1;
			}
			else if (this.month == another.getMonth())
			{
				if (this.day > another.getDay())
				{
					return -1;
				}
				else if (this.day == another.getDay())
				{
					return 0;
				}
				else
				{
				return 1;
				}
			}
			else
			{
			return 1;
			}
		}
		else
		{
		return 1;
		}
	}
}