public class Runner {
    public static void main(String[]args){
        Car myCar= new Car(2006, "A6", "toyota");
        System.out.println(myCar.toString());
        myCar.drive(5500);
        System.out.println(myCar.toString());
        Rectangle Talia = new Rectangle(20,40);
        System.out.println(Talia.getArea());
        System.out.println(Talia.getDiagonal());
        System.out.println(Talia.isSquare());
    }

}
