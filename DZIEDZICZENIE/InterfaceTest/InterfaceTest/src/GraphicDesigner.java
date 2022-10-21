import java.util.PrimitiveIterator;

public class GraphicDesigner implements Worker {
    private String name;
    private String secName;
    private int pesel;

    public GraphicDesigner(String name, String secName, int pesel) {
        this.name = name;
        this.secName = secName;
        this.pesel = pesel;
    }

    public String getData(){
        return name + " " + secName + " " +pesel;
    }
}
