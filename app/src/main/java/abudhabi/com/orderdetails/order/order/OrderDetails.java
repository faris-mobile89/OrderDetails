package abudhabi.com.orderdetails.order.order;

public class OrderDetails {

    private String mName;
    private boolean mIsVegetarian;

    public OrderDetails(String name, boolean isVegetarian) {
        mName = name;
        mIsVegetarian = isVegetarian;
    }

    public String getName() {
        return mName;
    }

    public boolean isVegetarian() {
        return mIsVegetarian;
    }
}