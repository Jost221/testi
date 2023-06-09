public class Triangle implements Shape{
    private double slideA = 0.0f;
    private double slideB = 0.0f;
    private double slideC = 0.0f;

    public void setSlideA(double slideA){
        this.slideA = slideA;
    }

    public void setSlideB(double slideB){
        this.slideB = slideB;
    }

    public void setSlideC(double slideC){
        this.slideC = slideC;
    }

    public double calculePerimetr(){
        return this.slideA + this.slideB + this.slideC;
    }

    public double calculeArea(){
        return Math.sqrt(
                calculePerimetr()/2*
                        (calculePerimetr()/2-this.slideA)*
                        (calculePerimetr()/2-this.slideB)*
                        (calculePerimetr()/2*this.slideC));
    }
}