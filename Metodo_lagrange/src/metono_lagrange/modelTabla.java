/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metono_lagrange;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author jtyhr
 */
public class modelTabla extends AbstractTableModel{
    
    public String[] columnas = {"i","Temperatura","Densidad"};
    public ArrayList<Punto> datos = new ArrayList<Punto>();
    modelTabla(){
        
    }

    @Override
    public int getRowCount() {
        return this.datos.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnas.length;
    }

    @Override
    public boolean isCellEditable(int i, int i1) {
        return super.isCellEditable(i, i1); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getColumnName(int column) {
        return this.columnas[column];
    }
    
    @Override
    public Object getValueAt(int i, int col) {
        Punto p = this.datos.get(i);
        switch(col){
            case 0: return p.getI();
            case 1: return p.getX();
            case 2: return p.getY();
        }
        return null;
    }
    
    public void addPunto(Punto p){
        p.setI(this.datos.size());
        this.datos.add(p);
        this.fireTableRowsInserted(this.datos.size()-1, this.datos.size()-1);
    }
    
}
