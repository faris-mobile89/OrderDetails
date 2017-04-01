package abudhabi.com.orderdetails.order.order;

import com.bignerdranch.expandablerecyclerview.model.Parent;

import java.util.List;

public class Order implements Parent<OrderDetails> {

    private String mName;
    private String cost;
    private String location;
    private String image;

    private List<OrderDetails> mIngredients;

    public Order(String name, List<OrderDetails> ingredients) {
        mName = name;
        mIngredients = ingredients;
    }

    public String getName() {
        return mName;
    }

    @Override
    public List<OrderDetails> getChildList() {
        return mIngredients;
    }

    @Override
    public boolean isInitiallyExpanded() {
        return false;
    }

    public OrderDetails getIngredient(int position) {
        return mIngredients.get(position);
    }

    public boolean isVegetarian() {
        for (OrderDetails ingredient : mIngredients) {
            if (!ingredient.isVegetarian()) {
                return false;
            }
        }
        return true;
    }
}
