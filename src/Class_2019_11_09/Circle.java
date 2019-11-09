package Class_2019_11_09;

public class Circle extends Shape {
    @Override
    public void calculateArea(int param) {
       // return 0;
        double ShapeCircle = Math.PI * (param * param);
        System.out.println(" ShapeCircle = " + ShapeCircle);
    }
    //Math.PI * (r^2)

}
