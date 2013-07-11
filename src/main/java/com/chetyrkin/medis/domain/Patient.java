package com.chetyrkin.medis.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="patient")
public class Patient {
	
	@Id
    @GeneratedValue
    @Column(name="id")
    private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="surname")
	private String surname;
	
	@Column(name="fathersName")
	private String fathersName; 
	
	@Column(name="bloodType", columnDefinition="enum('Ap', 'An', 'Op', 'On', 'Bp', 'Bn', 'ABp', 'ABn')")
	private String bloodType; 
	
	@Column(name="sex")
	private Boolean sex;
	
	@Column(name="birthDate")
	private Date birthDate;
	
	@Column(name="telephone")
	private Long telephone;
	
	@Column(name="workAdress")
	private String workAdress;
	
	@Column(name="liveAdress")
	private String liveAdress;
	
	@Column(name="specialAccounting")
	private String specialAccounting;
	
	@Column(name="hiv")
	private Boolean hiv;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getFathersName() {
		return fathersName;
	}

	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public Boolean getSex() {
		return sex;
	}

	public void setSex(Boolean sex) {
		this.sex = sex;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Long getTelephone() {
		return telephone;
	}

	public void setTelephone(Long telephone) {
		this.telephone = telephone;
	}

	public String getWorkAdress() {
		return workAdress;
	}

	public void setWorkAdress(String workAdress) {
		this.workAdress = workAdress;
	}

	public String getLiveAdress() {
		return liveAdress;
	}

	public void setLiveAdress(String liveAdress) {
		this.liveAdress = liveAdress;
	}

	public String getSpeciaAccounting() {
		return specialAccounting;
	}

	public void setSpeciaAccounting(String speciaAccounting) {
		this.specialAccounting = speciaAccounting;
	}

	public Boolean getHiv() {
		return hiv;
	}

	public void setHiv(Boolean hiv) {
		this.hiv = hiv;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((birthDate == null) ? 0 : birthDate.hashCode());
		result = prime * result
				+ ((bloodType == null) ? 0 : bloodType.hashCode());
		result = prime * result
				+ ((fathersName == null) ? 0 : fathersName.hashCode());
		result = prime * result + ((hiv == null) ? 0 : hiv.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((liveAdress == null) ? 0 : liveAdress.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		result = prime
				* result
				+ ((specialAccounting == null) ? 0 : specialAccounting.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		result = prime * result
				+ ((telephone == null) ? 0 : telephone.hashCode());
		result = prime * result
				+ ((workAdress == null) ? 0 : workAdress.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		if (birthDate == null) {
			if (other.birthDate != null)
				return false;
		} else if (!birthDate.equals(other.birthDate))
			return false;
		if (bloodType != other.bloodType)
			return false;
		if (fathersName == null) {
			if (other.fathersName != null)
				return false;
		} else if (!fathersName.equals(other.fathersName))
			return false;
		if (hiv == null) {
			if (other.hiv != null)
				return false;
		} else if (!hiv.equals(other.hiv))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (liveAdress == null) {
			if (other.liveAdress != null)
				return false;
		} else if (!liveAdress.equals(other.liveAdress))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		if (specialAccounting == null) {
			if (other.specialAccounting != null)
				return false;
		} else if (!specialAccounting.equals(other.specialAccounting))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		if (telephone == null) {
			if (other.telephone != null)
				return false;
		} else if (!telephone.equals(other.telephone))
			return false;
		if (workAdress == null) {
			if (other.workAdress != null)
				return false;
		} else if (!workAdress.equals(other.workAdress))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", surname=" + surname
				+ ", fathersName=" + fathersName + ", bloodType=" + bloodType
				+ ", sex=" + sex + ", birthDate=" + birthDate + ", telephone="
				+ telephone + ", workAdress=" + workAdress + ", liveAdress="
				+ liveAdress + ", speciaAccounting=" + specialAccounting
				+ ", hiv=" + hiv + "]";
	}
	
	
}
