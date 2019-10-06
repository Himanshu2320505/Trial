package interfaceConcept;

public class Lion implements Animal, Banking_client{
//this class will implement all the method of the interface
	public static void main(String[] args) {
		Lion l=new Lion();
		l.fuckedOff();
		l.login();
		l.logout();
		
		
	Animal al=	new Lion();//runtime polymorphism -used while declaring Seleniu Webdriver.
	al.logout();
	al.logout();
	
	Banking_client bc= new Lion();
	bc.investment();
	bc.loan();
	bc.creditCard();
	}

@Override
public void login() {
	
	System.out.println("logged in");
	
}

@Override
public void logout() {
	
	System.out.println("logged out");
	
}
public void fuckedOff() {
	System.out.println("Literally fucked off");
}
public void dickHead() {
	System.out.println("I am a dickhead");
}

@Override
public void investment() {
	System.out.println("Invested");
	
}

@Override
public void loan() {
	System.out.println("need loan");
	
}

@Override
public void creditCard() {
	System.out.println("need credit card");
	
}
}

