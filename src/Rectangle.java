public class Rectangle {
    private double length;
    private double width;


    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        //  Math.sqrt(9);
        this.width = width;
    }
    public double getArea(){
        return length * width;
    }
    public double getDiagonal(){
        return Math.sqrt(length*length + width*width);
    }
    public boolean isSquare(){
        if(length == width){
            return true;
        }else{
            return false;
        }
    }





}
