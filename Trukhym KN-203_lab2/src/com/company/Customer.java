package com.company;

public class Customer {
    private long id;
    private String surname;
    private String username;
    private String patronymic;
    private String adress;
    private long numCard;
    private double balance;

    public Customer(){
    }

    public Customer(long id, String surname, String username, String patronymic, String adress, long numCard, double balance) {
        this.id = id;
        this.surname = surname;
        this.username = username;
        this.patronymic = patronymic;
        this.adress = adress;
        this.numCard = numCard;
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public long getNumCard() {
        return numCard;
    }

    public void setNumCard(long numCard) {
        this.numCard = numCard;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", username='" + username + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", adress='" + adress + '\'' +
                ", numCard='" + numCard + '\'' +
                ", balance=" + balance +
                '}';
    }
}
