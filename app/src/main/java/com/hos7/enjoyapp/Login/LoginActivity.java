package com.hos7.enjoyapp.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.hos7.enjoyapp.MainActivity;
import com.hos7.enjoyapp.R;

public class LoginActivity extends AppCompatActivity {
TextView signup;
Button login_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        signup=findViewById(R.id.signup);
        login_button=findViewById(R.id.login_button);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),RegisterActivity.class);
                startActivity(intent);
            }
        });

        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSubmitDialog();
            }
        });
    }

    private void showSubmitDialog()
    {
        final Dialog dialog=new Dialog(LoginActivity.this);
        dialog.setContentView(R.layout.otp_popup);
        dialog.setCancelable(false);
        dialog.show();


        Button okGotIt=(Button)dialog.findViewById(R.id.done);

        okGotIt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();

                sharepopup();
              /*  Intent intent=new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);*/
                //dialog.dismiss();
               // finish();
            }
        });



    }

    private void sharepopup() {
        final Dialog dialog=new Dialog(LoginActivity.this);
        dialog.setContentView(R.layout.sharepopup);
        dialog.setCancelable(false);
        dialog.show();


        Button okGotIt=(Button)dialog.findViewById(R.id.done);
        TextView cancel=dialog.findViewById(R.id.cancel);

        okGotIt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();


                socialpopup();
              /*  Intent intent=new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);*/

            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();

            }
        });
    }

    private void socialpopup() {
        final Dialog dialog=new Dialog(LoginActivity.this);
        dialog.setContentView(R.layout.socialpopup);
        dialog.setCancelable(false);
        dialog.show();


        Button okGotIt=(Button)dialog.findViewById(R.id.done);
        TextView cancel=dialog.findViewById(R.id.cancel);

        okGotIt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();



                Intent intent=new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
                finish();

            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();

            }
        });
    }
}