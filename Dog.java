/*
 * Dog.java
 * 
 * Copyright 2022 Manan Vij <vijman22@US-CompLabiMac-16.local>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */

import java.util.ArrayList;
public class Dog {
	
	private String name;
	private int yearBirth;
	private String breed = "None";
	
	public int addDog(ArrayList<Dog> dogs, Dog dog){
		if (dogs.size() < 2){
			dogs.add(dog);
			return 0;
		}
		
		for (int i = 1; i < dogs.size()-1; i++){
			if (!dogs.get(i-1).getBreed().equals(dog.getBreed()) && !dogs.get(i-1).getBreed().equals(dog.getBreed()) ){
				dogs.add(i, dog);
				return 0;
			}
			
		}
		return 1;
	}
	
	public Dog(String name, int yearBirth){
		this.name = name;
		this.yearBirth = yearBirth;
	}
	
	public void eat(){
		System.out.println(name + "is eating. ");
	}
	
	public void sleep(){
		System.out.println(name + "is sleeping. ");
	}
	
	public void bark(String sound){
		System.out.println(name + " goes " + sound +"!");
	}
	
	public String getName(){
		return name;
	}
	
	public int getBirthYear(){
		return yearBirth;
	}
	
	public String getBreed(){
		return breed;
	}
	
	public String toString(){
		return ("Name: " + name + " Birth Year: " + yearBirth);
	}
}

class ShihTzu extends Dog {
	private boolean hypoAllergenic;
	private String breed = "ShihTzu";

	public String getBreed(){
		return breed;
	}
	
	public ShihTzu(String name, int yearBirth, boolean hypoAllergenic){
		super(name, yearBirth);
	}
	
	public void goAway(){
		System.out.println(super.getName() + " is walking away because someone doesn't like dogs.");
	}
	
	public void fetchRats(){
		System.out.println(super.getName() + " is fetching rats.");
	}
	
	public String toString(){
		return ("Name: " + super.getName() + " Birth Year: " + super.getBirthYear() + " is hypoallergenic: " + hypoAllergenic);
	}
}


class NewFoundland extends Dog {
	private boolean canSwim;
	private String breed = "NewFoundland";
	
	public String getBreed(){
		return breed;
	}
	public NewFoundland(String name, int yearBirth, boolean canSwim){
		super(name, yearBirth);
		this.canSwim = canSwim;
	}
	
	public void swim(){
		System.out.println(super.getName() + " is swimming.");
	}
	
	public void fish(){
		System.out.println(super.getName() + " is helping fish.");
	}
	
	public String toString(){
		return ("Name: " + super.getName() + " Birth Year: " + super.getBirthYear() + " can swim: " + canSwim);
	}
}

