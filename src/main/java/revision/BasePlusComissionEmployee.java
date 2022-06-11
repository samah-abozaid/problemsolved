
package revision;


public class BasePlusComissionEmployee extends Comission_Employee {
 
    private double base;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
         this.base = base;
     }   
       
    @Override
  public  double earning(){
    return base+ super.earning(); 
  } 
  @Override
 public void Displayalldetails(){
     
        super.Displayalldetails();
        displayearnning();
  }
    @Override
    public void displayearnning(){
       System.out.println(earning()); 
     
 } 
    
    
    
    
    
    
    
}
