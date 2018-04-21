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

public class game1Activity extends AppCompatActivity {

    //Explicit
    Button btn5, btn6, btn7, btn8;
    ImageView questionImageView;
    ImageButton volumnImageButton;
    MediaPlayer mediaPlayer;//สำหรับเล่นเสียง
    int questionCount = 30; //ตัวแปรเก็บจำนวนข้อคำถาม
    ArrayList<Integer> qID = new ArrayList<Integer>();//ตัวแปร qId เป็นตัวแปรชนิดอะเรย์แบบสุ่มคำถาม
    String answer;
    int score = 0;
    String getNameString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        //Initial view ผูกเอริเม้นบนตัวแปร
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
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

        if (qID == 21) {
            answer = "อดีตเคยพัง";
            questionImageView.setImageResource(R.drawable.arm);
            mediaPlayer = MediaPlayer.create(this, R.raw.cutarm);
            mediaPlayer.start();


            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการเรนด้อมช้อย
            choice.add("อดีตเคยพัง");
            choice.add("ไปต่อหรือพอส่ำนี่");
            choice.add("ฟ้าวถื่ม");
            choice.add("บ่แม่นของเล่น");
            Collections.shuffle(choice);//กำหนดเรนด้อมช้อย

            btn5.setText(choice.remove(0));
            btn6.setText(choice.remove(0));
            btn7.setText(choice.remove(0));
            btn8.setText(choice.remove(0));

        }

        if (qID == 22) {
            answer = "ฝากฟ้า";
            questionImageView.setImageResource(R.drawable.baovee);
            mediaPlayer = MediaPlayer.create(this, R.raw.cutbaovee);
            mediaPlayer.start();

            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการเรนด้อมช้อย
            choice.add("ฝากฟ้า");
            choice.add("ไม่มีประโยชน์");
            choice.add("ห่วงหาย");
            choice.add("ขอนไม้กับเรือ");
            Collections.shuffle(choice);//กำหนดเรนด้อมช้อย

            btn5.setText(choice.remove(0));
            btn6.setText(choice.remove(0));
            btn7.setText(choice.remove(0));
            btn8.setText(choice.remove(0));

        }


        if (qID == 23) {
            answer = "กอดครั้งสุดท้าย";
            questionImageView.setImageResource(R.drawable.ble);
            mediaPlayer = MediaPlayer.create(this, R.raw.cutble);
            mediaPlayer.start();


            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการเรนด้อมช้อย
            choice.add("กอดครั้งสุดท้าย");
            choice.add("อ้ายมีเหตุผล");
            choice.add("ให้น้องไปสา");
            choice.add("สื่อรักออนไลน์");
            Collections.shuffle(choice);//กำหนดเรนด้อมช้อย

            btn5.setText(choice.remove(0));
            btn6.setText(choice.remove(0));
            btn7.setText(choice.remove(0));
            btn8.setText(choice.remove(0));

        }

        if (qID == 24) {
            answer = "คิดถึงแล้วหล่าว";
            questionImageView.setImageResource(R.drawable.jira);
            mediaPlayer = MediaPlayer.create(this, R.raw.cutjira);
            mediaPlayer.start();


            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการเรนด้อมช้อย
            choice.add("คิดถึงแล้วหล่าว");
            choice.add("สาวใต้ลืมถิ่น");
            choice.add("ดาราผ้าถุง");
            choice.add("คนที่บ้านไม่สอน");
            Collections.shuffle(choice);//กำหนดเรนด้อมช้อย

            btn5.setText(choice.remove(0));
            btn6.setText(choice.remove(0));
            btn7.setText(choice.remove(0));
            btn8.setText(choice.remove(0));

        }

