package Oracle;

public class MRApp {
    public static void main(String[] args) {
        System.out.println("HRApp starts");

        Empleado e1 = new Empleado(230,"jerry",29569);
        Empleado e2 = new Empleado(231,"marcelo",10);

        System.out.println("empleado"+e1);
        System.out.println("empleado"+e2);

        Departamento dept = new Departamento("education");
        dept.addemp(e1);
        dept.addemp(e2);
        dept.addemp(new Empleado(23,"jorge",635972562));

        Empleado[] emps = dept.getEmps();

        for (Empleado e:emps){
            System.out.println("emp"+e);

        }
        System.out.println("total"+ dept.gettotalsalario());
        System.out.println("avg"+ dept.getaveragesalario());
        System.out.println("emp"+dept.getEmpleadoid(231));
    }
}
