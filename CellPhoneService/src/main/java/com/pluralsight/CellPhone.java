package com.pluralsight;

public class CellPhone {
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;


    public CellPhone() {
    serialNumber = 0;
    model = "";
    carrier = "";
    phoneNumber = "";
    owner = "";
}

public void printCellInfo() {
    System.out.println("\n\t------- Cell Phone Information -------\n");
    System.out.println("Serial Number: " + serialNumber);
    System.out.println("Model: " + model);
    System.out.println("Carrier: " + carrier);
    System.out.println("Phone Number: " + phoneNumber);
    System.out.println("Owner: " + owner);
}

public int getSerialNumber() {
    return serialNumber;
    }
    public String getModel(){
        return model;
    }
    public String getCarrier(){
        return carrier;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getOwner() {
        return owner;
    }


    public void setSerialNumber(int serialNumber){
        this.serialNumber = serialNumber;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }

}