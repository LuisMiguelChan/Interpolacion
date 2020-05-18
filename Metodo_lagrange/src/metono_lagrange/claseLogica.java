/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metono_lagrange;

import java.util.ArrayList;

/**
 *
 * @author jtyhr
 */
public class claseLogica {
    
    ArrayList<Punto> datos;
    
    claseLogica(ArrayList<Punto> lista){
        this.datos = lista;
        
    }
    public String getLagrange(){
        int i,j;
        String lag="";
        String polinomio="";
        for(i = 0;i<this.datos.size();i++){
            lag="";
            for(j = 0;j<this.datos.size();j++){
               if(j!=i){
                    lag += "(x- " + String.valueOf(this.datos.get(j).getX()) + ") / ";
                    lag += " (" + String.valueOf(this.datos.get(i).getX()) + " - " + String.valueOf(this.datos.get(j).getX()) + ")";
               } 
            }
            if(i==0){
                polinomio += lag + " * " + " ( " +String.valueOf(this.datos.get(i).getY()) + " ) ";
            }else{
                polinomio += " + " + lag + " * " + " ( " +String.valueOf(this.datos.get(i).getY()) + " ) ";
            }
        }
        return polinomio;
    }
    
}
