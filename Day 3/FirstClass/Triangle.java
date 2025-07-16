public class Triangle {
    private int side1;
    private int side2;
    private int side3;

    private static int triangleCount = 0;

    public Triangle(int side1, int side2, int side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        triangleCount++;
    }

    public static int getTriangleCount(){
        return triangleCount;
    }

    public double getArea(){
        double s = (double) (this.side1 + this.side2 + this.side3) / 2;
        double area = Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
        return area;
    }

    public int getSide1() {
        return side1;
    }
    public int getSide2() {
        return side2;
    }
    public int getSide3() {
        return side3;
    }
}