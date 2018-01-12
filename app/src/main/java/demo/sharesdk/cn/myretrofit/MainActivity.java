package demo.sharesdk.cn.myretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Map<String,String> map = new HashMap<>();
        RetrofitManager.get("ad/getAd", map, new BaseObserver<DataDataBean>() {

            @Override
            public void success(DataDataBean dataDataBean) {
                Toast.makeText(MainActivity.this,dataDataBean.getData().get(3).getTitle(),Toast.LENGTH_SHORT).show();

            }

            @Override
            public void failure(int code) {

            }
        });

    }
}
