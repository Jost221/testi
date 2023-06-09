public class Rectangle implements Shape{
    private double width = 0.0f;
    private double height = 0.0f;

    public void setWidth(double width){
        this.width = width;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double calculeArea(){
        return this.width * this.width;
    }
    public double calculePerimetr(){
        return (this.height+this.width)*2.0f;
    }
}