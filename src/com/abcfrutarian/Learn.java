package com.abcfrutarian;

import java.util.Locale;

import android.app.Activity;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeech.OnInitListener;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Learn extends Activity implements OnClickListener, OnInitListener {
	TextView nama;
	ImageView img;
	int x = 0;
	Button b_next,b_prev,b_main,b_klik;
	TextToSpeech tts;
	
	public void tampil(int cek)
	{
		String[] judul = {"Apple","Banana","Cherry","Durian","Elderberry","Fig","Guava","Huckleberry","Itapalm","Jackfruit","Kiwi","Lemon","Mango","Nectarine","Orange","Pineapple","Quince","Raspberry","Strawberry","Tomato","Uglifruit","Vanilla","Watermelon","Xigua","Youngberry","Zucchini"};
		nama = (TextView) findViewById(R.id.Nama);
		img = (ImageView) findViewById(R.id.imageView1);
		nama.setText(judul[cek]);
		String image = judul[cek];
		if (image.equals("Apple"))
		{
			img.setBackgroundResource(R.drawable.apple);
		}
		else if (image.equals("Banana"))
		{
			img.setBackgroundResource(R.drawable.banana);
		}
		else if (image.equals("Cherry"))
		{
			img.setBackgroundResource(R.drawable.cherry);
		}
		else if (image.equals("Durian"))
		{
			img.setBackgroundResource(R.drawable.durian);
		}
		else if (image.equals("Elderberry"))
		{
			img.setBackgroundResource(R.drawable.elderberry);
		}
		else if (image.equals("Fig"))
		{
			img.setBackgroundResource(R.drawable.fig);
		}
		else if (image.equals("Guava"))
		{
			img.setBackgroundResource(R.drawable.guava);
		}
		else if (image.equals("Huckleberry"))
		{
			img.setBackgroundResource(R.drawable.huckleberry);
		}
		else if (image.equals("Itapalm"))
		{
			img.setBackgroundResource(R.drawable.itapalm);
		}
		else if (image.equals("Jackfruit"))
		{
			img.setBackgroundResource(R.drawable.jackfruit);
		}
		else if (image.equals("Kiwi"))
		{
			img.setBackgroundResource(R.drawable.kiwi);
		}
		else if (image.equals("Lemon"))
		{
			img.setBackgroundResource(R.drawable.lemon);
		}
		else if (image.equals("Mango"))
		{
			img.setBackgroundResource(R.drawable.mango);
		}
		else if (image.equals("Nectarine"))
		{
			img.setBackgroundResource(R.drawable.nectarine);
		}
		else if (image.equals("Orange"))
		{
			img.setBackgroundResource(R.drawable.orange);
		}
		else if (image.equals("Pineapple"))
		{
			img.setBackgroundResource(R.drawable.pineapple);
		}
		else if (image.equals("Quince"))
		{
			img.setBackgroundResource(R.drawable.quince);
		}
		else if (image.equals("Raspberry"))
		{
			img.setBackgroundResource(R.drawable.raspberry);
		}
		else if (image.equals("Strawberry"))
		{
			img.setBackgroundResource(R.drawable.strawberry);
		}
		else if (image.equals("Tomato"))
		{
			img.setBackgroundResource(R.drawable.tomato);
		}
		else if (image.equals("Uglifruit"))
		{
			img.setBackgroundResource(R.drawable.uglifruit);
		}
		else if (image.equals("Vanilla"))
		{
			img.setBackgroundResource(R.drawable.vanilla);
		}
		else if (image.equals("Watermelon"))
		{
			img.setBackgroundResource(R.drawable.watermelon);
		}
		else if (image.equals("Xigua"))
		{
			img.setBackgroundResource(R.drawable.xigua);
		}
		else if (image.equals("Youngberry"))
		{
			img.setBackgroundResource(R.drawable.youngberry);
		}
		else if (image.equals("Zucchini"))
		{
			img.setBackgroundResource(R.drawable.zucchini);
		}
		
		
		
		if(cek == 0)
		{
			b_prev.setVisibility(4);
		}
		else if (cek == 25)
		{
			b_next.setVisibility(4);
		}
		else
		{
			b_next.setVisibility(0);
			b_prev.setVisibility(0);
		}
		
	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.learn);
		b_next = (Button) findViewById(R.id.next);
		b_prev = (Button) findViewById(R.id.prev);
		b_main = (Button) findViewById(R.id.main);
		b_klik = (Button) findViewById(R.id.klik);
		tts = new TextToSpeech(this, this);
		
		b_klik.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				speakOut();
			}
		});
		
		
		
		
		b_main.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				System.exit(0);
				
			}
		});
		
		tampil(x);
		b_next.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				x++;
				tampil(x);
				
			}
		});
		b_prev.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				x--;
				tampil(x);
			}
		});
		
	}
	
	

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onInit(int status) {
		if (status == TextToSpeech.SUCCESS)
		{
			int result = tts.setLanguage(Locale.US);

            // tts.setPitch(5); // set pitch level

            // tts.setSpeechRate(2); // set speech speed rate

            if (result == TextToSpeech.LANG_MISSING_DATA
                    || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                Log.e("TTS", "Language is not supported");
            } else {
                b_klik.setEnabled(true);
            }
		}
		else {
            Log.e("TTS", "Initilization Failed");
        }
	}
	 private void speakOut() {

	        String text = nama.getText().toString();

	        tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
	    }
}
