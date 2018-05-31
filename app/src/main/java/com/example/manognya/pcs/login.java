package com.example.manognya.pcs;

import android.content.SharedPreferences;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.text.LoginFilter;
import android.view.Window;
import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;




public class login extends Activity {

    private EditText Username;
    private EditText Password;
    private TextView Info;
    private Button login;
    private Image img;
    private int counter = 5;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_login);
        Username = (EditText) findViewById(R.id.etUsername);
        Password = (EditText) findViewById(R.id.etPassword);
        Info = (TextView) findViewById(R.id.tvInfo);
        login = (Button) findViewById(R.id.btnlogin);

        Info.setText("Number of attempts remaining: 5");
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Username.getText().toString(), Password.getText().toString());
            }

            private void validate(String userUsername, String userPassword) {
                if ((userUsername.equals("Manognya")) && (userPassword.equals("mano1234"))) {
                    String message;
                    message = "Technical consultant";
                    Intent intent = new Intent(login.this, SecondActivity.class);
                    intent.putExtra("user", Username.getText().toString());
                    intent.putExtra("desig", message.toString());
                    startActivity(intent);

                }else if ((userUsername.equals("Nikhil")) && (userPassword.equals("nikhil1234"))) {
                        String message;
                        message ="Web Developer";
                    Intent intent = new Intent(login.this, SecondActivity.class);
                    intent.putExtra("user",Username.getText().toString());
                    intent.putExtra("desig",message.toString());

                    startActivity(intent);
                } else if ((userUsername.equals("Aswini")) && (userPassword.equals("aswini1234"))) {
                    String message;
                   message ="General Manager";
                    Intent intent = new Intent(login.this, SecondActivity.class);
                    intent.putExtra("user",Username.getText().toString());
                    intent.putExtra("desig",message.toString());
                    startActivity(intent);

                } else if ((userUsername.equals("Dileep")) && (userPassword.equals("dileep1234"))) {
                    String message;
                   message ="Software Developer";
                    Intent intent = new Intent(login.this, SecondActivity.class);
                    intent.putExtra("user",Username.getText().toString());
                    intent.putExtra("desig",message.toString());

                    startActivity(intent);

                } else {
                    counter--;
                    Info.setText("Number of attempts remaining:" + String.valueOf(counter));
                    if (counter == 0) {
                        login.setEnabled(false);

                    }
                }
            }


        });
    }}