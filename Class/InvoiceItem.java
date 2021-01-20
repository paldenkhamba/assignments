class InvoiceItem{
 private double unitPrice;
 private String id;
 private String desc;
 private int qty;
 
 InvoiceItem(String id, String desc, int qty,double unitPrice){
     this.id = id;
     this.desc = desc;
     this.qty = qty;
     this.unitPrice = unitPrice;
    }
    
 String getID(){
     return id;
    }
 void setQty(int qty){
     this.qty = qty;
    }
 String getDesc(){
     return desc;
    }
 int getQty(){
     return qty;
    }
 double getUnitPrice(){
     return unitPrice;
    }
 void setUnitPrice(double unitPrice){
     this.unitPrice = unitPrice;
    }
 double getTotal(){
     return  unitPrice*qty;
    }
 public String toString(){
     return "InvoiceItem[id = "+id+",desc = "+desc+",qty = "+qty+",unitPrice = "+unitPrice+"]";
    }
 public static  void main(String [] args){
     InvoiceItem E= new InvoiceItem("car", "to drive",34,20);
     System.out.println(" ID = "+E.getID());
     System.out.println(" desc = "+E.getDesc());
     System.out.println(" Qty = "+E.getQty());
     System.out.println(" unit price = "+E.getUnitPrice());
     System.out.println("total = "+E.getTotal());
     System.out.println(E.toString());
    }
}
