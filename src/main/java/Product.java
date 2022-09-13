public class Product {
    public double price;
    public double miles;
    public int qty;
    public Product (double miles, double price, int qty){
        this.miles=miles;
        this.price=price;
        this.qty=qty;

    }
    public Product(){

    }
    public double getTotal( double miles, double price,int qty){
        //here first i was trying to set the range of the miles covered equal the price. however it does not seem to work.
        if(miles >=0 && miles <= 5){
            price = 2;
        }else if(miles >= 5 && miles <= 15){
            price=5;
        }else if (miles>=16 && miles <=25){
            price = 10;
        }else if (miles>=26 && miles<=50){
            price=15;
        }else{
            price = 20;
        }
        return (qty*price)+miles;
    }

    public static void main(String[] args) {
        Product Rice=new Product();
        System.out.println(Rice.getTotal(10.0, 5.0,20));
    }

}
