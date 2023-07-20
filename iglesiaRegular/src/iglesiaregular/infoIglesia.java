/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iglesiaregular;

/**
 *
 * @author chris
 */
public class infoIglesia {

    public double totalErnings=0;
    public String feligresName="";
    public String feligresID ="";
    public int feligresDiez = 0;
 

    public infoIglesia(String feligresName, String feligresID,int feligresDiez, double totalErnings) {
        this.feligresDiez=feligresDiez;
        this.feligresID=feligresID;
        this.feligresName=feligresName;
        this.totalErnings=totalErnings;
 
    }


   
    public double getTotalErnings() {
        return totalErnings;
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


    




