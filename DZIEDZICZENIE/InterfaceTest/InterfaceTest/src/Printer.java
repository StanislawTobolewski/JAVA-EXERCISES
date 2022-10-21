public class Printer implements Worker{
    private String name;
    private String secName;
    private int pesel;

    public Printer(String name, String secName, int pesel) {
        this.name = name;
        this.secName = secName;
        this.pesel = pesel;
    }

    public String getData(){
        return name + " " + secName + " " +pesel;
    }
}
