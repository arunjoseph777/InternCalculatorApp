import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		
		boolean st = true;
		int i;
		
		System.out.println("Welcome to Calculator App");
		
		do{
		    boolean st1 = true;
                
            do {
                boolean st2 = true;
                
                do{
                    System.out.println("Enter 1.Addition 2.Substraction 3.Multiplication 4.Division 0.Exit");
                    i = t.nextInt();
                    t.nextLine();
                    
                    if(i>=1 && i<=4){
                        st2=false;
                    }
                    else if(i==0){
                        System.out.println("Bye......");
                        st2=false;
                    }
                    else{
                        System.out.println("Enter 0 to 4");
                    }
                }
                while(st2);
                
                if(i==0){
                    break;
                }
                System.out.println("For 'back' to menu or 'go' to continue");
                String ch = t.nextLine();
                
                if(ch.equals("back"))
                {
                    System.out.println("Select Again");
                }
                else if (ch.equals("go"))
                {
                    st1=false;   
                }
                else{
                    System.out.println("Enter Correct word");
                }
            }
            while(st1);
            
            if(i==0){
                break;
            }
            
            int n1=0,n2=0;
            double n3=0,n4=0;
            String format = "";
            
            if(i==1 || i==2){
                
                if(i==1){
                    System.out.println("Enter input size");
                    int size = t.nextInt();
                    int ans=0;
                    int sum=0;
                    
                    for(int j=1;j<=size;j++){
                        System.out.println("Enter n");
                        n1 = t.nextInt();
                        sum+=n1;
                    }
                    t.nextLine();
                    format="Addition";
                    System.out.println(format + " of two numbers = "+sum);
                    sum=0;
                }
                else{
                    System.out.println("Enter n1");
                    n1 = t.nextInt();
                    System.out.println("Enter n1");
                    n2 = t.nextInt();
                    
                    int ans=n1-n2;
                    System.out.println("Substraction" + " of two numbers = "+ans);
                    ans=0;
                }
            }
            else{
                
                if(i==3){
                    System.out.println("Enter input size");
                    int size = t.nextInt();
                    
                    double n5=0;
                    double mul=1;
                    for(int j=1;j<=size;j++){
                        System.out.println("Enter n");
                        n5 = t.nextDouble();
                        mul*=n5;
                    }
                    t.nextLine();
                    System.out.println("Multiplication of two numbers = "+mul);
                    mul=0;
                }
                else {
                    System.out.println("Enter n1");
                    n3 = t.nextDouble();
                    System.out.println("Enter n2");
                    n4 = t.nextDouble();
                    t.nextLine();
                    double ans1=0;
                    
                    if(n4!=0){
                        ans1=n3/n4;
                        System.out.println("Division of two numbers = "+ans1);
                    }
                    else{
                        System.out.println("Number cant divide by zero");
                    }
                }    
            }
            
            
            boolean st3 = true;
            while(st3) {
                System.out.println("Do you want to continue? y or n");
                String sss = t.nextLine();
                if(sss.equals("n")){
                    st3=false;
                    st=false;
                    System.out.println("Bye........");
                }
                else if(sss.equals("y")){
                    break;
                }
                else{
                    System.out.println("Enter y or n");
                }
            }
		}
		while(st);
		
	}  
}
