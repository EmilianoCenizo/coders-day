public class Main {

	
	
	public static void main(String args[]){
		
		int grilla = 4;
		
		int total = 0;		
		
		for(int x = grilla; x != 0; x--){
			
			for(int y = grilla; y != 0; y--){
				
				if((x == 1 && y == 1) || (x == grilla && y == 1) || (x == 1 && y == grilla) || (x == grilla && y == grilla)){
					total = total + 2;
				} else if(x == 1 || x == grilla || y == 1 || y == grilla){
					total = total + 3;
				} else {
					total = total + 4;
				}				
			}
			
		}
		
		System.out.println(total);
		
	}
	
	
}
