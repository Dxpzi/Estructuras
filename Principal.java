import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        metodos m = new metodos(); //m: Metodos

        int n = 0;
        System.out.print("Ingrese la dimensión del patio: ");
        n = sc.nextInt();

        ObjVehiculo[] r = new ObjVehiculo[n];
        r = m.LlenarRegirtros(r);
        r = m.CalcularNuevoPago(r);
        m.MostrarRegistros(r);
    }
}
