package androidpro.com.br.appaula10;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class CustomListFragment extends ListFragment {

    String[] mFrutas;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Resources resources = getResources();
        mFrutas = resources.getStringArray(R.array.frutas_array);
        setListAdapter(new ArrayAdapter<>(this.getActivity(),
                android.R.layout.simple_list_item_1, mFrutas));
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Toast.makeText(this.getActivity().getApplicationContext(), mFrutas[position], Toast.LENGTH_SHORT).show();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.custom_list_fragment, container, false);
        return v;
    }
}
