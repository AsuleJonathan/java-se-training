package com.systech.pointofsale;

    public class item {
        public class Item {
            private String itemCode;
            private int quantity;
            private double unitprice;
        
            public Item(String itemCode, int quantity, double price){
                this.itemCode = itemcode;
                this.quantity = quantity;
                this.unitpriceprice = price;
            }
            public Item(){
                
            }
        
            public String getItemCode() {
                return itemCode;
            }
        
            public void setItemCode(String itemCode) {
                this.itemCode = itemCode;
            }
        
            public int getQuantity() {
                return quantity;
            }
        
            public void setQuantity(int quantity) {
                this.quantity = quantity;
            }
        
            public double getPrice() {
                return unitprice;
            }
        
            public void setPrice(double unitprice) {
                this.unitpriceprice = price;
            }
            
            
        }
    }
    

