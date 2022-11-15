package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Employee emp=new Employee();
        emp.id=156;
        emp.name="Prasad";
        emp.dept="PEER";
        emp.salary= (float) 12500.55;

        System.out.println("****************************** EMPLOYEE DETAILS ******************************");
        System.out.println("Employee ID is : "+emp.id);
        System.out.println("Employee Name is : "+emp.name);
        System.out.println("Employee Department is : "+emp.dept);
        System.out.println("Employee Salary is : "+emp.salary + "Rs.");


        Account acc=new Account();

        acc.accno=12021994;
        acc.name="Prasad Kulkarni";
        acc.type="Salary Account";
        acc.bal= (float) 1155738.32;

        System.out.println("****************************** EMPLOYEE ACCOUNT DETAILS ******************************");
        System.out.println("Account Number is : "+acc.accno);
        System.out.println("Account Holder Name is : "+acc.name);
        System.out.println("Account Type is : "+acc.type);
        System.out.println("Current Balance is : "+acc.bal + "Rs.");
    }
}
