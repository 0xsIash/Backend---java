package model;

import java.util.ArrayList;

public class Account {
    private String userName;
    private String password;
    private String phoneNumber;
    private double balance = 0;
    private int age;
    private boolean isActive = true;
    private ArrayList<String> history = new ArrayList<String>();

    public Account(){
        // default constructor
    }

    public Account(String name, String password, int age, String phoneNumber){
        this.userName = name;
        this.password = password;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public int getAge() {
        return age;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void addToHistory(String transaction ){
        history.add(transaction );
    }

    public ArrayList<String> getHistory() {
        return history;
    }
}
