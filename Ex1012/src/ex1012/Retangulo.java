package ex1012;

public class Retangulo {
    private double lado1;
    private double lado2;

    public Retangulo(){
        
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    public double AreaRetangulo(){
        double area;
        area = this.lado1 * this.lado2;
        return area;
    }
}
