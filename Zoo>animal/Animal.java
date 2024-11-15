public class Animal {
    private String name;
    private double weight;
    private boolean isFriendly;
    private boolean isMammal;
    private String type;

    // בנאי
    public Animal(String type, boolean isMammal, boolean isFriendly, Double weight, String name) {
        this.isFriendly = isFriendly;
        this.isMammal = isMammal;
        this.name = name;
        this.type = type;
        this.weight = weight;
    }

    // בנאי העתקה
    public Animal(Animal other) {
        this.isFriendly = other.isFriendly;
        this.isMammal = other.isMammal;
        this.name = other.name;
        this.type = other.type;
        this.weight = other.weight;
    }

    // get & set
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setIsMammal(boolean isMammal) {
        this.isMammal = isMammal;
    }

    public boolean getIsMammal() {
        return this.isMammal;
    }

    public boolean getIsFriendly() {
        return this.isFriendly;
    }

    public double getWeight() {
        return this.weight;
    }

    public String getname() { return this.name; }

    public String getType() { return this.type; }

    // מדפיס שם מחיצוני
    public static void print(Animal a) {
        System.out.println(a.getName());
    }

}

