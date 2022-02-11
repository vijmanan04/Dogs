/*
 * DogTester.java
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

public class DogTester {
	
	
	public static void main (String[] args) {
		ArrayList<Dog> dogs =  new ArrayList<Dog>();
		Dog d1 =new Dog("Oakley", 2010);
		Dog d2 = new Dog ("Rocky", 2011);
		
		ShihTzu s1 = new ShihTzu("Bently", 2000, true);
		ShihTzu s2 = new ShihTzu("Joe", 2019, false);
		
		NewFoundland n1 = new NewFoundland("Cooper", 2018, true);
		NewFoundland n2 = new NewFoundland("Max", 2020, true);
		
		n2.bark("Woof");
		
		dogs.add(d1);
		dogs.add(d2);
		dogs.add(s1);
		dogs.add(s2);
		dogs.add(n1);
		dogs.add(n2);
		System.out.println("\nFirst addition of dogs: \n\n");
		for (Dog d : dogs){
			System.out.println(d.toString());
		}
		
		dogs.remove(2);
		System.out.println("\nAfter removing dogs and rearranging: \n\n");
		dogs.add(d1);
		dogs.remove(0);
		dogs.add(3, s2);
		dogs.add(0, n1);
		dogs.remove(3);
		dogs.remove(3);
		dogs.add(3, s1);
		
		for (Dog d : dogs){
			System.out.println(d.toString());
		}
		
		
		
	}
	
}

