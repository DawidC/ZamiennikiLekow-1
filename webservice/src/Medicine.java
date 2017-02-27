import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "medicine") 

public class Medicine implements Serializable {  
   private static final long serialVersionUID = 1L; 
   
   private int MedicineID; 
   public int getMedicineID() {
	return MedicineID;
}
   @XmlElement
public void setMedicineID(int medicineID) {
	MedicineID = medicineID;
}

public String getMedicineName() {
	return MedicineName;
}
@XmlElement
public void setMedicineName(String medicineName) {
	MedicineName = medicineName;
}

public String getIngredient1() {
	return ingredient1;
}
@XmlElement
public void setIngredient1(String ingredient1) {
	this.ingredient1 = ingredient1;
}

public String getIngredient2() {
	return ingredient2;
}
@XmlElement
public void setIngredient2(String ingredient2) {
	this.ingredient2 = ingredient2;
}

public String getIngredient3() {
	return ingredient3;
}
@XmlElement
public void setIngredient3(String ingredient3) {
	this.ingredient3 = ingredient3;
}

public String getIngredient4() {
	return ingredient4;
}
@XmlElement
public void setIngredient4(String ingredient4) {
	this.ingredient4 = ingredient4;
}

public String getIngredient5() {
	return ingredient5;
}
@XmlElement
public void setIngredient5(String ingredient5) {
	this.ingredient5 = ingredient5;
}

public String getDose() {
	return dose;
}
@XmlElement
public void setDose(String dose) {
	this.dose = dose;
}

public int getAmount() {
	return amount;
}
@XmlElement
public void setAmount(int amount) {
	this.amount = amount;
}

public String getAmountUnit() {
	return amountUnit;
}
@XmlElement
public void setAmountUnit(String amountUnit) {
	this.amountUnit = amountUnit;
}

public String getForm() {
	return form;
}
@XmlElement
public void setForm(String form) {
	this.form = form;
}

public String getPhotoURL() {
	return PhotoURL;
}
@XmlElement
public void setPhotoURL(String photoURL) {
	PhotoURL = photoURL;
}
private String MedicineName; 
   private String ingredient1; 
   private String ingredient2;
   private String ingredient3;
   private String ingredient4;
   private String ingredient5;
   private String dose;
   private int amount;
   private String amountUnit;
   private String form;
   private String PhotoURL;
   public Medicine(){} 
    
   public Medicine(int MedicineID, String MedicineName, String ingredient1, String ingredient2, String ingredient3, String ingredient4, String ingredient5, String dose,
		   int amount,String amountUnit, String form, String PhotoURL){  
      this.MedicineID = MedicineID; 
      this.MedicineName = MedicineName; 
      this.ingredient1 = ingredient1; 
      this.ingredient2 = ingredient2;
      this.ingredient3 = ingredient3;
      this.ingredient4 = ingredient4;
      this.ingredient5 = ingredient5;
      this.dose =dose;
      this.amount = amount;
      this.amountUnit = amountUnit;
      this.form = form;
      this.PhotoURL =PhotoURL;
   }     
}
