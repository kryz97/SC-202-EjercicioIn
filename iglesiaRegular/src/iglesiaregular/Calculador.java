package iglesiaregular;

import javax.swing.JOptionPane;
/**
*author chris
* author alejh
*/
public class Calculador {
        //Zona donde estamos colocando el valor a las variables
        int cantidadIglesias = 1;
        int cantidadFeligreses = 0;
        String nombreIglesia = "";
        String nombrePastor = "";
        int[] feligresesConCeroDiezmo;
        int[] feligresesConDiezmoMayorCienMil;
        String[] feligresesNombres;
        String[] feligresesIDs;
        double totalEarnings = 0;

    // un public void que sera donde desarrollaremos el codigo que sera llamado en el main 
    public void iglesiaDatos() {
        int cF2 = 0; //Variable establecida para igualar la cantidad de feligreses
        double totalEarnings = 0;
            //En esta zona se solicitan los datos.
            JOptionPane.showMessageDialog(null, "Se solicitarán los datos de la iglesia ");
            nombreIglesia = JOptionPane.showInputDialog(null, "Escriba el nombre de la iglesia:");
            nombrePastor = JOptionPane.showInputDialog(null, "Ingrese el nombre del pastor:");
            cantidadFeligreses = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba la cantidad de feligreses:"));
            cF2 = cantidadFeligreses;
            infoIglesia[] arreglo = new infoIglesia[cantidadFeligreses]; // con esta linea creamos el primer arreglo 
            //Aqui se crean mas arreglos los cuales nos van a servir para colocar los feligreses.
            feligresesConCeroDiezmo = new int[cantidadFeligreses];
            feligresesConDiezmoMayorCienMil = new int[cantidadFeligreses];
            feligresesNombres = new String[cantidadFeligreses];
            feligresesIDs = new String[cantidadFeligreses];

        for (int x = 0; x < cF2; x++) {
            //Este for nos sirve para crear la informacion de los feligreses
            JOptionPane.showMessageDialog(null, "Se solicitarán los datos del feligrés " + x);// esto es un menu 
            // Datos de los peligreses
            String feligresName = JOptionPane.showInputDialog(null, "Escriba el nombre del feligrés");
            String feligresID = JOptionPane.showInputDialog(null, "Ingrese la ID");
            int feligresDiez = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba la cantidad de diezmo:"));
            totalEarnings = (totalEarnings + feligresDiez);
            arreglo[x] = new infoIglesia(feligresName, feligresID, feligresDiez, totalEarnings); // Arreglo que guardara los datos de los feligreses
            // Este if nos indica que si un valor es igual a cero lo almacenara en un arreglo exclusivo a todos lo que hayan aportado 0.
            if (feligresDiez == 0) {
                feligresesConCeroDiezmo[x] = x;
            }
            // Este if nos sirve para guardar los valores superiores a 100000
            if (feligresDiez > 100000) {
                feligresesConDiezmoMayorCienMil[x] = x;
            }
            // Aqui establecemos dos matrices para guardar los nombres y las cedulas 
            feligresesNombres[x] = feligresName;
            feligresesIDs[x] = feligresID;
        }

 

        // Aqui se van a imprimir los nombres y las cedulas de las personas que no hayan dondado, es decir la que donaron 0 
        System.out.println("Lista de personas y sus cedulas con diezmo igual a 0:");
        for (int varA : feligresesConCeroDiezmo) {
            if (varA > 0) {
                System.out.println("Nombre: " + feligresesNombres[varA] + ", ID: " + feligresesIDs[varA]);
            }
        }

 

        // Aqui se van a imprimir los nombres y las cedulas de las personas que hayan donado mas de 100000
        System.out.println("Lista de personas y sus cedulas con diezmo mayor a 100,000:");
        for (int varA : feligresesConDiezmoMayorCienMil) {
            if (varA > 0) {
                System.out.println("Nombre: " + feligresesNombres[varA] + ", ID: " + feligresesIDs[varA]);
            }
        }
        // Con este codigo lo que nos dice es que aqui se imprimaran los valores de las ganancias dependiendo de lo solicitado. 
        JOptionPane.showMessageDialog(null, "El ingreso total de la iglesia es: " + totalEarnings +
                "\nEl ingreso total del pastor es: " + (totalEarnings * 0.70) + //estas son las ganancias referidas al 70% del pastor 
                "\nEl impuesto es de: " + (totalEarnings * 0.09) +//estos son los 9% de impuesto 
                "\nLa cantidad a donar será de: " + (totalEarnings * 0.21)); //Esto es el 21% de donativos que hace la iglesia 
    }
}