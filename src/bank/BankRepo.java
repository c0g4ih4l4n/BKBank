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
public class BankRepo {
    
    private ArrayList<Account> listAccounts;
    private ArrayList<Client> listClients;
    
    public BankRepo() {
        listAccounts = new ArrayList<>();
        listClients =new ArrayList<>();
    }

    public BankRepo(ArrayList<Account> listAccounts, ArrayList<Client> listClients) {
        this.listAccounts = listAccounts;
        this.listClients = listClients;
    }

    public ArrayList<Account> getListAccounts() {
        return listAccounts;
    }

    public void setListAccounts(ArrayList<Account> listAccounts) {
        this.listAccounts = listAccounts;
    }

    public ArrayList<Client> getListClients() {
        return listClients;
    }

    public void setListClients(ArrayList<Client> listClients) {
        this.listClients = listClients;
    }
    
    public void addNewAccount(Account acc) {
        listAccounts.add(acc);
    }
    
    public void addNewClient(Client client) {
        listClients.add(client);
    }
}
