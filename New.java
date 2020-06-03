
public class New {

	public static void main(String[] args) {
		
		 int count = 0;
		
		for(int i=1; i<=10000 ; i++) {
			
			String num = String.valueOf(i);
			
			for(int s= 0; s<num.length() ; s++ ) {
				   num.charAt(s); // char
				  
				  String str = Character.toString( num.charAt(s));
				 
				
				
				if("8".equals(str)) {
					
					count++;
					
					
					
				
					
				}
				  
				 
			}
				
				
			}
				System.out.println(count);
		}		
		
	}

