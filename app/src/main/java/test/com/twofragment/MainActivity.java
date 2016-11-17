package test.com.twofragment;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity implements FragmentMessage{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void initData(Fragment fm) {

    }

    @Override
    public void jiami(String str) {
        Toast.makeText(this,str,Toast.LENGTH_LONG).show();
    }

    @Override
    public void jiemi(String str) {
        Toast.makeText(this,str,Toast.LENGTH_LONG).show();
    }
}
