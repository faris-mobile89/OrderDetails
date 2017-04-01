package abudhabi.com.orderdetails.order.order;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.bignerdranch.expandablerecyclerview.ExpandableRecyclerAdapter;
import abudhabi.com.orderdetails.R;

import java.util.Arrays;
import java.util.List;


public class OrderViewActivity extends AppCompatActivity {

    private OrdersAdapter mAdapter;

    @NonNull
    public static Intent newIntent(Context context) {
        return new Intent(context, OrderViewActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_sample);

        //OrderModel orderModel = new Gson().fromJson(JSON.json, OrderModel.class);

        OrderDetails orderDetails = new OrderDetails("beef", false);
        Order order = new Order("KFC", Arrays.asList(orderDetails));
        Order order2 = new Order("Burger King", Arrays.asList(orderDetails));

        final List<Order> orderList = Arrays.asList(order,order2);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        mAdapter = new OrdersAdapter(this, orderList);

        mAdapter.setExpandCollapseListener(new ExpandableRecyclerAdapter.ExpandCollapseListener() {
            @UiThread
            @Override
            public void onParentExpanded(int parentPosition) {
//                Order expandedOrder = orderList.get(parentPosition);
//
//                String toastMsg = getResources().getString(R.string.expanded, expandedOrder.getName());
//                Toast.makeText(this,
//                        toastMsg,
//                        Toast.LENGTH_SHORT)
//                        .show();
            }

            @UiThread
            @Override
            public void onParentCollapsed(int parentPosition) {
//                Order collapsedOrder = orderList.get(parentPosition);
//
//                String toastMsg = getResources().getString(R.string.collapsed, collapsedOrder.getName());
//                Toast.makeText(this,
//                        toastMsg,
//                        Toast.LENGTH_SHORT)
//                        .show();
            }
        });

        recyclerView.setAdapter(mAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mAdapter.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        mAdapter.onRestoreInstanceState(savedInstanceState);
    }
}
