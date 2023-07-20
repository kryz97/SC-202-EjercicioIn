package iglesiaregular;

import javax.swing.JOptionPane;

public class Calculador {

    int cantidadIglesias = 1;
    int cantidadFeligreses = 0;
    String nombreIglesia = "";
    String nombrePastor = "";
    infoIglesia[][] arreglo = new infoIglesia[cantidadFeligreses][cantidadFeligreses];

    public void iglesiaDatos() {
        int cF2 = 0;
        double totalErnings = 0;

        JOptionPane.showMessageDialog(null, "Se solicitarán los datos de la iglesia ");
        nombreIglesia = JOptionPane.showInputDialog(null, "Escriba el nombre de la iglesia:");
        nombrePastor = JOptionPane.showInputDialog(null, "Ingrese el nombre del pastor:");
        cantidadFeligreses = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba la cantidad de feligreses:"));

        cF2 = cantidadFeligreses;
        for (int x = 0; x < cF2; x++) {

            JOptionPane.showMessageDialog(null, "Se solicitarán los datos de la iglesia " + x);
            String feligresName = JOptionPane.showInputDialog(null, "Escriba el nombre del feligres");
            String feligresID = JOptionPane.showInputDialog(null, "Ingrese la ID");
            int feligresDiez = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba la cantidad de diezmo:"));
            totalErnings = (totalErnings + feligresDiez);
            arreglo[cF2][cF2] = new infoIglesia(feligresName, feligresID, feligresDiez, totalErnings);
        }
        JOptionPane.showMessageDialog(null, "El ingreso total de la iglesia es: " + totalErnings + "El ingreso total del padre es: " + (totalErnings * 0.70) + "el impuesto es de: " + (totalErnings * 0.09) + "la cantidad a donar sera de: " + (totalErnings * 0.21));
    }
}
