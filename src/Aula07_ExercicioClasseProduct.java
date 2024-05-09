public class Aula07_ExercicioClasseProduct {
    private String name;
    private Double unityPrice;
    private Integer quantity;

    public Aula07_ExercicioClasseProduct(String name, Double unityPrice, Integer quantity) {
        this.name = name;
        this.unityPrice = unityPrice;
        this.quantity = quantity;
    }

    public double totalValueProduct (){
        return unityPrice*quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getUnityPrice() {
        return unityPrice;
    }

    public void setUnityPrice(Double unityPrice) {
        this.unityPrice = unityPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("%s,%.2f", name, totalValueProduct());
    }
}
