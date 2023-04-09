package web.model;

public class Car {

    private String model;
    private String series;



    public Car(String model, String series, String color) {
        this.model = model;
        this.series = series;
        this.color = color;
    }

    private String color;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series='" + series + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
