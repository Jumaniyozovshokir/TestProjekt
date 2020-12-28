package Model;

import sun.swing.SwingUtilities2;

public class User {
   private  String userName;
   private  String fisrtName;
   private  String lastName;
   private  long chat_id;
   private  String phoneNumber;

    public User() {
    }

    public User(String userName, String fisrtName, String lastName, long chat_id, String phoneNumber) {
        this.userName = userName;
        this.fisrtName = fisrtName;
        this.lastName = lastName;
        this.chat_id = chat_id;
        this.phoneNumber = phoneNumber;
    }

    public User(String userName, String fisrtName, String lastName, long chat_id) {
        this.userName = userName;
        this.fisrtName = fisrtName;
        this.lastName = lastName;
        this.chat_id = chat_id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFisrtName() {
        return fisrtName;
    }

    public void setFisrtName(String fisrtName) {
        this.fisrtName = fisrtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getChat_id() {
        return chat_id;
    }

    public void setChat_id(long chat_id) {
        this.chat_id = chat_id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", fisrtName='" + fisrtName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", chat_id=" + chat_id +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
