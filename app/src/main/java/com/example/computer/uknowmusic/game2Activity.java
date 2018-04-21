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

public class game2Activity extends AppCompatActivity {

    //Explicit
    Button btn9, btn10, btn11, btn12;
    ImageView questionImageView;
    ImageButton volumnImageButton;
    MediaPlayer mediaPlayer;//สำหรับเล่นเสียง
    int questionCount = 20; //ตัวแปรเก็บจำนวนข้อคำถาม
    ArrayList<Integer> qID = new ArrayList<Integer>();//ตัวแปร qId เป็นตัวแปรชนิดอะเรย์แบบสุ่มคำถาม
    String answer;
    int score = 0;
    String getNameString;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game2);

        //Initial view ผูกเอริเม้นบนตัวแปร
        btn9 = findViewById(R.id.btn9);
        btn10 = findViewById(R.id.btn10);
        btn11 = findViewById(R.id.btn11);
        btn12 = findViewById(R.id.btn12);
        questionImageView = findViewById(R.id.imvQuestion);
        volumnImageButton = findViewById(R.id.imbVolumn);

        //แสดงค่าถ่ม
        for (int i = 1; i <= questionCount; i++) {
            qID.add(i);
        }
        Collections.shuffle(qID);//กำหนดให้คำถามเป็นแบบสุ่ม
        setQuestion(qID.remove(0));
    }//end onCreate Method

    private void setQuestion(int qID) { //ใน method ทำหน้าที่กำหนดข้อคำถามและเฉลยในแต่ละข้อ

        if (qID == 11) {
            answer = "faded";
            questionImageView.setImageResource(R.drawable.alan);
            mediaPlayer = MediaPlayer.create(this, R.raw.cutalan);
            mediaPlayer.start();


            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการเรนด้อมช้อย
            choice.add("faded");
            choice.add("the spectre");
            choice.add("all falls down");
            choice.add("alone");
            Collections.shuffle(choice);//กำหนดเรนด้อมช้อย

            btn9.setText(choice.remove(0));
            btn10.setText(choice.remove(0));
            btn11.setText(choice.remove(0));
            btn12.setText(choice.remove(0));

        }

        if (qID == 12) {
            answer = "closer";
            questionImageView.setImageResource(R.drawable.chain);
            mediaPlayer = MediaPlayer.create(this, R.raw.cutchain);
            mediaPlayer.start();

            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการเรนด้อมช้อย
            choice.add("closer");
            choice.add("sick boy");
            choice.add("roses");
            choice.add("paris");
            Collections.shuffle(choice);//กำหนดเรนด้อมช้อย

            btn9.setText(choice.remove(0));
            btn10.setText(choice.remove(0));
            btn11.setText(choice.remove(0));
            btn12.setText(choice.remove(0));

        }


        if (qID == 13) {
            answer = "shape of you";
            questionImageView.setImageResource(R.drawable.eds);
            mediaPlayer = MediaPlayer.create(this, R.raw.cuteds);
            mediaPlayer.start();


            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการเรนด้อมช้อย
            choice.add("shape of you");
            choice.add("perfect");
            choice.add("photograph");
            choice.add("thinking out");
            Collections.shuffle(choice);//กำหนดเรนด้อมช้อย

            btn9.setText(choice.remove(0));
            btn10.setText(choice.remove(0));
            btn11.setText(choice.remove(0));
            btn12.setText(choice.remove(0));

        }

        if (qID == 14) {
            answer = "love me like you do";
            questionImageView.setImageResource(R.drawable.ellie);
            mediaPlayer = MediaPlayer.create(this, R.raw.cutellie);
            mediaPlayer.start();


            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการเรนด้อมช้อย
            choice.add("love me like you do");
            choice.add("burn");
            choice.add("beating heart");
            choice.add("still falling for you");
            Collections.shuffle(choice);//กำหนดเรนด้อมช้อย

            btn9.setText(choice.remove(0));
            btn10.setText(choice.remove(0));
            btn11.setText(choice.remove(0));
            btn12.setText(choice.remove(0));

        }

        if (qID == 15) {
            answer = "dangerous woman";
            questionImageView.setImageResource(R.drawable.grande);
            mediaPlayer = MediaPlayer.create(this, R.raw.cutgrande);
            mediaPlayer.start();


            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการเรนด้อมช้อย
            choice.add("dangerous woman");
            choice.add("problem");
            choice.add("side to side");
            choice.add("everyday");
            Collections.shuffle(choice);//กำหนดเรนด้อมช้อย

            btn9.setText(choice.remove(0));
            btn10.setText(choice.remove(0));
            btn11.setText(choice.remove(0));
            btn12.setText(choice.remove(0));

        }

        if (qID == 16) {
            answer = "baby";
            questionImageView.setImageResource(R.drawable.jus);
            mediaPlayer = MediaPlayer.create(this, R.raw.cutjus);
            mediaPlayer.start();


            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการเรนด้อมช้อย
            choice.add("baby");
            choice.add("love yourself");
            choice.add("sorry");
            choice.add("company");
            Collections.shuffle(choice);//กำหนดเรนด้อมช้อย

            btn9.setText(choice.remove(0));
            btn10.setText(choice.remove(0));
            btn11.setText(choice.remove(0));
            btn12.setText(choice.remove(0));

        }

        if (qID == 17) {
            answer = "blank space";
            questionImageView.setImageResource(R.drawable.lor);
            mediaPlayer = MediaPlayer.create(this, R.raw.cutlor);
            mediaPlayer.start();


            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการเรนด้อมช้อย
            choice.add("blank space");
            choice.add("back to december");
            choice.add("shake it off");
            choice.add("bad blood");
            Collections.shuffle(choice);//กำหนดเรนด้อมช้อย

            btn9.setText(choice.remove(0));
            btn10.setText(choice.remove(0));
            btn11.setText(choice.remove(0));
            btn12.setText(choice.remove(0));

        }

        if (qID == 18) {
            answer = "slow down";
            questionImageView.setImageResource(R.drawable.sel);
            mediaPlayer = MediaPlayer.create(this, R.raw.cutselena);
            mediaPlayer.start();


            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการเรนด้อมช้อย
            choice.add("slow down");
            choice.add("hands to myself");
            choice.add("wolves");
            choice.add("same old love");
            Collections.shuffle(choice);//กำหนดเรนด้อมช้อย

            btn9.setText(choice.remove(0));
            btn10.setText(choice.remove(0));
            btn11.setText(choice.remove(0));
            btn12.setText(choice.remove(0));

        }

        if (qID == 19) {
            answer = "a thousand years";
            questionImageView.setImageResource(R.drawable.tina);
            mediaPlayer = MediaPlayer.create(this, R.raw.cuttina);
            mediaPlayer.start();


            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการเรนด้อมช้อย
            choice.add("a thousand years");
            choice.add("human");
            choice.add("jar of heart");
            choice.add("arms");
            Collections.shuffle(choice);//กำหนดเรนด้อมช้อย

            btn9.setText(choice.remove(0));
            btn10.setText(choice.remove(0));
            btn11.setText(choice.remove(0));
            btn12.setText(choice.remove(0));

        }

        if (qID == 20) {
            answer = "the hills";
            questionImageView.setImageResource(R.drawable.week);
            mediaPlayer = MediaPlayer.create(this, R.raw.cutweek);
            mediaPlayer.start();


            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการเรนด้อมช้อย
            choice.add("the hills");
            choice.add("star boy");
            choice.add("i feel it coming");
            choice.add("call out my Name");
            Collections.shuffle(choice);//กำหนดเรนด้อมช้อย

            btn9.setText(choice.remove(0));
            btn10.setText(choice.remove(0));
            btn11.setText(choice.remove(0));
            btn12.setText(choice.remove(0));

        }
    }// end setquestion Method

    public void choiceAns(View view) { //ตรวจคำตอบว่า user ตอบถูกไหม

        Button button = (Button) view;
        String buttonString = button.getText().toString();
        if (buttonString.equals(answer)) {
            score++;
        }

        if (qID.isEmpty()) { //ถ้าทำครบทุกข้อ นั่นคือ qID เป็นค่าว่าง
            getNameString = getIntent().getStringExtra("Name");
            dialogboxScore(getNameString);// เรียก method dialogboxScore() สำหรับแสดงคะแนน
        } else {//ถ้ายังทำไม่ครบทุกข้อ
            setQuestion(qID.remove(0));// เรียก medthod setQuestion() สำหรับแสดงคำถามถัดไป
        }

    }// end choiceAns Method

    private void dialogboxScore(String name) {//method สำหรับแสดงคะแนน

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("สรุปคะแนน");
        builder.setMessage(name + "ได้คะแนน " + score + " คะแนน")
                .setCancelable(false)
                .setPositiveButton("ออกจากเกม", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();//ปิดแอคติวิตี้เพื่ออกจากแอพ
                    }
                })
                .setNegativeButton("เล่นอีกครั้ง", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = getIntent();
                        finish();
                        startActivity(intent);
                    }
                });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }//end dialogboxScore Method

    public void playSound(View view) {  //ชนิดview ตัวแปรview
        mediaPlayer.start();
    }//end playSound Method



}// end Class


