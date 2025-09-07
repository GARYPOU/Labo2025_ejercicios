package Oracle;

public class Departamento {
    private String nombre;
    private Empleado[] emps = new Empleado[10];
    private int lastAddedEmpleadoIndex = -1;

    public Departamento(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addemp(Empleado e1){
        if (lastAddedEmpleadoIndex<emps.length){
            lastAddedEmpleadoIndex++;
            emps[lastAddedEmpleadoIndex]=e1;
        }
    }

    public Empleado[] getEmps(){
        Empleado[] actualEmpleado = new Empleado[lastAddedEmpleadoIndex+1];
        for (int i = 0; i < actualEmpleado.length; i++) {
            actualEmpleado[i]=emps[i];
        }
        return actualEmpleado;
    }

    public int getEmpleadocount(){
        return lastAddedEmpleadoIndex+1;

    }

    public Empleado getEmpleadoid(int empid){
        for (Empleado e:emps){
            if (e != null){
                if (e.getId()==(empid)){
                    return e;
                }
            }
        }
        return null;
    }

    public double gettotalsalario(){
        double total = 0.0;
        for (int i = 0; i <= lastAddedEmpleadoIndex; i++) {
            total+=emps[i].getSalario();
        }
        return total;
    }

    public double getaveragesalario(){
        if (lastAddedEmpleadoIndex> -1){
            return gettotalsalario()/(lastAddedEmpleadoIndex+1);
        }
        return 0.0;
    }

    public String toString(){
        return nombre;
    }
}
