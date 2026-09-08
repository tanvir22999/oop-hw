class platfrom {
  String brand;
  String category;
  double Highprice;
  double Lowprice;

  void filterProducts(String category) {
    this.category = category;
    System.out.println("Category: " + category);
  }

  void filterProducts(double Highprice, double Lowprice) {
    this.Highprice = Highprice;
    this.Lowprice = Lowprice;
    System.out.println(" Highprice: " + Highprice + " Lowprice: " + Lowprice);
  }

  void filterProducts(String category, double Highprice, double Lowprice) {
    this.category = category;
    this.Highprice = Highprice;
    this.Lowprice = Lowprice;
    System.out.println("Category: " + category + " Highprice: " + Highprice + " Lowprice: " + Lowprice);
  }

  void filterProducts(String category, double Highprice, double Lowprice, String brand) {
    this.category = category;
    this.Highprice = Highprice;
    this.Lowprice = Lowprice;
    this.brand = brand;
    System.out
        .println("Category: " + category + " Highprice: " + Highprice + " Lowprice: " + Lowprice + " Brand: " + brand);
  }

  void filterProducts(String brand, boolean check) {
    this.brand = brand;
  }
  // By category (e.g., "electronics", "fashion").
  // ○ By price range (e.g., products between $100 and $500).
  // ○ By brand (e.g., "Apple", "Nike").
  // ○ By category and price range.
  // ○ By category, price range, and brand
}

public class ecommerce {
  public static void main(String[] args) {
    platfrom platfrom1 = new platfrom();
    platfrom1.filterProducts("Red");
    platfrom1.filterProducts("aws", true);
    platfrom1.filterProducts("Blue", 183.2, 23.23);

  }
}