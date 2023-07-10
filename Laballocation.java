public class Main
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int n=sc.nextInt();
        int nx=Math.abs(x-n);
        int ny=Math.abs(y-n);
        int nz=Math.abs(z-n);
        if (x>=n){
        if (nx<=ny && nx<=nz){
          System.out.println("L1");  
        }
        }
        if (y>=n){
        if (ny<=nz && ny<=nx){
          System.out.println("L2");  
        }
        }
        if (z>=n){
        if (nz<=ny && nz<=nx){
          System.out.println("L3");  
        }
        }

    }
	
}