        if (qID == 25) {
            answer = "คนมีประวัติ";
            questionImageView.setImageResource(R.drawable.kai);
            mediaPlayer = MediaPlayer.create(this, R.raw.cutkai);
            mediaPlayer.start();


            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการเรนด้อมช้อย
            choice.add("คนมีประวัติ");
            choice.add("แรงใจพี่หลวง");
            choice.add("ขวัญใจพี่หลวง");
            choice.add("ขอบคุณที่รักกัน");
            Collections.shuffle(choice);//กำหนดเรนด้อมช้อย

            btn5.setText(choice.remove(0));
            btn6.setText(choice.remove(0));
            btn7.setText(choice.remove(0));
            btn8.setText(choice.remove(0));

        }

        if (qID == 26) {
            answer = "ซางว่า";
            questionImageView.setImageResource(R.drawable.kik);
            mediaPlayer = MediaPlayer.create(this, R.raw.cutkik);
            mediaPlayer.start();


            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการเรนด้อมช้อย
            choice.add("ซางว่า");
            choice.add("รั้ง");
            choice.add("หน่าลา");
            choice.add("เคยฮัก");
            Collections.shuffle(choice);//กำหนดเรนด้อมช้อย

            btn5.setText(choice.remove(0));
            btn6.setText(choice.remove(0));
            btn7.setText(choice.remove(0));
            btn8.setText(choice.remove(0));

        }

        if (qID == 27) {
            answer = "กอดจูบลูบคลำ";
            questionImageView.setImageResource(R.drawable.l);
            mediaPlayer = MediaPlayer.create(this, R.raw.cutl);
            mediaPlayer.start();


            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการเรนด้อมช้อย
            choice.add("กอดจูบลูบคลำ");
            choice.add("ข้างหลัง");
            choice.add("7นาที");
            choice.add("เสร็จแล้ว");
            Collections.shuffle(choice);//กำหนดเรนด้อมช้อย

            btn5.setText(choice.remove(0));
            btn6.setText(choice.remove(0));
            btn7.setText(choice.remove(0));
            btn8.setText(choice.remove(0));

        }

        if (qID == 28) {
            answer = "หนอนผีเสื้อ";
            questionImageView.setImageResource(R.drawable.miter);
            mediaPlayer = MediaPlayer.create(this, R.raw.cutmiter);
            mediaPlayer.start();


            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการเรนด้อมช้อย
            choice.add("หนอนผีเสื้อ");
            choice.add("ขอแค่");
            choice.add("พบรักที่ปากน้ำโพ");
            choice.add("สัญญาก่อนนอน");
            Collections.shuffle(choice);//กำหนดเรนด้อมช้อย

            btn5.setText(choice.remove(0));
            btn6.setText(choice.remove(0));
            btn7.setText(choice.remove(0));
            btn8.setText(choice.remove(0));

        }

        if (qID == 29) {
            answer = "คำแพง";
            questionImageView.setImageResource(R.drawable.sec);
            mediaPlayer = MediaPlayer.create(this, R.raw.cutsac);
            mediaPlayer.start();


            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการเรนด้อมช้อย
            choice.add("คำแพง");
            choice.add("มาหยังตอนนี้");
            choice.add("บ่แม่นบ่ฮัก");
            choice.add("เหนียวแน่นหนึบ");
            Collections.shuffle(choice);//กำหนดเรนด้อมช้อย

            btn5.setText(choice.remove(0));
            btn6.setText(choice.remove(0));
            btn7.setText(choice.remove(0));
            btn8.setText(choice.remove(0));

        }

        if (qID == 30) {
            answer = "แผ่นดินไหวในใจอ้าย";
            questionImageView.setImageResource(R.drawable.ta);
            mediaPlayer = MediaPlayer.create(this, R.raw.cutta);
            mediaPlayer.start();


            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการเรนด้อมช้อย
            choice.add("แผ่นดินไหวในใจอ้าย");
            choice.add("รั้วของชาติ");
            choice.add("แพ้น้อค");
            choice.add("รอยเลื่อน");
            Collections.shuffle(choice);//กำหนดเรนด้อมช้อย

            btn5.setText(choice.remove(0));
            btn6.setText(choice.remove(0));
            btn7.setText(choice.remove(0));
            btn8.setText(choice.remove(0));

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