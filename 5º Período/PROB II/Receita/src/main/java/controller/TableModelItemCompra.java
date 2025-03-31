/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import domain.ItemCompra;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Gabrielly Zeni Manthay
 */
public class TableModelItemCompra extends AbstractTableModel{
    
    private List listaCompra = new ArrayList<>();

    @Override
    public int getRowCount() {
        return listaCompra.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ItemCompra item = (ItemCompra) listaCompra.get(rowIndex);
        switch ( columnIndex ) {
            case 0: return item.getIngrediente();
            case 1: return item.getQuantidade();
            case 2: return item.getStatus();         
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        String nomes[] = {"Ingredientes", "Quantidade", "Status" };
        return nomes[column];
    }
    
    public Object getItem (int rowIndex) {
        return listaCompra.get(rowIndex);        
    }
     
    public void adicionar (Object obj) {
        listaCompra.add(obj);
        fireTableRowsInserted( listaCompra.size() - 1, listaCompra.size() - 1 );
    }
    
    public void remover (int indice) {
        listaCompra.remove(indice);
        fireTableRowsDeleted( indice, indice );
    }
    
    public void setLista(List novaLista) {
        if ( novaLista == null || novaLista.isEmpty()) {
            if ( !listaCompra.isEmpty() ) {
                listaCompra.clear();
                fireTableRowsDeleted(0,0);
            }
        } else {
            listaCompra = novaLista;
            fireTableRowsInserted( 0, listaCompra.size() - 1);
        }
    }
    
    public List getLista() {
        return listaCompra;
    }
}
