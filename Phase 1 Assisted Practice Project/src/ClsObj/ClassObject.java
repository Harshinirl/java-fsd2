package ClsObj;
public class ClassObject {
	int sid;
	String sname;
	String scollege;
    public ClassObject(int sid, String sname, String scollege) {
    	this.sid = sid;
		this.sname = sname;
		this.scollege = scollege;
		System.out.println("Roll Number: "+sid+"\n"+"Student Name: "+sname+"\n"+"College Name: "+scollege);
    }
	public static void main(String[] args) {
		ClassObject we=new ClassObject(16,"Shyam","KRCT");
	}
}
