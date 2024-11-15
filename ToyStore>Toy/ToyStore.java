public class ToyStore {
    private String managerName;
    private String phoneNumber;
    private Toy[] toys; // up to 3000 toys
    public ToyStore(String managerName , String phoneNumber)
    {
        this.managerName = managerName;
        this.phoneNumber = phoneNumber;
        this.toys = new Toy[3000];
    }
}
