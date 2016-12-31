/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.util.ArrayList;

/**
 *
 * @author te
 */
public class Client {

    private String name;
    private ArrayList<Account> cacTaiKhoan;
    private int TongSoTK;

    public Client(String name, ArrayList<Account> cacTaiKhoan, int TongSoTK) {
        this.name = name;
        if (cacTaiKhoan != null) {
            this.cacTaiKhoan = cacTaiKhoan;
        } else {
            this.cacTaiKhoan = new ArrayList<>();
        }
        this.TongSoTK = TongSoTK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Account> getCacTaiKhoan() {
        return cacTaiKhoan;
    }

    public void setCacTaiKhoan(ArrayList<Account> cacTaiKhoan) {
        this.cacTaiKhoan = cacTaiKhoan;
    }

    public int getTongSoTK() {
        return TongSoTK;
    }

    public void setTongSoTK(int TongSoTK) {
        this.TongSoTK = TongSoTK;
    }

    // cac method chinh
    public void themTaiKhoan(Account acc) {
        cacTaiKhoan.add(acc);
        this.TongSoTK++;
    }

    public Account layTaiKhoan(int soTK) {
        for (Account acc : cacTaiKhoan) {
            if (acc.getSoTK() == soTK) {
                return acc;
            }
        }
        return null;
    }

    public void inThongTinTaiKhoan() {
        System.out.println("Tong so Tai Khoan : " + this.TongSoTK);

        // in so du va lai suat trong tung tai khoan
        for (Account acc : cacTaiKhoan) {
            System.out.println("So Tai Khoan : " + acc.getSoTK());
            System.out.print("So Du : " + acc.getSoDu());

            if (acc instanceof SavingAccount) {
                System.out.println(" Lai Suat : " + ((SavingAccount) acc).getLaiSuatNganHang());
            } else {
                System.out.println("");
            }
        }

        // in tong so tien
        System.out.println("Tong So Du : " + this.getTongSoDu());
    }

    private int getTongSoDu() {
        int result = 0;
        for (Account acc : cacTaiKhoan) {
            result += acc.getSoDu();
        }
        return result;
    }
}
