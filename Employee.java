public class Employee {
    int salary = 1000;
    public Employee(int a){
        this.salary = a;
    }
    public int getSalary(){
        return salary;
    }
    String name = "abhi";
    public String getname(){
        return name;
    }
    public String setname(String a){
        name = a;
        return name;
    }
    public static void main(String[] args){
        Employee employee = new Employee(10000);
        System.out.println(employee.getSalary());
        System.out.println(employee.getname());
        System.out.println(employee.setname("abhi2"));
        System.out.println(employee.getname());
    }
}
