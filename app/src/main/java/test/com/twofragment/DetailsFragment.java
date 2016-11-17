package test.com.twofragment;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by qiwx on 2016/11/15.
 */

public class DetailsFragment extends Fragment {
    FragmentMessage fm;
    private static String mIndex;
    public EditText editText2;
    Button bnt2;
    Math math;
    static TitleFragment fragment;

    //Fragment一定要有构造函数，要setArguments
    public static DetailsFragment newInstance(TitleFragment obj ) {
        Log.d("FragmentList", "DetailsFragment newInstance");
        fragment=obj;
        DetailsFragment details = new DetailsFragment();
        Bundle args = new Bundle();
        args.putSerializable("obj",obj);
        //args.putInt("index", index);
        details.setArguments(args);
        Log.d("FragmentList", "index :"
                + details.getArguments().getInt("index"));
        return details;
    }

    //只要返回view就可以了，layout里的<FrameLayout>是这个view的载体哦
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        /*if(savedInstanceState!=null){
            fragment=(TitleFragment) savedInstanceState.getSerializable("obj");
        }*/
        // TODO Auto-generated method stub
       /* Log.d("FragmentList", "DetailsFragment onCreateView");
        if (container == null)
            return null;

        TextView tv = new TextView(getActivity());
        tv.setText("details: " + mIndex);
        return tv;*/
        setListenter((FragmentMessage) getActivity());
        View view = inflater.inflate(R.layout.title_fragment, null);
        editText2 = (EditText) view.findViewById(R.id.edt_1);
         bnt2 = (Button) view.findViewById(R.id.bnt_1);
        bnt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(fragment!=null){
                    fragment.edt1.setText(editText2.getText().toString());
                }

                if (fm != null) {
                    fm.jiami(editText2.getText().toString());
                }
            }
        });
        return view;

    }

    public void setListenter(FragmentMessage fm) {
        this.fm = fm;
    }
}
