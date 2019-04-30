package guru.springframework.talizepetclinic.model;

import java.time.LocalDate;

public class Pet {
	
	private PetType petType;
	private Owner owner;
	private LocalDate birthDate;
	
	public PetType getPetType() {
		return petType;
	}
	public void setPetType(PetType petType) {
		this.petType = petType;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public LocalDate getBirthdate() {
		return birthDate;
	}
	public void setBirthdate(LocalDate birthdate) {
		this.birthDate = birthdate;
	}

}
