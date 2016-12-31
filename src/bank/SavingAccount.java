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
public class SavingAccount extends Account {

    private float laiSuatNganHang;

    public SavingAccount(float laiSuatNganHang, int soDu, int soTK) {
        super(soDu, soTK);
        this.laiSuatNganHang = laiSuatNganHang;
    }

    public float getLaiSuatNganHang() {
        return laiSuatNganHang;
    }

    public void setLaiSuatNganHang(float laiSuatNganHang) {
        this.laiSuatNganHang = laiSuatNganHang;
    }
    
    
}
