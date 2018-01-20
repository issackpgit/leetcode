class Data {
private Date date;
private Description description;
public Data(Date date, Description descriptions) {
this.date = date;
this.description = descriptions;
}
public Date getDate() {
return date;
}
public void setDate(Date date) {
this.date = date;
}
public Description getDescription() {
return description;
}
public void setDescriptions(Description descriptions) {
this.description = descriptions;
}
}