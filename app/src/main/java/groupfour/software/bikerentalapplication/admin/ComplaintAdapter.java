package groupfour.software.bikerentalapplication.admin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import groupfour.software.bikerentalapplication.R;

public class ComplaintAdapter extends ArrayAdapter<Complaint> {
    public ComplaintAdapter(Context context, ArrayList<Complaint> resource) {
        super(context, 0,resource);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Complaint complaint=getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_admin_complaint, parent, false);
        }
        TextView usern=convertView.findViewById(R.id.admin_complaint_username);
        TextView comp=convertView.findViewById(R.id.admin_complaint);
        usern.setText(complaint.getUser());
        comp.setText(complaint.getComplaint());

        return convertView;
    }
}