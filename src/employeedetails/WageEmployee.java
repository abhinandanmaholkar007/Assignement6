package employeedetails;

class Employee {
    int emp_id, salary;
    String name, address, department, email;

    //Getter and setters for getting and setting properties
    public int getEmp_id() {
        return emp_id;
    }
    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee [emp_id = " + emp_id + ", salary = " + salary + ", name = " + name + ", address = " + address
                + ", department = " + department + ", email = " + email + "]";
    }

}

public class WageEmployee{
    public static void main(String args[]) {

        
        Employee emp = new Employee();
        //Setting values to the properties
        emp.setEmp_id(101);
        emp.setName("Abhinandan");
        emp.setDepartment("IT");
        emp.setSalary(15000);
        emp.setAddress("Pune");
        emp.setEmail("abhi123@gmail.com");

        System.out.println(emp);
    }}
