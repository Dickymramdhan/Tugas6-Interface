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
public class Main implements Sepatu{
        public static void main(String[] args) {
        
        Implemen a = new Implemen();
        a.Jenis();
        a.Merk();
	a.Size();
       
    } 

    @Override
    public void Jenis() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Merk() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
