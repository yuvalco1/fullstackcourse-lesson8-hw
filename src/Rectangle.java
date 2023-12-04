public class Rectangle {
    public double width;
    public double height;

    // Constructor with 2 parameters: width and height
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    // Constructor with 1 parameter: width == square
    public Rectangle(double width){
        this.width = width;
        this.height = width;
    }

    // method to calculate area
    public double getArea(){
        return this.width * this.height;
    }

    // method to calculate perimeter
    public double getPerimeter(){
        return 2*(this.width + this.height);
    }

    //method isSquare which will return true if the rectangle is square
    public boolean isSquare(){
        return this.width == this.height;
    }



}
