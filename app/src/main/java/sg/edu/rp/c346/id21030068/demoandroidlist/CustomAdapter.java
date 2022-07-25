package sg.edu.rp.c346.id21030068.demoandroidlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context context;
    int layout_id;
    ArrayList<AndroidVersion> al; //versionList on worksheet

    public CustomAdapter(Context context, int resource, ArrayList<AndroidVersion> al) {
        super(context, resource, al);

        this.context = context; // parent_context on worksheet
        this.layout_id = resource;
        this.al = al;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI components and do the necessary binding
        TextView tvName = rowView.findViewById(R.id.tvName);
        TextView tvVersion = rowView.findViewById(R.id.tvVersion);

        // Obtain the Android Version information based on the position
        AndroidVersion currentVersion = al.get(position);

        // Set values to the TextView to display the corresponding information
        tvName.setText(currentVersion.getName());
        tvVersion.setText("Android version : " + currentVersion.getVersion());

        return rowView;
    }


}
