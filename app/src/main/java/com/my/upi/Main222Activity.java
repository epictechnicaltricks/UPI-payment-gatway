package com.my.upi;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;


 public class Main222Activity extends AppCompatActivity {
    EditText amount, note, name, upivirtualid;
    Button send,send_paytm,bharat_pay;
    String TAG ="main";
    final int UPI_PAYMENT = 0;


     private Toolbar _toolbar;
     private AppBarLayout _app_bar;
     private CoordinatorLayout _coordinator;

     private LinearLayout linear1;
     private TextView textview1;
     private LinearLayout linear2;
     private TextInputLayout textinputlayout1;
     private TextInputLayout textinputlayout2;
     private TextInputLayout textinputlayout3;
     private TextInputLayout textinputlayout4;

     private ImageView imageview1;

     private EditText upi_id;
     private EditText amount_et;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);










        send = (Button) findViewById(R.id.phonepay);
        amount = (EditText)findViewById(R.id.amount_et);
        note = (EditText)findViewById(R.id.note);
        name = (EditText) findViewById(R.id.name);
        upivirtualid =(EditText) findViewById(R.id.upi_id);



        _app_bar = (AppBarLayout) findViewById(R.id._app_bar);
        _coordinator = (CoordinatorLayout) findViewById(R.id._coordinator);
        _toolbar = (Toolbar) findViewById(R.id._toolbar);
        setSupportActionBar(_toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        _toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                onBackPressed();
            }
        });
        linear1 = (LinearLayout) findViewById(R.id.linear1);
        textview1 = (TextView) findViewById(R.id.textview1);
        linear2 = (LinearLayout) findViewById(R.id.linear2);
        textinputlayout1 = (TextInputLayout) findViewById(R.id.textinputlayout1);
        textinputlayout2 = (TextInputLayout) findViewById(R.id.textinputlayout2);
        textinputlayout3 = (TextInputLayout) findViewById(R.id.textinputlayout3);
        textinputlayout4 = (TextInputLayout) findViewById(R.id.textinputlayout4);
        send = (MaterialButton) findViewById(R.id.phonepay);
        send_paytm = findViewById(R.id.paytm);
        bharat_pay = findViewById(R.id.bharat_pay);
        imageview1 = (ImageView) findViewById(R.id.imageview1);
        name = (EditText) findViewById(R.id.name);
        upi_id = (EditText) findViewById(R.id.upi_id);
        amount_et = (EditText) findViewById(R.id.amount_et);
        note = (EditText) findViewById(R.id.note);


///////////////////////////////////////////////
//
//        {
//            android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
//            int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
//            SketchUi.setColor(0xFFFFFFFF);
//            linear1.setElevation(d*5);
//            android.graphics.drawable.RippleDrawable SketchUiRD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0xFFE0E0E0}), SketchUi, null);
//            linear1.setBackground(SketchUiRD);
//            linear1.setClickable(true);
//        }
//        {
//            android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
//            int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
//            SketchUi.setColor(0xFFFFFFFF);
//            SketchUi.setCornerRadius(d*20);
//            SketchUi.setStroke(d*1,0xFFBDBDBD);
//            linear2.setElevation(d*5);
//            android.graphics.drawable.RippleDrawable SketchUiRD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0xFFE0E0E0}), SketchUi, null);
//            linear2.setBackground(SketchUiRD);
//            linear2.setClickable(true);
//        }
//        textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/adddd.ttf"), Typeface.BOLD);
//


/////////////////////////////////////////////


send_paytm.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

       Toast.makeText(Main222Activity.this, "Paytm", Toast.LENGTH_SHORT).show();
         Intent upiPayIntent2 = new Intent(Intent.ACTION_VIEW);
        upiPayIntent2.setData(Uri.parse("upi://pay?pa=paytmqr281005050101kjx79s9co8qa@paytm&pn=Paytm Merchant&mc=5499&mode=02&am=2&orgid=000000&paytmqr=281005050101KJX79S9CO8QA&sign=MEUCIQD59WkHGss5aKUOA0zyvoAqNbed4bkIKEBOdtgcZk/B2gIgDnG5jAl6Pj84tr6nknIoslPPw794GpoKr80mTqjHH2Q="));
//&am=1
        startActivityForResult(upiPayIntent2, UPI_PAYMENT);


    }
});


        bharat_pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Main222Activity.this, "Bharat Pay", Toast.LENGTH_SHORT).show();
                Intent upiPayIntent2 = new Intent(Intent.ACTION_VIEW);
                upiPayIntent2.setData(Uri.parse("upi://pay?pa=BHARATPE09895466967@yesbankltd&pn=VIJAY SHARMA&cu=INR&am=1&bpsign=c0F0KzQrY0xvaEorcEhGemREckMvS1VsQXFoNjlqSnVkbzk4cm15cHlGbz0="));
