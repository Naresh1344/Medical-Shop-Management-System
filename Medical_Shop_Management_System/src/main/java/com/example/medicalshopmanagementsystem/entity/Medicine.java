package com.example.medicalshopmanagementsystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="medicine")
public class Medicine {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int medicineId;
	
	private String medicineName;
	
	private double medicinePrice;
	
	private String medicineCategory;
	
	private String medicineCompany;
	
	private  int medicineQuantity;
	
	private String manufactureDate;
	
	private String expiraryDate;

	public Medicine() {
		// TODO Auto-generated constructor stub
	}

	public Medicine(int medicineId, String medicineName, double medicinePrice, String medicineCategory,
			String medicineCompany, int medicineQuantity, String manufactureDate, String expiraryDate) {
		super();
		this.medicineId = medicineId;
		this.medicineName = medicineName;
		this.medicinePrice = medicinePrice;
		this.medicineCategory = medicineCategory;
		this.medicineCompany = medicineCompany;
		this.medicineQuantity = medicineQuantity;
		this.manufactureDate = manufactureDate;
		this.expiraryDate = expiraryDate;
	}

	public int getMedicineId() {
		return medicineId;
	}

	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public double getMedicinePrice() {
		return medicinePrice;
	}

	public void setMedicinePrice(double medicinePrice) {
		this.medicinePrice = medicinePrice;
	}

	public String getMedicineCategory() {
		return medicineCategory;
	}

	public void setMedicineCategory(String medicineCategory) {
		this.medicineCategory = medicineCategory;
	}

	public String getMedicineCompany() {
		return medicineCompany;
	}

	public void setMedicineCompany(String medicineCompany) {
		this.medicineCompany = medicineCompany;
	}

	public int getMedicineQuantity() {
		return medicineQuantity;
	}

	public void setMedicineQuantity(int medicineQuantity) {
		this.medicineQuantity = medicineQuantity;
	}

	public String getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(String manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public String getExpiraryDate() {
		return expiraryDate;
	}

	public void setExpiraryDate(String expiraryDate) {
		this.expiraryDate = expiraryDate;
	}

	@Override
	public String toString() {
		return "Medicine [medicineId=" + medicineId + ", medicineName=" + medicineName + ", medicinePrice="
				+ medicinePrice + ", medicineCategory=" + medicineCategory + ", medicineCompany=" + medicineCompany
				+ ", medicineQuantity=" + medicineQuantity + ", manufactureDate=" + manufactureDate + ", expiraryDate="
				+ expiraryDate + "]";
	}
	
}
	
	


