package random;

public class getter_setter {
	private int i =10;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public static void main(String[] args) {
		
		getter_setter gs =new getter_setter();
		System.out.println(gs.i);
	}

}
