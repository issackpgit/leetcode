import java.util.Map;
import java.util.TreeMap;

class OutputData {
private Date date;
private Map<String, Integer> map;
public OutputData(Data data) {
this.date = data.getDate();
map = new TreeMap<>();
map.put(data.getDescription().getType(),
data.getDescription().getCount());
}
public Date getDate() {
return date;
}
public void setDate(Date date) {
this.date = date;
}
public Map<String, Integer> getMap() {
return map;
}
public void setMap(Map<String, Integer> map) {
this.map = map;
}
public void addDescription(Description description)
{
String type = description.getType();
int count = description.getCount();
if (map.containsKey(type))
{
Integer newValue = map.get(type) + count;
map.replace(type, newValue);
}
else
{
map.put(type, count);
}
}
@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append(this.date.toString());
for(Map.Entry<String, Integer> entry:map.entrySet())
{
sb.append(", ");
sb.append(entry.getKey());
sb.append(", ");
sb.append(entry.getValue().toString());
}
return sb.toString();
}
}