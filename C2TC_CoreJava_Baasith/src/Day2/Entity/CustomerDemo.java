package day2.entiyl;

public class CustomerDemo {

	public static void main(String[] args) {
	
		Customer c1=new Customer();
		c1.setCid(456);
		c1.setCname("Rokesh");
		c1.setCity("Pondicherry");
		System.out.println(c1);
		
		
		
		Customer c2=new Customer();
		c2.setCid(222);
		c2.setCname("Any girl");
		c2.setCity("Any State");
		System.out.println(c2);
		
		
		System.out.println("customer 1 city is:"+c1.getCity());
		System.out.println("customer 2 city is:"+c2.getCity());
		System.out.println("customer 1 city is:"+c1.getCname());
		System.out.println("customer 2 city is:"+c2.getCname());
		System.out.println("customer 1 city is:"+c1.getCid());
		System.out.println("customer 2 city is:"+c2.getCid());
		
	}

	
	}


