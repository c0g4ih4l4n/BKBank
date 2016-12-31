/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author te
 */
public class CheckingAccount extends Account {
    
    private int soTKLienKet;

    public CheckingAccount(int soTKLienKet, int soDu, int soTK) {
        super(soDu, soTK);
        this.soTKLienKet = soTKLienKet;
    }

    public int getSoTKLienKet() {
        return soTKLienKet;
    }

    public void setSoTKLienKet(int soTKLienKet) {
        this.soTKLienKet = soTKLienKet;
    }
    
    
    
}
