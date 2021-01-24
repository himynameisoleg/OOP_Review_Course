public class Square extends Shape {
    protected double length;

    public Square(double length, String name) {
        super(name);
        this.length = length;
    }

    @Override
    public double getArea() {
        return this.length * this.length;
    }

    @Override
    public double getPerimeter() {
        return this.length * 4;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Square)) return false;
        else {
            Square other = (Square)obj;
            return this.name.equals(other.name) && this.length == other.length;
        }
    }

    @Override
    public String toString() {
        return this.name + ":" + this.length;
    }
}
/* TODO : Complete the Square class.
 Add variables if you need.
 Remember to use the @Override to override methods.
intelliJ will be helpful if you do).*/