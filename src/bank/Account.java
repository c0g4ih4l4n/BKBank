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
public abstract class Account {

    protected int soDu;
    protected int soTK;

    public Account() {
        soDu = 0;
        soTK = 0;
    }

    public Account(int soDu, int soTK) {
        this.soDu = soDu;
        this.soTK = soTK;
    }

    public int getSoDu() {
        return soDu;
    }

    public void setSoDu(int soDu) {
        this.soDu = soDu;
    }

    public int getSoTK() {
        return soTK;
    }

    public void setSoTK(int soTK) {
        this.soTK = soTK;
    }

    public boolean guiTien(int money) {
        this.soDu += money;
        return true;
    }

    public boolean rutTien(int money) {
        if (this.soDu < money) {
            return false;
        }
        this.soDu -= money;
        return true;
    }

    public int kiemTraSoDu() {
        return this.getSoDu();
    }
}
