package learningoops;

class B extends lesson {
	  
	public void show() {
		 System.out.println("Manish in override");
	 }
	 void add() {
		 System.out.println("deal in override");
	 }
	
	
	public static void main(String[] args){
		
		 System.out.println("Manish in main"); 
		 	 
		 final int a = 20;
		 int b =30;
		 int c = a+b;
		 int i= 2;
		 i+=10;
		 System.out.println(i);
		  
		 System.out.println(c);
		 
		 lesson obj=new B();
		 obj.show();
		 obj.add();
		// obj.deal();
	}
	
}
 class lesson {
	
		 void add(){
			System.out.println("ADD in lesson "); 
	}
		 public void show() {
		 System.out.println("Manish in lesson "); 
	  }
	 
  }

