package com.example.smartvote;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CheckActivity extends AppCompatActivity {

    private int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);

        Button checkButton = findViewById(R.id.check_button);
        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText numberText = findViewById(R.id.number_text);
                int countCharacter = numberText.length ( );

                String id = numberText.toString();
                String msg = null;
                if (countCharacter <13 || countCharacter >13) {
                    Toast.makeText(
                            CheckActivity.this,
                            "กรุณากรอกหมายเลขบัตรประชาชน 13 หลัก",
                            Toast.LENGTH_LONG
                    ).show();
                }
                else if(countCharacter == 13){
                    if(id.equals("1111111111111")){
                        msg = "คุณเป็นผู้มีสิทธิเลือกตั้ง";
                    }
                    else if(id.equals("2222222222222")){
                        msg = "คุณเป็นผู้มีสิทธิเลือกตั้ง";
                    }
                    else{
                        msg = "คุณไม่มีสิทธิเลือกตั้ง";
                    }
                    new AlertDialog.Builder(CheckActivity.this)
                            .setTitle("ผลการตรวจสอบสิทธิ์เลือกตั้ง")
                            .setMessage(msg)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    //todo: โค้ดที่ให้ทำ เมื่อ user คลิก OK ในไดอะล็อก
                                }
                            })
                            .show();
                }


            }

        });
    }
}
