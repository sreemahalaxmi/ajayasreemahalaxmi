import java.util.Date;
import java.util.HashMap;

class pair<key,value>{
	private Date date;
	private String key;
	private String value;
	pair(){}
	public pair(String key,String value) {
		super();
		this.setkey(key);
		this.value = value;
	}
	
	public pair(String key,Date date) {
		super();
		this.key = key;
		this.date = date;
	}
	
	public String getkey() {
		return key;
	}
	
	public void setkey1(String key) {
		this.key = key;
	}
	
	public void setkey(String key) {
	    this.key = key;
	}
	public String getvalue() {
		return value;
	}
	public void setvalue(String value) {
		this.value = value;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date dt) {
		this.date = date;
	}
	public static void main(String[] args) {
		pair p = new pair("1","Hello");
		HashMap<String,String> h = new HashMap<String,String>();
		h.put(p.getkey(), p.getvalue());
		System.out.println("object:"+h);
		pair p1 = new pair("Today is",new Date());
		HashMap<String,Date> h1 =new HashMap<String,Date>();
		h1.put(p1.getkey(), p1.getDate());
		System.out.println("Date:" +h1);
	}
}