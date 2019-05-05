//package com.raf.lat3_akb11_10116469;;
//
//import android.app.Dialog;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.ImageButton;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//
//public class AboutActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_about);
//        Button btShow = (Button) findViewById(R.id.bt_showdialog);
//        btShow.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                final Dialog dialog = new Dialog(AboutActivity.this);
//                dialog.setContentView(R.layout.activity_custom_dialog);
//                dialog.setTitle("Huehue");
//
//                /**
//                 * Mengeset komponen dari custom dialog
//                 */
//
//                Button dialogButton = (Button) dialog.findViewById(R.id.bt_ok);
//                /**
//                 * Jika tombol diklik, tutup dialog
//                 */
//                dialogButton.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        dialog.dismiss();
//                    }
//                });
//
//                dialog.show();
//            }
//        });
//    }
//}
