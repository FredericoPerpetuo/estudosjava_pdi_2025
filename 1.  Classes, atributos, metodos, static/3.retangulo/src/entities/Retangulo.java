package entities;

public class Retangulo {
    private Double width;
    private Double height;

    public Retangulo(Double width, Double heigth){
        this.width = width;
        this.height = heigth;
    }

    public Double area(){
        return width * height;
    }

    public Double perimeter(){
        return (2 * width) + (2 * height);
    }

    public Double diagonal(){
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }

    @Override
    public String toString() {
        return "ÁREA: " + String.format("%.2f", area()) + "\n" +
                "PERÍMETRO: " + String.format("%.2f", perimeter()) + "\n" +
                "DIAGONAL: " + String.format("%.2f", diagonal()) + "\n";
    }
	
}
