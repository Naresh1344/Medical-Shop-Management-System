package com.example.medicalshopmanagementsystem.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;


@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int customerId;
	
	@NonNull
	private String customerName;
	
	private String customerPhoneNo;
	
	private String customerAddress;
	
	private String medicineCatogery;
	
	private String medicineName;
	
	private String medicineQuantity;
	
	private double amount;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int customerId, String customerName, String customerPhoneNo, String customerAddress,
			String medicineCatogery, String medicineName, String medicineQuantity, double amount) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerPhoneNo = customerPhoneNo;
		this.customerAddress = customerAddress;
		this.medicineCatogery = medicineCatogery;
		this.medicineName = medicineName;
		this.medicineQuantity = medicineQuantity;
		this.amount = amount;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerPhoneNo() {
		return customerPhoneNo;
	}

	public void setCustomerPhoneNo(String customerPhoneNo) {
		this.customerPhoneNo = customerPhoneNo;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getMedicineCatogery() {
		return medicineCatogery;
	}

	public void setMedicineCatogery(String medicineCatogery) {
		this.medicineCatogery = medicineCatogery;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public String getMedicineQuantity() {
		return medicineQuantity;
	}

	public void setMedicineQuantity(String medicineQuantity) {
		this.medicineQuantity = medicineQuantity;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerPhoneNo="
				+ customerPhoneNo + ", customerAddress=" + customerAddress + ", medicineCatogery=" + medicineCatogery
				+ ", medicineName=" + medicineName + ", medicineQuantity=" + medicineQuantity + ", amount=" + amount
				+ "]";
	}
	


}
