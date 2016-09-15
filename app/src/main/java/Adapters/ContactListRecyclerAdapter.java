package Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mani.firebaseapplicationtest.R;

import java.util.ArrayList;

import POJO.ContactList;

/**
 * Created by Mani on 9/11/2016.
 */
public class ContactListRecyclerAdapter extends RecyclerView.Adapter<ContactListRecyclerAdapter.MyViewHolder>{

    private ArrayList<String> contactNameList,contactNumberList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView contactName, contactNumber, genre;

        public MyViewHolder(View view) {
            super(view);
            contactName = (TextView) view.findViewById(R.id.contactNameID);
            contactNumber = (TextView) view.findViewById(R.id.contactNumberID);
        }
    }


    public ContactListRecyclerAdapter(Context context , ArrayList<String> contactNameList, ArrayList<String> contactNumberList) {
        this.contactNameList   = contactNameList;
        this.contactNumberList = contactNumberList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.contact_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.contactName.setText(contactNameList.get(position));
        holder.contactNumber.setText(contactNumberList.get(position));
    }

    @Override
    public int getItemCount() {
        return contactNumberList.size();
    }
}
