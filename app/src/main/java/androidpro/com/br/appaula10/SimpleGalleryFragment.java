package androidpro.com.br.appaula10;

/**
 * Created by dan on 19/07/16.
 */
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Gallery;
import android.widget.Toast;

public class SimpleGalleryFragment extends Fragment {

    Gallery mGallery;
    String[] mFrutas;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Resources resources = getResources();
        mFrutas = resources.getStringArray(R.array.frutas_array);
        mGallery.setAdapter(new ArrayAdapter<>(getActivity(),
                android.R.layout.simple_list_item_1, mFrutas));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mGallery  = (Gallery) inflater.inflate(R.layout.gallery_fragment, container, false);
        mGallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Toast.makeText(getActivity().getApplicationContext(), mFrutas[position], Toast.LENGTH_SHORT).show();
            }
        });
        return mGallery;
    }
}
