package three_три;

import java.time.LocalTime;

/**
 * Created by Лебедевв on 17.02.2020.
 */
public class Customer {
    private static int id;
    private static int count;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }

    private String firstName, lastName, middleName, addres, bankNumber;
    private int cardNumber;

    public Customer(String firstName, String lastName, String middleName, String addres, int cardNumber, String bankNumber){
        count++;
        this.id = count;
        this.lastName = lastName;
        this.addres = addres;
        this.cardNumber = cardNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.bankNumber = bankNumber;
    }

    public String toString(){
        return "Имя: " + firstName + "\nФамилия: " + middleName+ "\nАддрес: " + addres + "\n" + "Номер карты: " + cardNumber + "\n";
    }
}
