import java.io.*;
public class trik {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String text;
		 int l=1,c=0,r=0,temp=0; 
		 
		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 
		do{
        System.out.print("Enter Value 50 Character (A or B or C) :");
        text = in.readLine();
		 }while((text.length() > 50 || text.length() < 1 || text.length() == 0) || (text.charAt(0)!='A'
				 && text.charAt(0)!='B' && text.charAt(0)!='C'
				 && text.charAt(0)!='a' && text.charAt(0)!='b' && text.charAt(0)!='c'));
		
		for(int i=0;i<text.length();i++){
			//l==1
			if(text.charAt(i)=='A' || text.charAt(i)=='a'){ 
				temp=l;
				l=c;
				c=temp;
				
			}
			//c==1
			if(text.charAt(i)=='B' || text.charAt(i)=='b'){
				temp=c;
				c=r;
				r=temp;
			}
			//r==1
			if(text.charAt(i)=='C' || text.charAt(i)=='c'){
				temp=r;
				r=l;
				l=temp;
			}
		}
		
		if(l==1) System.out.print("Glass '1' Left\n");
		else if(c==1) System.out.print("Glass '2' Center\n");
		else if(r==1) System.out.print("Glass '3' Right\n");
	}

	private static void readLine() {
		// TODO Auto-generated method stub
		
	}

}
