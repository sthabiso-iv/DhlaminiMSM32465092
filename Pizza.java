/**
  * Pizza class.
  *
  * @author (32465092 MSM Dhlamini)
  * @version (09 April 2022)
  */
public class Pizza
  {
    public String description;
    public double price;
    public Pizza() {}
    public Pizza (String description, double price)
    {
      this.description= description;
      this.price=price;
    }
    
      public void Pizza1(String description2, double price2) {
		// TODO Auto-generated constructor stub
	}
	public String toString()
        {
          return this.description + "Price: R" + this.price;
        }
    
  }

