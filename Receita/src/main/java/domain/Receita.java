/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Gabrielly Zeni Manthay
 */
public class Receita {
    private int id;
    private String nome;
    private String ingredientes;
    private String modoPreparo;
    //private String imagemPath;

    //String imagemPath como parametro
    public Receita(int id, String nome, String ingredientes, String modoPreparo) {
        this.id = id;
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.modoPreparo = modoPreparo;
        //this.imagemPath = imagemPath;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public String getModoPreparo() {
        return modoPreparo;
    }

    //public String getImagemPath() {
    //    return imagemPath;
    //}
    
}
