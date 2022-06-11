
package revision;

import java.util.ArrayList;


public class Departement {
   private int dno;
    private String dname;
    
    ArrayList<Employee> empList ;
    

    public Departement() {
    }

    public Departement(int dno, String dname) {
        this.dno = dno;
        this.dname = dname;
        empList= new ArrayList<Employee>();
    }
    

    
    
    public int getDno() {
        return dno;
    }

    public void setDno(int dno) {
        this.dno = dno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
    
    public void Addemployee(Employee e){
       
        empList.add(e);
    }
    public void Remove_employee(int idx){
      empList.remove(idx);
    }
    public int getemployeecount(){
       return empList.size();
    }
    public void printbasicdata(){
    for( int i=0; i< empList.size() ;i++){
    System.out.println( empList.get(i).getSsn() + " " +empList.get(i).getName() +" "+ empList.get(i).getSexe() +" ");
            
}
    }
    public void Printalldetails(){
        
         for( int i=0; i< empList.size() ;i++){
           if(empList.get(i) instanceof SalariedEmployee) //instanceof methode buildin  
               ((SalariedEmployee)empList.get(i)).Displayalldetails();
        //for display all details for all employees (salaried ,hourly ,comission ,base plus commission)
        //this methode dosn'nt exist in Employee ?? you have to make casting for trnsfere Employee to salariedEmployee.
            if(empList.get(i) instanceof HourlyEmployee)
                ((HourlyEmployee)empList.get(i)).Displayalldetails();
                        
             if(empList.get(i) instanceof Comission_Employee)
                ((Comission_Employee)empList.get(i)).Displayalldetails();            
         }
    }
    
    
}
        