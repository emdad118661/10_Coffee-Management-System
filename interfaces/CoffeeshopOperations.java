package interfaces;
import java.lang.*;
import classes.*;

public interface CoffeeshopOperations
{
	void insertCoffeeshop(Coffeeshop c);
    void removeCoffeeshop(Coffeeshop c);
    Coffeeshop getCoffeeshop(String cid);
    void showAllCoffeeshops();
}