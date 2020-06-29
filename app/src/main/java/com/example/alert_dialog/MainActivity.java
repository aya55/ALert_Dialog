package com.example.alert_dialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button ShowDioalog=(Button) findViewById(R.id.btnShowDialog);
        ShowDioalog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mbilder= new AlertDialog.Builder(MainActivity.this) ;
                View view =getLayoutInflater().inflate(R.layout.log_in,null);
          final EditText email=(EditText) view.findViewById(R.id.etemail);

                final EditText password=(EditText) view.findViewById(R.id.etpassword);
                Button loginbttn =(Button) view.findViewById(R.id.btn);

             loginbttn.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     if (!email.getText().toString().isEmpty()&&!password.getText().toString().isEmpty()){

                         Toast.makeText(MainActivity.this, R.string.Sucess_Login_Msg,Toast.LENGTH_SHORT).show();

                     }
                     else{

                         Toast.makeText(MainActivity.this, R.string.Error_Login_Msg,Toast.LENGTH_SHORT).show();

                     }
                 }
             }); mbilder.setView(view);
                AlertDialog dialog=mbilder.create();
             dialog.show();

            }
        });

    }
}
