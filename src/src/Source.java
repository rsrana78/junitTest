package src;

public class Source {
			
	private String message;
	private int a, b;
	
	public Source(String message) {
		this.message = message;
	}
	
	public Source(int a, int b) {
		this.a = a;
		this.b = b;
	}

	   public void MessageUtil(String message){
	      this.message = message;
	   }
	   
	   public String printMessage(){
	      return message;
	   }   
	   
	   public int sum() {
		   return a+b;
	   }
}
