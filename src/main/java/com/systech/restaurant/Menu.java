package com.systech.restaurant;

public class Menu {
    private String option;
    private int price;
    
    public Menu(String option, int price) {
        this.option = option;
        this.price = price;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public Menu(){

    }


    public void showOption(){
        System.out.println(option);
    }
}
