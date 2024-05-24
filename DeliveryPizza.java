/**
  * DeliveryPizza class.
  *
  * @author (32465092 MSM Dhlamini)
  * @version (09 April 2022)
  */
public class DeliveryPizza extends Pizza
  {
    public double deliveryFee;
    public String address;
    public DeliveryPizza (String description, double price, String add)
    {
      super(description, price);
      this.address = add;
      if (super.price > 120)
      {
        this.deliveryFee = 20;
      }
      else
      {
        this.deliveryFee = 45;
      }  
    }
    public String printDetails()
    {
      return super.toString() + "\n\tDeliver to: "+this.address+". Fee is: "+this.deliveryFee;
    }
  }