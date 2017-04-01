package abudhabi.com.orderdetails.order.order;

import android.support.annotation.NonNull;
import android.view.View;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ChildViewHolder;

import abudhabi.com.orderdetails.R;

public class OrderDetailsViewHolder extends ChildViewHolder {

    private TextView detailsTextView;

    public OrderDetailsViewHolder(@NonNull View itemView) {
        super(itemView);
        detailsTextView = (TextView) itemView.findViewById(R.id.order_details_view);
    }

    public void bind(@NonNull OrderDetails ingredient) {
        detailsTextView.setText(ingredient.getName());
    }
}