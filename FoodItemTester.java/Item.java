/*Describe an item:
     It possesses:
         A price, along with a brand name
         A desired amount of stock
         An genuine amount of stock
         A place in the store; whether it is subject to taxes; and a sell-by date, if any
 */

import java.time.LocalDate;

public interface Item {

    String getBrand();
    double getPrice();
    int getDesiredQty();
    int getStock();
    String getLocation();
    boolean isTaxable();
    LocalDate getSellByDate();
}