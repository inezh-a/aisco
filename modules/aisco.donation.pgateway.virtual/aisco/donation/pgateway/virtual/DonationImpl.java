package aisco.donation.pgateway.virtual;

import aisco.donation.core.DonationComponent;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class DonationImpl extends DonationComponent {
    String transactionId;
    String virtualBank;
    String virtualNumber;
    Boolean paymentStatus;
    List <Object> donationList;

    public DonationImpl() {
        System.out.println("Donation via Transfer Bank");
        this.donationList = new ArrayList<>();
    }

    public DonationImpl(String name, String email, String phone, int amount, String paymentMethod,
            String transactionId, String virtualBank, String virtualNumber, Boolean paymentStatus) {
        super(name, email, phone, amount, paymentMethod);
        this.transactionId = transactionId;
        this.virtualBank = virtualBank;
        this.virtualNumber = virtualNumber;
        this.paymentStatus = false;
        this.donationList = new ArrayList<>();    }
    
    public void getDonation(){
        System.out.println(Arrays.asList(donationList));
    }

    public void addDonation() {
    	this.donationList.add(new DonationImpl("Zagreus", "zagreus@gmail.com", "+6285691111111", 50000, "Transfer", "1", "mBCA", "70001085691111111", false));
    	this.donationList.add(new DonationImpl("Melinoe", "melinoe@gmail.com", "+6256911111112", 20000, "Transfer", "2", "MandiriVA", "89508085691111112", false));
    }
    
    public String toString() {
        return "Donasi " + name + ": Amount: " + amount + ", transaction ID: " + transactionId + ", payment method: " + paymentMethod
                + ", Bank Name: " + virtualBank + ", Virtual Number: " + virtualNumber + ", Payment Status: " + paymentStatus + "\n";
    }

}