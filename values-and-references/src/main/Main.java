package main;

public class Main {
    public static void main(String[] args) {
        //PASSING VARIABLES BY VALUE
        //Passing local primitives variables to method - copy of variable is passed
        int localValue = 5;
        calculate(localValue);
        System.out.println("Local primitive value: " + localValue);

        //Passing objects to method - the reference to the object is passed by value
        Customer customer = new Customer("Sally");
        renameCustomer(customer);
        System.out.println("Passed object value: " + customer.getName());

        //Final keyword
        final Customer finalCustomer;
        finalCustomer = new Customer("John");
        //finalCustomer = new Customer("Diana");  - error because of the final keyword


    }

    private static void renameCustomer(Customer customer) {
        customer.setName("Diane");
    }

    public static void calculate(int calcValue) {
        calcValue *= 100;
        System.out.println("Calculate method value: " + calcValue);

    }

}
