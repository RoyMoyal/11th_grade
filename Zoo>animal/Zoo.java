public class Zoo {

    private String name;
    private Animal[] ani;

    public Zoo(String name){
        this.name=name;
        this.ani= new Animal[632];
    }

    public int countAnimal(){
        int count=0;
        for (int i = 0; i < ani.length; i++) {
            if (this.ani[i]!=null)
                count++;
        }
        return count;
    }

    public int countEmpty(){
        int count=0;
        for (int i = 0; i < ani.length; i++) {
            if (this.ani[i] == null)
                count++;
        }
        return count;
    }

    //ט
    public int printFriendly(){
        int count=0;
        for (int i = 0; i < ani.length; i++) {
            if (this.ani[i].getIsFriendly()==true)
                count++;
        }
        return count;
    }

    //י
    public int printTon(Animal[] ani){
        int count=0;
        for (int i = 0; i < ani.length; i++) {
            if (this.ani[i].getWeight()>=1000)
                count++;
        }
        return count;
    }

    //יא
    public void printNames(Animal[] ani){
        for (int i = 0; i < ani.length; i++) {
            if (this.ani[i].getIsMammal()==true)
             System.out.println(this.ani[i].getName());
        }
    }

    //יב
    public boolean friendlyShark(){
        for (int i = 0; i < ani.length; i++) {
            if (this.ani[i].getname().equals("Shark") && this.ani[i].getIsFriendly()==false)
                return true;
        }
        return false;
    }

    //יג
    public boolean equalsWeight(Animal lion , Animal bear ){
        if (lion.getWeight()==bear.getWeight())
            return true;
        else
            return false;

    }

    //יד
    public boolean mitzi(Animal lion , String Mitzi){
        if (lion.getname().equals("Mitzi") && lion.getWeight()<4 && lion.getIsFriendly()==true)
            return true;
        else
            return false;
    }

    //טו
     public void printName(){
         for (int i = 0; i < ani.length ; i++) {
             if (this.ani[i].getIsFriendly() == true && this.ani[i].getWeight()<5000)
                 System.out.println(this.ani[i].getType()+": "+this.ani[i].getname());
         }
     }

     //טז
    public void printFood(){
        double sum=0;
        for (int i = 0; i < ani.length ; i++) {
            sum+=ani[i].getWeight();
        }
        System.out.println("Food require: "+sum/20);
        System.out.println("Total weight in the zoo: "+sum);
    }

    public static void main(String[] args){
        Zoo zoo = new Zoo("saferi zoo");
        Animal lion=new Animal("good",true,true,30.0,"lion");
        Animal bear=new Animal("good",true,true,30.0,"lion");
        zoo.ani[0]=new Animal("good", true, true, 40.0, "leon");
        zoo.ani[1]= new Animal("bad", true, false, 500.0, "bear");
        zoo.ani[2]=lion;
        System.out.println(zoo.countEmpty());
    }
}
