package org.techtown.hello;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // 메시지를 띄우는 버튼 메서드
    public void onButton1Clicked(View v) {
        Toast.makeText(this, "확인1 버튼이 눌렸어요.", Toast.LENGTH_LONG).show();
    }

    // 지정된 uri로 이동하는 버튼 메서드(웹사이트)
    public void onButton2Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
        startActivity(myIntent);
    }

    // 지정된 uri로 이동하는 버튼 메서드(전화)
    public void onButton3Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-1000-1000"));
        startActivity(myIntent);
    }
}

//=================================================================================================
// onCreate
// 프로그램의 시작점 역할을 하는 onCreate
// 액티비티가 처음 생성될 때 호출되는 함수
// 처음 프로젝트를 생성 시 MainActivity에서 자동으로 생성해줄 만큼 액티비티 생명주기에 있어서 중요한 함수.
// 해당 함수에서는 액티비티를 실행하기 위하여 정의된 사용자 UI를 올리기 위해
// 레이아웃 리소스 파일을 읽어와 객체를 생성하고 각종 초기화 작업을 진행.
// 해당 함수 수 호출 후에는 항상 onStart() 함수가 같이 호출됨.
