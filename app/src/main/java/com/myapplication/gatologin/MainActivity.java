package com.myapplication.gatologin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.myapplication.gatologin.database.Instance;
import com.myapplication.gatologin.database.Table;
import com.myapplication.gatologin.model.PersonalInformation;
import com.myapplication.gatologin.util.Field;

public class MainActivity extends AppCompatActivity {

    private EditText et_fname;
    private EditText et_lname;
    private EditText et_mname;
    private EditText et_date;
    private EditText et_username;
    private EditText et_password;
    private EditText et_retypepassword;

    private Button btn_register;
    private Instance instance;
    private SQLiteDatabase sql;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        instance = new Instance(this);
        sql = instance.getWritableDatabase();

        et_fname = findViewById(R.id.et_firstname);
        et_lname = findViewById(R.id.et_lastname);
        et_mname = findViewById(R.id.et_middlename);
        et_date = findViewById(R.id.et_birthdate);
        et_username = findViewById(R.id.et_username);
        et_password = findViewById(R.id.et_password);
        et_retypepassword = findViewById(R.id.et_retypePass);

        btn_register = findViewById(R.id.btn_register);
        btn_register.setOnClickListener(new RegisterListener());
    }

    private class RegisterListener implements View.OnClickListener{



        @Override
        public void onClick(View view) {
            PersonalInformation pInfo = new PersonalInformation();
            pInfo.setStr_fname(et_fname.getText().toString());
            pInfo.setStr_mname(et_mname.getText().toString());
            pInfo.setStr_lname(et_lname.getText().toString());
            pInfo.setDt_birthdate(et_date.getText().toString());
            pInfo.setStr_username(et_username.getText().toString());
            pInfo.setStr_password(et_password.getText().toString());
            pInfo.setStr_retypepassword(et_retypepassword.getText().toString());

            String field[] = {
                    pInfo.getStr_fname(),
                    pInfo.getStr_mname(),
                    pInfo.getStr_lname(),
                    pInfo.getDt_birthdate(),
                    pInfo.getStr_username(),
                    pInfo.getStr_password(),
                    pInfo.getStr_retypepassword()
            };

            if(Field.CheckFild(field)) {
                Toast.makeText(MainActivity.this, "Enter all required information", Toast.LENGTH_SHORT).show();
            }else{
                SaveInfo(pInfo);
            }
        }

        private void SaveInfo(PersonalInformation info){
            ContentValues cv = new ContentValues();

            cv.put(info.clm_firstname, info.getStr_fname());
            cv.put(info.clm_middlename, info.getStr_mname());
            cv.put(info.clm_lastname, info.getStr_lname());
            cv.put(info.clm_birthdate, info.getDt_birthdate());
            cv.put(info.clm_username, info.getStr_username());
            cv.put(info.clm_password, info.getStr_password());

            sql.insert(Table.TBL_USERINFO, null, cv);
        }
    }
}