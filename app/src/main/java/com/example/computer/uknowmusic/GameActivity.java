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
    Button btn1, btn2, btn3, btn4;
    ImageView questionImageView;
    ImageButton volumnImageButton;
    MediaPlayer mediaPlayer;//สำหรับเล่นเสียง
    int questionCount = 10; //ตัวแปรเก็บจำนวนข้อคำถาม
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
        for (int i = 1; i <= questionCount; i++) {
            qID.add(i);
        }
        Collections.shuffle(qID);//กำหนดให้คำถามเป็นแบบสุ่ม
        setQuestion(qID.remove(0));
    }//end onCreate Method

    private void setQuestion(int qID) { //ใน method ทำหน้าที่กำหนดข้อคำถามและเฉลยในแต่ละข้อ

        if (qID == 1) {
            answer = "ทิ้งไว้ในใจ";
            questionImageView.setImageResource(R.drawable.bigass);
            mediaPlayer = MediaPlayer.create(this, R.raw.cutbigass);
            mediaPlayer.start();


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

        if (qID == 2) {
            answer = "ความอ่อนแอ";
            questionImageView.setImageResource(R.drawable.boy);
            mediaPlayer = MediaPlayer.create(this, R.raw.cutboy);
            mediaPlayer.start();

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


        if (qID == 3) {
            answer = "คู่ชีวิต";
            questionImageView.setImageResource(R.drawable.cocktail);
            mediaPlayer = MediaPlayer.create(this, R.raw.cutcocktail);
            mediaPlayer.start();


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

        if (qID == 4) {
            answer = "เรื่องที่ขอ";
            questionImageView.setImageResource(R.drawable.lula);
            mediaPlayer = MediaPlayer.create(this, R.raw.cutlula);
            mediaPlayer.start();


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

        if (qID == 5) {
            answer = "ไม่บอกเธอ";
            questionImageView.setImageResource(R.drawable.badroom);
            mediaPlayer = MediaPlayer.create(this, R.raw.cutbadroom);
            mediaPlayer.start();


            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการเรนด้อมช้อย
            choice.add("ไม่บอกเธอ");
            choice.add("กอดไม่ได้");
            choice.add("ใครคนนั้น");
            choice.add("รักเธอเหลือเกิน");
            Collections.shuffle(choice);//กำหนดเรนด้อมช้อย

            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

        }

        if (qID == 6) {
            answer = "ภาพลวงตา";
            questionImageView.setImageResource(R.drawable.da);
            mediaPlayer = MediaPlayer.create(this, R.raw.cutda);
            mediaPlayer.start();


            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการเรนด้อมช้อย
            choice.add("ภาพลวงตา");
            choice.add("สิ่งสำคัญ");
            choice.add("อย่าทำให้ฟ้าผิดหวัง");
            choice.add("รักครั้งใหม่");
            Collections.shuffle(choice);//กำหนดเรนด้อมช้อย

            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

        }

        if (qID == 7) {
            answer = "กรรมตามสนอง";
            questionImageView.setImageResource(R.drawable.mild);
            mediaPlayer = MediaPlayer.create(this, R.raw.cutmild);
            mediaPlayer.start();


            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการเรนด้อมช้อย
            choice.add("กรรมตามสนอง");
            choice.add("หวานเย็น");
            choice.add("รักเราไม่เท่า");
            choice.add("เหนื่ยเกินไปหรือเปล่า");
            Collections.shuffle(choice);//กำหนดเรนด้อมช้อย

            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

        }

        if (qID == 8) {
    answer = "ใจกลางเมือง";
            questionImageView.setImageResource(R.drawable.labanoon);
    mediaPlayer = MediaPlayer.create(this, R.raw.cutlabanoon);
            mediaPlayer.start();


    ArrayList<String> choice = new ArrayList<String>(); //กำหนดการเรนด้อมช้อย
            choice.add("ใจกลางเมือง");
            choice.add("คำต้องห้าม");
            choice.add("เท่าเดิม");
            choice.add("คิดในใจ");
            Collections.shuffle(choice);//กำหนดเรนด้อมช้อย

            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

}

        if (qID == 9) {
            answer = "เหนื่อยไหมหัวใจ";
            questionImageView.setImageResource(R.drawable.retrospect);
            mediaPlayer = MediaPlayer.create(this, R.raw.cutretrospect);
            mediaPlayer.start();


            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการเรนด้อมช้อย
            choice.add("เหนื่อยไหมหัวใจ");
            choice.add("ปล่อยฉัน");
            choice.add("สุดที่รัก");
            choice.add("เหงายิ่งกว่าเหงา");
            Collections.shuffle(choice);//กำหนดเรนด้อมช้อย

            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

        }

        if (qID == 10) {
            answer = "ไกลแค่ไหนคือใกล้";
            questionImageView.setImageResource(R.drawable.gus);
            mediaPlayer = MediaPlayer.create(this, R.raw.cutgus);
            mediaPlayer.start();


            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการเรนด้อมช้อย
            choice.add("ไกลแค่ไหนคือใกล้");
            choice.add("พัง");
            choice.add("คนไม่จำเป็น");
            choice.add("คำถามซึ่งไร้คนตอบ");
            Collections.shuffle(choice);//กำหนดเรนด้อมช้อย

            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

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