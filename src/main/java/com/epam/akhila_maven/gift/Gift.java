package com.epam.akhila_maven.gift;

import com.epam.akhila_maven.chocolates.Chocolate;
import com.epam.akhila_maven.sweets.Sweets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Gift {
	private ArrayList<Chocolate> chocolates;
    private ArrayList<Sweets> sweets;

    public Gift(){
        chocolates=new ArrayList<Chocolate>();
        sweets=new ArrayList<Sweets>();

}
    public void addChocolates(Chocolate... chocolates){
        this.chocolates.addAll(Arrays.asList(chocolates));
    }

    public void addSweets(Sweets... sweets){
        this.sweets.addAll(Arrays.asList(sweets));
    }

    public void sort(){
        Collections.sort(chocolates);
        Collections.sort(sweets);
    }

    public ArrayList<Chocolate> getChocolates() {
        return chocolates;
    }

    public ArrayList<Sweets> getSweets() {
        return sweets;
    }

    public int findTotalWeight(){
        int weight=0;

        for(Chocolate c: this.chocolates)
            weight+=c.getWeight();
        for(Sweets s: this.sweets)
            weight+=s.getWeight();

        return weight;
    }
	public void addsweets(com.epam.akhila_maven.sweets.Sweets sweets1, com.epam.akhila_maven.sweets.Sweets sweets2,
			com.epam.akhila_maven.sweets.Sweets sweets3, com.epam.akhila_maven.sweets.Sweets sweets4) {
		// TODO Auto-generated method stub
		
	}
	public void addchocolates(Chocolate chocolate1, Chocolate chocolate2, Chocolate chocolate3) {
		// TODO Auto-generated method stub
		
	}
}
