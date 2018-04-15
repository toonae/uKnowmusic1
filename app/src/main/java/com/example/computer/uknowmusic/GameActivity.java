package com.example.computer.uknowmusic;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collections;

public class GameActivity extends AppCompatActivity {

    //Explicit
    Button btn1,btn2,btn3,btn4;
    ImageView questionImageView;
    ImageButton volumnImageButton;
    MediaPlayer mediaPlayer;//สำหรับเล่นเสียง
    int questionCount = 4; //ตัวแปรเก็บจำนวนข้อคำถาม
    ArrayList<Integer> qID = new ArrayList<Integer>();//ตัวแปร qId เป็นตัวแปรชนิดอะเรย์แบบสุ่มคำถาม
    String answer;
    int score = 0;
    String getNameString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        //Initial view ผูกเอริเม้นบนตัวแปร
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        questionImageView = findViewById(R.id.imvQuestion);
        volumnImageButton = findViewById(R.id.imbVolumn);

        //แสดงค่าถ่ม
        for (int i=1; i<=questionCount; i++) {
            qID.add(i);
        }
        Collections.shuffle(qID);//กำหนดให้คำถามเป็นแบบสุ่ม
        setQuestion(qID.remove(0));
    }//end onCreate Method

    private void setQuestion(int qID ) { //ใน method ทำหน้าที่กำหนดข้อคำถามและเฉลยในแต่ละข้อ

        if (qID ==1){
            answer = "ทิ้งไว้ในใจ";
            questionImageView.setImageResource(R.drawable.bigass);
            mediaPlayer = MediaPlayer.create(this, R.raw.cutbigass);

            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการเรนด้อมช้อย
            choice.add("ทิ้งไว้ในใจ");
            choice.add("พรหมลิขิต");
            choice.add("ก่อนตาย");
            choice.add("ไม่เดียงสา");
            Collections.shuffle(choice);//กำหนดเรนด้อมช้อย

            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

        }

        if (qID ==2){
            answer = "ความอ่อนแอ";
            questionImageView.setImageResource(R.drawable.body);
            mediaPlayer = MediaPlayer.create(this, R.raw.cutboy);

            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการเรนด้อมช้อย
            choice.add("ความอ่อนแอ");
            choice.add("พื้นที่ทับซ้อน");
            choice.add("เธอเปลี่ยนไป");
            choice.add("การเปลี่ยนแปลง");
            Collections.shuffle(choice);//กำหนดเรนด้อมช้อย

            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

        }


        if (qID ==3){
            answer = "คู่ชีวิต";
            questionImageView.setImageResource(R.drawable.cocktail);
            mediaPlayer = MediaPlayer.create(this, R.raw.cutcocktail);

            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการเรนด้อมช้อย
            choice.add("คู่ชีวิต");
            choice.add("เธอ");
            choice.add("คุกเข่า");
            choice.add("โปรดเถิดรัก");
            Collections.shuffle(choice);//กำหนดเรนด้อมช้อย

            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

        }

        if (qID ==4){
            answer = "เรื่องที่ขอ";
            questionImageView.setImageResource(R.drawable.lula);
            mediaPlayer = MediaPlayer.create(this, R.raw.cutlula);

            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการเรนด้อมช้อย
            choice.add("เรื่องที่ขอ");
            choice.add("ไม่มีอะไรที่เป็นไปไม่ได้");
            choice.add("เรื่องระหว่างเรา");
            choice.add("ความหวาน");
            Collections.shuffle(choice);//กำหนดเรนด้อมช้อย

            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

        }




    }// end setquestion Method



    public  void playSound(View view) {  //ชนิดview ตัวแปรview
        mediaPlayer.start();
    }//end playSound Method




}// end Class