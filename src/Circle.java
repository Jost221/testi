public class Circle implements Shape{
    private double radius = 0.0f;
    public void setRadius(double radius){
        this.radius = radius;
    }

    public double calculeArea() {
        return 3.14f * this.radius * this.radius;
    }
    public double calculePerimetr(){
        return 2.0f * 3.14f * this.radius;
    }
}