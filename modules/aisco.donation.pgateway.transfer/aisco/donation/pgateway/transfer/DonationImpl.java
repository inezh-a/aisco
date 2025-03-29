package aisco.donation.pgateway.transfer;

import aisco.donation.core.DonationComponent;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class DonationImpl extends DonationComponent {
    String transactionId;
    String bankName;
    String bankNumber;
    Boolean paymentStatus;
    List <Object> donationList;

    public DonationImpl() {
        System.out.println("Donation via Transfer Bank");
        this.donationList = new ArrayList<>();
    }

    public DonationImpl(String name, String email, String phone, int amount, String paymentMethod,
            String transactionId, String bankName, String bankNumber, Boolean paymentStatus) {
        super(name, email, phone, amount, paymentMethod);
        this.transactionId = transactionId;
        this.bankName = bankName;
        this.bankNumber = bankNumber;
        this.paymentStatus = false;
        this.donationList = new ArrayList<>();    }
    
    public void getDonation(){
        System.out.println(Arrays.asList(donationList));
    }

    public void addDonation() {
    	this.donationList.add(new DonationImpl("Zagreus", "zagreus@gmail.com", "+6285691111111", 50000, "Transfer", "1", "BCA", "78806350373", false));
    	this.donationList.add(new DonationImpl("Melinoe", "melinoe@gmail.com", "+625691111111", 20000, "Transfer", "2", "Mandiri", "900000751099", false));
    }
    
    public String toString() {
        return "Donasi " + name + ": Amount: " + amount + ", transaction ID: " + transactionId + ", payment method: " + paymentMethod
                + ", Bank Name: " + bankName + ", Bank Number: " + bankNumber + ", Payment Status: " + paymentStatus + "\n";
    }

}