//&am=1
                startActivityForResult(upiPayIntent2, UPI_PAYMENT);


            }
        });









        send.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("QueryPermissionsNeeded")
            @Override
            public void onClick(View view) {
//                //Getting the values from the EditTexts
//                if (TextUtils.isEmpty(name.getText().toString().trim())){
//                    Toast.makeText(getApplicationContext()," Name is invalid", Toast.LENGTH_SHORT).show();
//
//
//                }else if (TextUtils.isEmpty(upivirtualid.getText().toString().trim())){
//                    Toast.makeText(getApplicationContext()," UPI ID is invalid", Toast.LENGTH_SHORT).show();
//
//                }else if (TextUtils.isEmpty(note.getText().toString().trim())){
//                    Toast.makeText(getApplicationContext()," Note is invalid", Toast.LENGTH_SHORT).show();
//
//                }else if (TextUtils.isEmpty(amount.getText().toString().trim())){
//                    Toast.makeText(getApplicationContext()," Amount is invalid", Toast.LENGTH_SHORT).show();
//                }else{

                Toast.makeText(Main222Activity.this, "Phone pay", Toast.LENGTH_SHORT).show();

                Intent upiPayIntent = new Intent(Intent.ACTION_VIEW);
                    upiPayIntent.setData(Uri.parse("upi://pay?mode=02&pa=Q02250494@ybl&purpose=00&am=1&mc=0000&pn=PhonePeMerchant&orgid=180001&sign=MEUCIDnhMrYjFpn59C7cjKT1FfIvvMxcJ4hz/4cTmBHHkIT7AiEA7yEiHItl5PEFMNiTjne1qSG4YGvOB6C9K/JxrU8SiW0="));

                    startActivityForResult(upiPayIntent, UPI_PAYMENT);

                   // startActivity(upiPayIntent, UPI_PAYMENT);

//                    // will always show a dialog to user to choose an app
//                    Intent chooser = Intent.createChooser(upiPayIntent, "Pay with");
//
//                    // check if intent resolves
//                    if(null != chooser.resolveActivity(getPackageManager())) {
//                        startActivityForResult(chooser, UPI_PAYMENT);
//                    } else {
//                        Toast.makeText(getApplicationContext(),"No UPI app found, please install one to continue",Toast.LENGTH_SHORT).show();
//                    }

                   //  payUsingUpi(name.getText().toString(), upivirtualid.getText().toString(),
                   //         note.getText().toString(), amount.getText().toString());

                }


