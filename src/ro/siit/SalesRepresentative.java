package ro.siit;

import java.util.Arrays;

/**
 * This class creates SalesRepresentative objects which have 4 properties.
 * You must pass in 3 parameters and then revenue is calculated automatically
 * by multiplying sales and quota.
 * This class implements Comparable interface to be able to make a comparison between each sales person's revenue.
 */
public class SalesRepresentative implements Comparable<SalesRepresentative> {
  private String name;
  private int sales;
  private double quota;
  private double revenue;

  /**
   * Constructor which creates a SalesRepresentative type object
   * @param name of type String
   * name of Sales person
   * @param sales of type int
   * amount of money they made from sales
   * @param quota of type double
   * amount of money charged for each sale
   */
  public SalesRepresentative(String name, int sales, double quota) {
    this.name = name;
    this.sales = sales;
    this.quota = quota;
    this.revenue = this.sales * this.quota;
  }

  /**
   * Returns the sales figure
   * @return int
   */
  public int getSales() {
    return sales;
  }

  /**
   * Sets the sales property
   * @param sales of type int
   */
  public void setSales(int sales) {
    this.sales = sales;
  }

  /**
   * Returns the quota figure
   * @return int
   */
  public double getQuota() {
    return quota;
  }

  /**
   * Sets the quota figure
   * @param quota of type double
   */
  public void setQuota(double quota) {
    this.quota = quota;
  }

  /**
   * Returns the revenue figure
   * @return int
   */
  public double getRevenue() {
    return revenue;
  }

  /**
   * This method converts the object into a string and prints on the screen all the properties of the SalesRepresentative
   * object along with their values.
   * @return String
   */
  @Override
  public String toString() {
    return "SalesRepresentative{" +
            "name='" + name + '\'' +
            ", sales=" + sales +
            ", quota=" + quota +
            ", revenue=" + revenue +
            '}';
  }

  /**
   * This method compares the revenue figure of a sales person (SalesRepresentative object) to another sales person
   * (SalesRepresentative rep, passed in as a parameter to the method).
   * This method returns:
   *  1 if the object we are comparing against the rep param has a greater revenue figure.
   * -1 if the object we are comparing against the rep param has a lower revenue figure.
   *  0 if the revenue figure of the object we are comparing is equal to the rep param's revenue figure.
   * @param rep of type SalesRepresentative
   * @return 1, -1, 0
   */
  @Override
  public int compareTo(SalesRepresentative rep) {
    if (this.getRevenue() > rep.getRevenue()) {
      return 1;
    } else if (this.getRevenue() < rep.getRevenue()) {
      return -1;
    } else {
      return 0;
    }
  }
}
