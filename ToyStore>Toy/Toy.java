public class Toy {
    private String name;
    private double price;
    private String color;
    private boolean mediaGame;


    public Toy(String name , double price , String color ,boolean mediaGame){
        this.name=name;
        this.price=price;
        this.color=color;
        this.mediaGame=mediaGame;
    }

    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return this.price;
    }

    //מדפיס מחיר מהחיצוני
     public static void printPrice(Toy t) {
     System.out.println(t.getPrice());
     }

    // מדפיס מחיר מפנימי
    public void printPrice2() {
        System.out.println(this.price);
    }
}

