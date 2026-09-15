package model;

public class Account {
    private String userName;
    private String password;
    private String phoneNumber;
    private double balance = 0;
    private int age;

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

    // responsibilities


    public void changePassword(String newPassword){

    }

    public void details(){

    }

    public void transfer(double value, String userName){

    }

    public void receive(double value){

    }
}