//            }
    });
    }



   ///  upi://pay?mode=02&pa=Q02250494@ybl&purpose=00&mc=0000&pn=PhonePeMerchant&orgid=180001&sign=MEUCIDnhMrYjFpn59C7cjKT1FfIvvMxcJ4hz/4cTmBHHkIT7AiEA7yEiHItl5PEFMNiTjne1qSG4YGvOB6C9K/JxrU8SiW0=


         void payUsingUpi(  String name,String upiId, String note, String amount) {
         Log.e("main ", "name "+name +"--up--"+upiId+"--"+ note+"--"+amount);
         Uri uri = Uri.parse("upi://pay").buildUpon()
                 .appendQueryParameter("pa", upiId)
                 .appendQueryParameter("pn", "PhonePeMerchant")

                 //.appendQueryParameter("tid", "02125412")
                 //.appendQueryParameter("tr", "25584584")



             // mode=02
                 // &pa=Q02250494@ybl
             // &purpose=00
             // &mc=0000
             // &pn=PhonePeMerchant
             // &orgid=180001
             // &sign=







                 .appendQueryParameter("mode", "02")
                 .appendQueryParameter("purpose", "00")
                 .appendQueryParameter("mc", "0000")

                 .appendQueryParameter("orgid", "180001")
                 .appendQueryParameter("sign", "MEUCIDnhMrYjFpn59C7cjKT1FfIvvMxcJ4hz/4cTmBHHkIT7AiEA7yEiHItl5PEFMNiTjne1qSG4YGvOB6C9K/JxrU8SiW0=")

                 .appendQueryParameter("tn", note)
                 .appendQueryParameter("am", amount)
                 .appendQueryParameter("cu", "INR")
                 //.appendQueryParameter("refUrl", "blueapp")
                 .build();


         Intent upiPayIntent = new Intent(Intent.ACTION_VIEW);
         upiPayIntent.setData(uri);

         // will always show a dialog to user to choose an app
         Intent chooser = Intent.createChooser(upiPayIntent, "Pay with");

         // check if intent resolves
         if(null != chooser.resolveActivity(getPackageManager())) {
             startActivityForResult(chooser, UPI_PAYMENT);
         } else {
             Toast.makeText(getApplicationContext(),"No UPI app found, please install one to continue",Toast.LENGTH_SHORT).show();
         }

     }

     @Override
     protected void onActivityResult(int requestCode, int resultCode, Intent data) {
         super.onActivityResult(requestCode, resultCode, data);
         Log.e("main ", "response " + resultCode);
        /*
       E/main: response -1
       E/UPI: onActivityResult: txnId=AXI4a3428ee58654a938811812c72c0df45&responseCode=00&Status=SUCCESS&txnRef=922118921612
       E/UPIPAY: upiPaymentDataOperation: txnId=AXI4a3428ee58654a938811812c72c0df45&responseCode=00&Status=SUCCESS&txnRef=922118921612
       E/UPI: payment successfull: 922118921612
         */
         switch (requestCode) {
             case UPI_PAYMENT:
                 if ((RESULT_OK == resultCode) || (resultCode == 11)) {
                     if (data != null) {
                         String trxt = data.getStringExtra("response");
                         Log.e("UPI", "onActivityResult: " + trxt);
                         ArrayList<String> dataList = new ArrayList<>();
                         dataList.add(trxt);
                         upiPaymentDataOperation(dataList);
                     } else {
                         Log.e("UPI", "onActivityResult: " + "Return data is null");
                         ArrayList<String> dataList = new ArrayList<>();
                         dataList.add("nothing");
                         upiPaymentDataOperation(dataList);
                     }
                 } else {
                     //when user simply back without payment
                     Log.e("UPI", "onActivityResult: " + "Return data is null");
                     ArrayList<String> dataList = new ArrayList<>();
                     dataList.add("nothing");
                     upiPaymentDataOperation(dataList);
                 }
                 break;
         }
     }

     private void upiPaymentDataOperation(ArrayList<String> data) {
         if (isConnectionAvailable(getApplicationContext())) {
             String str = data.get(0);
             Log.e("UPIPAY", "upiPaymentDataOperation: " + str);
             String paymentCancel = "";
             if (str == null) str = "discard";
             String status = "";
             String approvalRefNo = "";
             String response[] = str.split("&");
             for (int i = 0; i < response.length; i++) {
                 String equalStr[] = response[i].split("=");
                 if (equalStr.length >= 2) {
                     if (equalStr[0].toLowerCase().equals("Status".toLowerCase())) {
                         status = equalStr[1].toLowerCase();
                     } else if (equalStr[0].toLowerCase().equals("ApprovalRefNo".toLowerCase()) || equalStr[0].toLowerCase().equals("txnRef".toLowerCase())) {
                         approvalRefNo = equalStr[1];
                     }
                 } else {
                     paymentCancel = "Payment cancelled by user.";
                 }
             }
             if (status.equals("success")) {
                 //Code to handle successful transaction here.
                 Toast.makeText(getApplicationContext(), "Transaction successful.", Toast.LENGTH_SHORT).show();
                 Log.e("UPI", "payment successfull: "+approvalRefNo);
             }
             else if("Payment cancelled by user.".equals(paymentCancel)) {
                 Toast.makeText(getApplicationContext(), "Payment cancelled by user.", Toast.LENGTH_SHORT).show();
                 Log.e("UPI", "Cancelled by user: "+approvalRefNo);

             }
             else {
                 Toast.makeText(getApplicationContext(), "Transaction failed.Please try again", Toast.LENGTH_SHORT).show();
                 Log.e("UPI", "failed payment: "+approvalRefNo);

             }
         } else {
             Log.e("UPI", "Internet issue: ");

             Toast.makeText(getApplicationContext(), "Internet connection is not available. Please check and try again", Toast.LENGTH_SHORT).show();
         }
     }

     public static boolean isConnectionAvailable(Context context) {
         ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
         if (connectivityManager != null) {
             NetworkInfo netInfo = connectivityManager.getActiveNetworkInfo();
             if (netInfo != null && netInfo.isConnected()
                     && netInfo.isConnectedOrConnecting()
                     && netInfo.isAvailable()) {
                 return true;
             }
         }
         return false;
     }

 }