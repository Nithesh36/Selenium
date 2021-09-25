package realtimeWebsite;
import java.util.*;
class Customer{
	String name,mobile;
	int age;
	private int points;
	public Customer(String n,int age,String m,int p) {
		name=n;
		this.age=age;
		mobile=m;
		points=p;
	}
	public Customer() {
	}
	
	public   void   setPoints(int p) {
		points=points+p;
	}
	public   int  getPoints() {
		return points;
	}
}
	public class BillSystem {

	public static void main(String[] args) {

		ArrayList<Customer>client=new ArrayList<>();
		client.add(new Customer("Nithesh", 21, "7540040685", 0));
		client.add(new Customer("nk", 21, "75400262626", 0));
		
		Scanner asc=new Scanner(System.in);
		String name,mob;
		int age ,point;boolean newCus=false;
		System.out.println("enter customer data");
		name=asc.next();
		mob=asc.next();
		age=asc.nextInt();
		point=asc.nextInt();
		for(int i=0;i<client.size();i++) {
			if(client.get(i).mobile.equals(mob)) 
			{ //client.get(i).points =client.get(i).points+5;
				
				//client.set(i,client.get(i).points );
				
				client.get(i).setPoints(5);	
				break;
				}
			else if(!client.get(i).mobile.equals(mob) && (!client.get(i).name.equalsIgnoreCase(name)))
//				newCus=true;	
			{
				System.out.println("added elements");
				client.add(new Customer(name, age, mob, point));
				break;
			}
		}
//		if(newCus)
		
		System.out.println("li size "+client.size());
		for (Customer customer : client) {
			System.out.println("cus name "+customer.name +"points" +customer.getPoints());
			
		}
		asc.close();
	}
	//{ client.get(i).points =client.get(i).points+5;
	//hjhjbbjbjjkjlkkkltrdrdgfukjl
	//client.set(i,client.get(i).points 
}
