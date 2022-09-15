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
    public static double getTotal( double miles, double price,int qty){
        //here first i was trying to set the range of the miles covered equal the price. however it does not seem to work.
        int x =0;
        while(x>0) {
            if (miles >= 0 && miles <= 5) {
                miles = 2;
            } else if (miles >= 5 && miles <= 15) {
                miles = 2;
            } else if (miles >= 16 && miles <= 25) {
                miles = 10;
            } else if (miles >= 26 && miles <= 50) {
                miles = 15;
            } else {
                miles = 20;
            }
            x++;
        }
        return (qty*price)+miles;
    }
    public static char[] getLetter(char[] letters){
     char i=0;
        while(i>='a' && i<='z'){
            i++;
        }
        return new char[]{'y'};
    }

    public static void main(String[] args) {
        Product Rice=new Product(10.0, 5.0,20);

        System.out.println("Product:Rice");
        System.out.println("qty:20");
        System.out.println("price $5.0");
        System.out.println("miles 10");
        System.out.println(getTotal(Rice));

        //question 2
        char [] Alphabet = {'a', 'b','c','d','e','f','g','h','i','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        System.out.println(getLetter(Alphabet));;
    }



}
