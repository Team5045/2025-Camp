class Main {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(3, 4, 5);

        System.out.println(t1.getSide1());
        System.out.println(t1.getArea());

        System.out.println(Triangle.getTriangleCount());
    }
}