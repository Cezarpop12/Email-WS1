package com.Email.Model;

public class Email {
    private String receiverName;

    public Email(){
    }
    public Email(String Receivername){
        this.receiverName = Receivername;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }
}
