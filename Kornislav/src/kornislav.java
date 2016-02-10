import java.util.Scanner;
public class kornislav {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,n3,n4,temp;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter  Value 1 : ");
		n1=scan.nextInt();
		
		System.out.print("Enter  Value 2 : ");
		n2=scan.nextInt();
		
		System.out.print("Enter  Value 3 : ");
		n3=scan.nextInt();
		
		System.out.print("Enter  Value 4 : ");
		n4=scan.nextInt();
		
		if(n1>n2){
		temp=n1;
		n1=n2;
		n2=temp;
		}
		
		if(n1>n3){
		temp=n1;
		n1=n3;
		n3=temp;
		}
		
		if(n1>n4){
		temp=n1;
		n1=n4;
		n4=temp;
		}
		
		if(n2>n3){
		temp=n2;
		n2=n3;
		n3=temp;
		}
		
		if(n2>n4){
		temp=n2;
		n2=n4;
		n4=temp;
		}
		
		if(n3>n4){
		temp=n3;
		n3=n4;
		n4=temp;
		}
		
		System.out.print("\nRectangle Area = : " + " " +n3+ " " + "  *  " +n1+ "  =  "+n3*n1);
	}

}
