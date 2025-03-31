/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Gabrielly Zeni Manthay
 */
public class ItemCompra {
    
    private String ingrediente;
    private int quantidade;
    private char status;

    public ItemCompra(String nome, int quantidade, char status) {
        this.ingrediente = ingrediente;
        this.quantidade = quantidade;
        this.status = status;
    }

    public String getIngrediente() { 
        return ingrediente; 
    }
    
    public int getQuantidade() { 
        return quantidade; 
    }

    public char getStatus() {
        return status;
    }
    
    public void setIngrediente(String Ingrediente) { 
        this.ingrediente = ingrediente; 
    }
    
    public void setQuantidade(int quantidade) { 
        this.quantidade = quantidade; 
    }

    public void setStatus(char status) {
        this.status = status;
    }
}
