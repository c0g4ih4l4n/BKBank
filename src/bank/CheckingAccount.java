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

    private SavingAccount soTKLienKet;

    public CheckingAccount(SavingAccount soTKLienKet, int soDu, int soTK) {
        super(soDu, soTK);
        this.soTKLienKet = soTKLienKet;
    }

    public SavingAccount getSoTKLienKet() {
        return soTKLienKet;
    }

    public void setSoTKLienKet(SavingAccount soTKLienKet) {
        this.soTKLienKet = soTKLienKet;
    }

    @Override
    public boolean rutTien(int money) {
        if (this.soDu > money) {
            super.rutTien(money);
        } else {
            if (this.soTKLienKet == null) {
                return false;
            } else if (this.soDu + this.soTKLienKet.getSoDu() < money) {
                return false;
            } else {
                this.soTKLienKet.rutTien(money - this.soDu);
                this.soDu = 0;
                return true;
            }
        }
        return true;
    }

}
