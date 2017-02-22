package exercicio_1117;

public class ExceptionA extends Exception{
	
	private String msg;
    public ExceptionA(String msg){
      super(msg);
      this.msg = msg;
    }
    
    public String getMessage(){
      return msg;
    }
}
