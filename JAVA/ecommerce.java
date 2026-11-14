import java.util.*;
abstract  class Product{
    int productId;
    String productName;
    double price;

    public Product(int p,String n, double price) {
        this.productId=p;
        this.productName=n;
        this.price=price;
    }
    abstract double calculateDiscount();
}
class ElectronicsProduct extends Product{

    public ElectronicsProduct(int p,String n,double price) {
        super(p,n,price);
    }
    double discount;
    double price;
    @Override
    public double calculateDiscount(){
        discount = price*0.12;
        price = super.price-discount;
        return discount;
    }

    
}
class ClothingProduct extends Product{

    public ClothingProduct(int p,String n,double price) {
        super(p,n,price);
    }
    double discount;
    double price;
    @Override
    public double calculateDiscount(){
        discount = price*0.20;
        price = super.price-discount;
        return discount;
    }
}

class GroceryProduct extends Product{

    public GroceryProduct(int p,String n,double price) {
        super(p,n,price);
    }
    double discount;
    double price;
    @Override
    public double calculateDiscount(){
        discount = price*0.12;
        price = super.price-discount;
        return discount;
    }

    
}

class ecommerce{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String sa[] = s.split(" ");
        int i = Integer.parseInt(sa[0]);
        double amount = Integer.parseInt(sa[2]);
        System.out.println("Product ID: "+sa[0]);
        System.out.println("Product Name: "+sa[1]);
        if(a==1){
            ElectronicsProduct e = new ElectronicsProduct(i, sa[1],amount);
            System.out.println("Discount: "+e.discount);
            System.out.println("Final Price: "+e.price);
        }
        if(a==2){
            ClothingProduct e = new ClothingProduct(i, sa[1],amount);
            System.out.println("Discount: "+e.discount);
            System.out.println("Final Price: "+e.price);
        }
        if(a==3){
            GroceryProduct e = new GroceryProduct(i, sa[1],amount);
            System.out.println("Discount: "+e.discount);
            System.out.println("Final Price: "+e.price);
        }
    }
}
