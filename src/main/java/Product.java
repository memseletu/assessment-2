public class Product {
    public double price;
    public double miles;
    public int qty;
    public String product;
    public Product (double miles, double price, int qty){
        this.miles=miles;
        this.price=price;
        this.qty=qty;
    }
    public Product(String product, int qty, double price, double miles){
        this.product=product;
        this.qty=qty;
        this.price=price;
        this.miles=miles;
    }
    public Product(){

    }
    public static double getTotal( double miles, double price,int qty){
        //here first i was trying to set the range of the miles covered equal the price. however it does not seem to work.

            if (miles>50){
                miles=20;
            } else if (miles >= 26 && miles <= 50) {
                miles = 15;
            } else if (miles >= 16 && miles <= 25) {
                miles = 10;
            } else if (miles >= 5 && miles <= 14) {
                miles =5;
            }else if(miles>=0 && miles<=4){
                miles=2;
            }



        return (qty*price)+miles;
    }
    public static void getDoubleDigits(int[] digits){
        int x =20;
        while(x<digits.length){
            if(x/10>=1){
                System.out.println(x);;

            }
            x--;
        }

    }
    public static char[] getLetter(char[] letters){
     char i=0;
        while(i>='a' && i<='z'){
            i++;
        }
        return new char[]{'y'};
    }

    public static void main(String[] args) {
        Product rice=new Product();
       rice.product = "Rice";
       rice.qty = 20;
       rice.price = 5.0;
       rice.miles= 10.0;
       Product beans = new Product();
       beans.product= "Beans";
       beans.qty=10;
       beans.price=2.0;
       beans.miles=30.0;
//
        System.out.println("Product: "+ rice.product + '\n'+ "Qty: "+ rice.qty+ '\n'+ "Price $"+rice.price + '\n'+ "Miles: " + rice.miles);
        System.out.println("==============");
        System.out.println("Total: "+ rice.getTotal(10, 5.0,20 ));


        System.out.println('\n'+"Product: "+ beans.product + '\n'+ "Qty: "+ beans.qty+ '\n'+ "Price $"+beans.price + '\n'+ "Miles: " + beans.miles);
        System.out.println("==============");
        System.out.println("Total: "+ beans.getTotal(30.0, 2.0,10) +'\n');
        //System.out.println(getTotal(10.0,5,20));
        //question 2
        char [] alphabet = {'a', 'b','c','d','e','f','g','h','i','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        alphabet [0] = '$';
        System.out.println("question 2");
        System.out.println(getLetter(alphabet));;
        for(int i=0; i<alphabet.length; i++) {
            if (alphabet[i] != 'y') {
                System.out.println(alphabet[i]);
            }
        }

        //question 3
        int [] numbers = {20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0};
        System.out.println("question 3");
        getDoubleDigits(numbers);

    }



}
//he wants us to get double digits
//we have number 0-20
//i said if i take