
public class CreatingObject {
    

    public static void main(String[] args) throws Exception
    {
        Class <?> c = Class.forName(Employee);
        Object o=c.newInstance();
        Employee emp=(Employee) o;
        System.out.println(emp.id);
        //Calling Status method
        emp.status();
    }
}
class Employee
{
    int id=23;
    public void status(){
        System.out.print("Status is Active");
    }
}
