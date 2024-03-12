import java.util.*;
class employee
{
    int eno,esalary;
    String ename;
    employee(String a,int b,int c)
    {
        ename=a;
        eno=b;
        esalary=c;

    }
    int return_id()
    {
        return eno;
    }

}
class company
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        employee E[]=new employee[5];

    int n,id,salary;
    String name1;
    System.out.println("Enter number of employees:");
    n=s.nextInt();
    s.nextLine();
    for(int i=0;i<n;i++)

    {
        System.out.println("Enter the employee details:");
        System.out.println("Enter the employee id:");
        id = s.nextInt();
        s.nextLine();
        System.out.println("Enter the employee name:");
        name1 = s.nextLine();
        System.out.println("Enter the employee salary:");
        salary = s.nextInt();
        s.nextLine();
        E[i] = new employee(name1, id, salary);
    }
        System.out.println("Enter id of the employee to be search:");
    int ele=s.nextInt();
    int h,f=0;
    for(int i=0;i<n;i++)
    {
        h=E[i].return_id();
        if(ele==h)
        {
            f=f+1;

        }
    }
    if(f>0)
    {
        System.out.println("The employee having id"+ele+"is present");

    }else

    {

        System.out.println("The employee having id" + ele + "is not present");
    }


}}
