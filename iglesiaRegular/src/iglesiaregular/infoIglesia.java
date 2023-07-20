/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iglesiaregular;

/**
 *author chris
 * author alejh
 */
public class infoIglesia {
    // En esta zona se definen los valores que vamos a usar
    public double totalEarnings = 0;
    public String feligresName = "";
    public String feligresID = "";
    public int feligresDiez = 0;
    // Aqui creamos un constructor que sera utilizado mas adelante
    public infoIglesia(String feligresName, String feligresID, int feligresDiez, double totalEarnings) {
        this.feligresDiez = feligresDiez;
        this.feligresID = feligresID;
        this.feligresName = feligresName;
        this.totalEarnings = totalEarnings;
    }
    // zona de gatters
    public double getTotalEarnings() {
        return totalEarnings;
    }

 

    public String getFeligresName() {
        return feligresName;
    }

 

    public String getFeligresID() {
        return feligresID;
    }

 

    public int getFeligresDiez() {
        return feligresDiez;
    }
}
