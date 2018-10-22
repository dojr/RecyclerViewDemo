package edu.shamblidoregonstate.djshamblinpapajohnalddemo;

import android.content.ClipData;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class PizzAdapter extends RecyclerView.Adapter<PizzAdapter.ViewHolder> {
    private List<Pizza> mPizzaList;
    private Context mContext;

    public PizzAdapter(List<Pizza> pizzaList, Context context) {
        mPizzaList = pizzaList;
        mContext = context;
    }

    @NonNull
    @Override
    public PizzAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View pizza = LayoutInflater.from(viewGroup.getContext())
                        .inflate(R.layout.item, viewGroup, false);

        return new ViewHolder(pizza);
    }

    @Override
    public void onBindViewHolder(@NonNull PizzAdapter.ViewHolder viewHolder, int i) {
        Pizza pizza = mPizzaList.get(i);
        viewHolder.mTextViewTopping.setText(pizza.getTopping());
        viewHolder.mTextViewDescription.setText(pizza.getDescription());
    }

    @Override
    public int getItemCount() {
        return mPizzaList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextViewTopping;
        public TextView mTextViewDescription;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            mTextViewTopping = (TextView) itemView.findViewById(R.id.papa_johnald_topping);
            mTextViewDescription = (TextView) itemView.findViewById(R.id.papa_johnald_description);
        }
    }


}
