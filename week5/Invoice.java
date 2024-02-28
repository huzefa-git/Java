package week5;

public class Invoice {
    String id,desc;
    int quantity,unit_price;

    public InvoiceItem(String id, String desc, int quantity, int unit_price){
        this.id = id;
        this.desc = desc;
        this.quantity = quantity;
        this.unit_price = unit_price;
    }

    public String getid(){
        return id;
    }

    public String setId(String id){
        this.id = id;
    }

    public String description(String desc){
        return desc;
    }

    public String setdesc(String desc){
        this.desc = desc;
    }
    
}
