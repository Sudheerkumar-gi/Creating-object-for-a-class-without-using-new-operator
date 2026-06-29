public class CreatingObject {
    

    public static void main(String[] args) throws Exception
    {
        //the parameter or the passing value should be class in String type
        Class  class = Class.forName("Employee");
        Object object=c.newInstance();
        Employee emp=(Employee) object;
        System.out.println(emp.id);
        //Calling Status method
        emp.status();
    }
}
class Employee {
    int id=23;
    public void status(){
        System.out.print("Status is Active");
    }
}
