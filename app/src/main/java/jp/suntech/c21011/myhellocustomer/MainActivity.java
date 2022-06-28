package jp.suntech.c21011.myhellocustomer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btClick = findViewById(R.id.btClick);
        HelloListener Listener = new HelloListener();  //リスナのインスタンスを生成
        btClick.setOnClickListener(Listener);         //ボタンにリスナを組み込む

        Button btClear = findViewById(R.id.btClear);
        btClear.setOnClickListener(Listener);

        Button btClears = findViewById(R.id.btClears);
        btClears.setOnClickListener(Listener);
    }
    //リスナ・クラス <= イベントの監視
    private  class HelloListener implements View.OnClickListener{
        //イベントハンドラ <= イベント発生時の処理
        @Override
        public void onClick(View view){
            EditText input = findViewById(R.id.etName);
            EditText inputs = findViewById(R.id.etHome);
            TextView output = findViewById(R.id.tvOutput);



            int id = view.getId();
            switch(id) {
                case R.id.btClick:
                    String inputStr = input.getText().toString();
                    String inputsStr = inputs.getText().toString();

                    output.setText(inputsStr+"にお住いの"+inputStr + "さん、こんにちは");
                    break;
                case R.id.btClear:
                    input.setText("");
                    output.setText("");
                    break;
                case R.id.btClears:
                    inputs.setText("");
                    output.setText("");
                    break;
            }
        }
    }

}