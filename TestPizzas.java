/**
  * TestPizzas class.
  *
  * @author (32465092 MSM Dhlamini)
  * @version (09 April 2022)
  */
public class TestPizzas
  {
    public static void main(String[] args)
    {
      Pizza pizza = new Pizza ("sausage and onion pizza", 200);
      System.out.println(pizza.toString());
      DeliveryPizza deliveryPizza = new DeliveryPizza ("mushroom pizza", 50, "University Drive, Mafikeng");
      System.out.println(deliveryPizza.printDetails());
    }
  }