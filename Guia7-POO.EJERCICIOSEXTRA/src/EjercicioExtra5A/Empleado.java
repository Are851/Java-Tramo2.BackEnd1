///Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y 
///"salario". Luego, crea un método "calcular_aumento" que calcule el aumento
///salarial de un empleado en función de su edad y salario actual. 
///El aumento salarial debe ser del 10% si el empleado tiene más de 
//30 años o del 5% si tiene menos de 30 años.
package EjercicioExtra5A;

public class Empleado {
   private String nombre;
    private int edad;
    private double salario;
    
    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public Empleado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public double calcular_aumento() {
        double aumento = 0;
        if (edad > 30) {
            aumento = salario * 0.1;
        } else {
            aumento = salario * 0.05;
        }
        return aumento;
    }
    
    // Setters y getters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
} 

