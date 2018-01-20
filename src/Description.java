class Description {
	private String type;
	private int no;
	
	public Description(String type, int no) {
		this.type = type;
		this.no = no;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCount() {
		return no;
	}
	public void setCount(int no) {
		this.no = no;
	}
	@Override
	public String toString() {
		return this.type + ", " + this.no;
	}
}