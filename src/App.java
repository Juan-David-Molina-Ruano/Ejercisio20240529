import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Proveedor> proveedores = new ArrayList();
        leerArchivo("Proveedores.csv", proveedores);
        imprimirDatos(proveedores);
        
    }


    private static void separarDatos(String linea, ArrayList<Proveedor> proveedores){
        String[] datos = linea.split(";");
        for(String datosRe : datos){
            datos = datosRe.split(",");
            Proveedor proveedor = new Proveedor();
            proveedores.add(proveedor);

            for(int j = 0; j < datos.length; j++){
                String dato = datos[j];

                switch (j){
                    case 0 :
                    proveedor.setNombre(dato);
                    break;
                    case 1 :
                    proveedor.setEmail(dato);
                    break;
                    case 2 :
                    proveedor.setTelefono(dato);
                    break;
                    case 3 :
                    proveedor.setServicios(dato);
                    break;
                    default:
                    break;
                }
            }
        }

    }

    private static void leerArchivo(String ruta, ArrayList<Proveedor> proveedores){
        try{
            File myObj = new File(ruta);
            Scanner myReader = new Scanner(myObj);
            int index=0;
            while (myReader.hasNextLine()) {
                String linea = myReader.nextLine();
                if(index!=0){
                    separarDatos(linea, proveedores);
                }
               
                index++;
            }
            myReader.close();
        }catch(FileNotFoundException e){
            System.out.println("No se encontró el archivo ");
            e.printStackTrace();
        }
    }

    public static void imprimirDatos(ArrayList<Proveedor> proveedores){
        for(Proveedor proveedor : proveedores){

            System.out.println("---------------------Proveedor---------------------------------------");
            System.out.println("El nombre del proveedor es: " + proveedor.getNombre());
            System.out.println("El email del proveedor es: " + proveedor.getEmail());
            System.out.println("El telefono del proveedor es: " + proveedor.getTelefono());
            System.out.println("Los servicios del proveedor son: " + proveedor.getServicios());
            System.out.println("---------------------------------------------------------------------");

        }
    }
}
