
package objects;

public class Calculator {
    private int length;
    private int iD;
    private int width;
    private int height;
    private String freightType;
    private double weight;
    private double dimension;

    public Calculator(String length, String width, String height, String freightType,
            String weight,int id) {
        this.length = Integer.parseInt(length);
        this.width = Integer.parseInt(width);
        this.height = Integer.parseInt(height);
        this.freightType = freightType;
        this.weight = Double.parseDouble(weight);
        iD = id;
        dimension = dimensionCalculator();
    }
    
    private double dimensionCalculator (){
        return length * width * height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getFreightType() {
        return freightType;
    }

    public void setFreightType(String freightType) {
        this.freightType = freightType;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    @Override
    public String toString (){
        return  "ID: "+iD+"\tFreight type: "+freightType+"/n"+
                "Dimension: "+ dimension+"\t"+"Weight:"+weight+"\n";
    }
    
    
    
}
