public class T_shirt{
private double discount;
private double price;

public T_shirt(double x, double p){
    discount = x;
    price = p;
}

public double getRealPrice(){
    return (price/(1-(discount/100)));
}

}