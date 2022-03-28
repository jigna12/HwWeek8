package pro20pooarea;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length){
        if ((width < 0) && (length < 0 )){
            this.width = 0;
            this.length = 0;
        } else if((width < 0) && (length > 0)){
            this.width = 0;
            this.length = length;
        }else if((width > 0) && (length < 0)){
            this.width = width;
            this.length = 0;
        }else{
            this.width = width;
            this.length = length;
        }
    }
    //get-width
    public double getWidth(){
        return width;
    }
    //get-length
    public double getLength(){
        return length;
    }
    //getArea
    public double getArea(){
        return (width * length);
    }
}
