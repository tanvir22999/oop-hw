
class filterProducts {
  String category;
  int lower_price;
  int higher_price;
  String brand;

  filterProducts(String category, String brand, boolean flag) {
    this.category = category;
    this.brand = brand;
    System.out.println("Category: " + this.category + " and " + "Brand: " + this.brand);
  }

  filterProducts(int lower_price, int higher_price) {
    this.lower_price = lower_price;
    this.higher_price = higher_price;
    System.out.println("Higher price: " + this.higher_price + " and " + "Lower price: " + this.lower_price);
  }

}

public class practice_problem_04_overloading {
  public static void main(String[] args) {
    filterProducts filter1 = new filterProducts(100, 2000);
    filterProducts filter2 = new filterProducts("Electronic", "Smart TV", true);
  }
}
