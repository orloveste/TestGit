package Class_2019_11_09;

public class ShapeRunner {
    //instantiati obiecte de tip Shape, concrete de tip triangle si sqare
    //printezi ariile lor
    public static void main(String[] args) {
        Shape myCircle = new Circle();
        myCircle.calculateArea(5);

        Shape mySquare = new Square();
        mySquare.calculateArea(4);
    }
}
