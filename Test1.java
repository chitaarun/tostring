package object;

public class Test1 {
	
	     int eid;
		  String ename;
		 float esal;
	
	public Test1(int eid, String ename, float esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Test1 t1 = new Test1(111,"arun",1000.00f);
          System.out.println(t1);   
          System.out.println(t1.toString());
        System.out.println(t1.eid);
        System.out.println(t1.ename);
        System.out.println(t1.esal);
	}

}
