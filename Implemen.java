/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_Interface;

/**
 *
 * @author Godeg
 */
public class Implemen implements Sepatu{
    @Override
    public void Jenis(){
        System.out.println("Jenis Sepatu : Sepatu Gunung");
    }
    @Override
	public void Merk(){
        System.out.println("Merk Sepatu: Eiger");
    }
    @Override
	public void Size(){
        System.out.println("Sepatu ini berukuran 38-42");
    }
}

