package pkg8;

@FunctionalInterface
interface greet{
	void message(String msg);
}

/*class Greeting implements greet{
	@Override
	public void message(String msg) {
		System.out.println(msg);
		
	}
	
}*/
public class lambdaex {

public static void main(String[] args) {
	greet obj=(msg)-> System.out.println(msg);
	obj.message("Good morning");
	
	
	int num=78;
	System.out.println(num);
	
}

}