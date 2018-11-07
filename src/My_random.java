
public class My_random {
	
	private int a;
	private int x0;
	private int c;
	private int m;
	
	public My_random(int a, int x0, int c, int m) {
		this.a = a;
		this.x0 = x0;
		this.c = c;
		this.m = m;
	}
	
	public void GeneratorLiniowy() {
		int xn=x0;
		int i=0;
		System.out.println("Generator liniowy: ");
		
		while(i!=m) {
			i++;
			xn=((a * xn) + c)%m;
			System.out.println(xn);
		}
	}
	
	

}
