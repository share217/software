


	
	public class Controller {
	    
		  Model m=new Model();
		   View v1=new View();
	  
	   Controller(double a,double b) {

		  v1.var1=a;
		  v1.var2=b;

	}
	     
	     public double opx(){
	    double one= m.multiply(v1.var1,v1.var2);
	    return one;
	     
	     }
	     
	     public double opadd(){
	    double two= m.addition(v1.var1,v1.var2);
	    return two;
	     
	     }
	     
	     public double opdiv(){
	    double three= m.division(v1.var1,v1.var2);
	   return three;
	     
	     }
	     
	     public double opmod(){
	    double four= m.modul(v1.var1,v1.var2);
	    return four;
	    
	     
	     }
	     
	     public double opsub(){
	    	 
	    double five= m.subtraction(v1.var1,v1.var2);
	    return five;
	     
	     }
	     
	        
	}

	
	
	
	
	
	
