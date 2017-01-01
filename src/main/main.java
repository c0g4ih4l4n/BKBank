/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import bank.*;

/**
 *
 * @author te
 */
public class main {

    public static void main(String[] args) {

        BankRepo kho = new BankRepo();

        Client newClient = new Client("Tran Thi B", null, 0);
        kho.addNewClient(newClient);

        SavingAccount acc = new SavingAccount(0.1f, 2000000, 10001221);
        newClient.themTaiKhoan(acc);
        
        CheckingAccount acc1 = new CheckingAccount(acc, 3000000, 10001222);
        newClient.themTaiKhoan(acc1);

        newClient.inThongTinTaiKhoan();
    }

}
