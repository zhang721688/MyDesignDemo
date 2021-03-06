package com.zxn.design;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class EnterActivity extends AppCompatActivity {

    @BindView(R.id.btn1)
    Button btn1;
    @BindView(R.id.btn2)
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter);
        ButterKnife.bind(this);
    }


    @OnClick({R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5, R.id.btn6, R.id.btn7})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                startActivity(new Intent(this, NormalActivity.class));
                break;
            case R.id.btn2:
                startActivity(new Intent(this,MainActivity.class));
                break;
            case R.id.btn3:
                startActivity(new Intent(this,ToolbarActivity.class));
                break;
            case R.id.btn4:
                startActivity(new Intent(this,NestedScrollViewActivity.class));
                break;
            case R.id.btn5:
                startActivity(new Intent(this,ToolbarRvActivity.class));
                break;
            case R.id.btn6:
                startActivity(new Intent(this,MyScrollingActivity.class));
                break;
            case R.id.btn7:
                startActivity(new Intent(this,TestScrollingActivity.class));
                break;
        }
    }
}
