package com.pluralsight.models;

import java.util.List;

public class Sandwich extends Product {

    private int size;
    private String breadType;
    private List<String> regToppings;
    private List<String> meats;
    private List<String> cheeses;
    private boolean toasted;


    public Sandwich() {

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public List<String> getToppings() {
        return regToppings;
    }

    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }

    public List<String> getRegToppings() {
        return regToppings;
    }

    public void setRegToppings(List<String> regToppings) {
        this.regToppings = regToppings;
    }

    public List<String> getMeats() {
        return meats;
    }

    public void setMeats(List<String> meats) {
        this.meats = meats;
    }

    public List<String> getCheeses() {
        return cheeses;
    }

    public void setCheeses(List<String> cheeses) {
        this.cheeses = cheeses;
    }

    @Override

    public double calculatePrice() {

       // this is where the logic will go
        // to calculate the orice if a sandwich with all topics
        //meats and cheeses


        //pprice for 4 in + toppinng
        if(size == 4){
            price += 5.50;

            System.out.println( price + " in the sandwich class");

            //add meats
            if(meats.isEmpty()){
                //nothing happens at this point
                System.out.println( price + " in the sandwich class no meats");
            } else if(meats.size() == 1){
                price+=1.00;
                System.out.println( price + " in the sandwich class 1 meat ");
            }else{
                price += (1.00 + (.50 * (meats.size() - 1)));
                System.out.println( price + " in the sandwich class more than 1");
            }

            //add cheeses
            if(cheeses.isEmpty()){
                //nothing happens at this point
                System.out.println( price + " in the sandwich class no cheese");
            } else if(cheeses.size() == 1){
                price+=.75;
                System.out.println( price + " in the sandwich class 1 cheese");
            }else{
                price += (.75 + (.30 * (cheeses.size() - 1)));
                System.out.println( price + " in the sandwich class more than 1 cheese");
            }



            ///pprice for 8 in + toppinng
        } else  if(size == 8){
            price+=7.00;

            //add meats
            if(meats.isEmpty()){
                //nothing happens at this point
            } else if(meats.size() == 1){
                price+=2.00;
            }else{
                price += (2.00 + (1.00 * (meats.size() - 1)));
            }

            //add cheeses
            if(cheeses.isEmpty()){
                //nothing happens at this point
            } else if(cheeses.size() == 1){
                price+=1.50;
            }else{
                price += (1.5 + (.60 * (cheeses.size() - 1)));
            }



            //pprice for 12 in + toppinng
        } else {

            price+=8.50;

            //add meats
            if(meats.isEmpty()){
                //nothing happens at this point
            } else if(meats.size() == 1){
                price+=3.00;
            }else{
                price += (3.00 + (1.50 * (meats.size() - 1)));
            }

            //add cheeses
            if(cheeses.isEmpty()){
                //nothing happens at this point
            } else if(cheeses.size() == 1){
                price+=2.25;
            }else{
                price += (2.25 + (.90 * (cheeses.size() - 1)));
            }


        }


        return price;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "size=" + size +
                ", breadType='" + breadType + '\'' +
                ", regToppings=" + regToppings +
                ", meats=" + meats +
                ", cheeses=" + cheeses +
                ", toasted=" + toasted +
                '}';
    }

    //example of a helper method to calculate the price
    //for each cadwich nased on the size and toppings


}