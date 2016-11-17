package test.com.twofragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.io.Serializable;

/**
 * Created by qiwx on 2016/11/15.
 */

public class TitleFragment extends Fragment implements Serializable {

    FragmentMessage fm;
    public EditText edt1;
    public Button bnt1;
    DetailsFragment detailsFragment;

    public TitleFragment() {
        super();
    }

    public void setListenter(FragmentMessage fm) {
        this.fm = fm;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
         detailsFragment = (DetailsFragment) getActivity()
                .getFragmentManager().findFragmentById(R.id.details);
        detailsFragment = DetailsFragment.newInstance(this);
        setListenter((FragmentMessage) getActivity());

        getActivity().getFragmentManager().beginTransaction()
                .replace(R.id.details, detailsFragment).commit();

        View view = inflater.inflate(R.layout.title_fragment, null);
        edt1 = (EditText) view.findViewById(R.id.edt_1);
        bnt1 = (Button) view.findViewById(R.id.bnt_1);
        bnt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                detailsFragment.editText2.setText(edt1.getText().toString());
            }
        });
        return view;
    }

}
