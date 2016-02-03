package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.stepan.armeniansmsbox.R;

import java.util.List;

/**
 * Created by stepan on 1/31/16.
 */
public class CategoryAdapter extends ArrayAdapter<String> {
    public CategoryAdapter(Context context, List<String> categories) {
        super(context, 0, categories);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        String category = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.category_list_fragment_item, parent, false);
        }
        // Lookup view for data population
        TextView title = (TextView) convertView.findViewById(R.id.title);

        // Populate the data into the template view using the data object

        title.setText(category);
        // Return the completed view to render on screen
        return convertView;
    }
}
