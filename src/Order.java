import java.util.Arrays;
import java.util.Objects;

public class Order {
    private String customer;
    private Product[] basket;

    public Order(String customer, Product[] basket) {
        this.customer = customer;
        this.basket = basket;
    }

    public String getCustomer() {
        return customer;
    }

    public Product[] getBasket() {
        return basket;
    }

    @Override
    public String toString() {
        return "Заказ[клиент= " + customer + ", корзина" + Arrays.toString(basket) + "]";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Order other = (Order) object;
        if (!Objects.equals(customer, other.customer)) {
            return false;
        }
        Product[] thisBasket = this.basket;
        Product[] otherBasket = other.basket;
        if (thisBasket == null && otherBasket == null) {
            return true;
        } else if (thisBasket == null || otherBasket == null) {
            return false;
        } else if (thisBasket.length != otherBasket.length) {
            return false;
        }
        for (int i = 0; i < thisBasket.length; i++) {
            Product thisProduct = thisBasket[i];
            Product otherProduct = otherBasket[i];
            if (thisProduct == null && otherProduct == null) {
                continue;
            } else if (thisProduct == null || otherProduct == null) {
                return false;
            } else if (!thisProduct.equals((otherProduct))) {
                return false;
            }
        }
        return true;
    }
}
