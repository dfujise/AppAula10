package androidpro.com.br.appaula10;

/**
 * Created by dan on 20/07/16.
 */
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterViewFlipper;
import android.widget.ArrayAdapter;

public class SimpleFlipperFragment extends Fragment {

    AdapterViewFlipper mFlipper;
    String[] mFrutas;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Resources resources = getResources();
        mFrutas = resources.getStringArray(R.array.frutas_array);
        mFlipper.setAdapter(new ArrayAdapter<>(getActivity(),
                android.R.layout.simple_list_item_1, mFrutas));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mFlipper = (AdapterViewFlipper) inflater.inflate(R.layout.view_flipper_fragment, container, false);
        mFlipper.setAutoStart(true);
        mFlipper.setFlipInterval(2000);
        return mFlipper;
    }
}
