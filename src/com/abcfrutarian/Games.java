package com.abcfrutarian;

import java.util.Locale;
import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeech.OnInitListener;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class Games extends Activity implements OnClickListener, OnInitListener{
	String[] judul = {"Apple","Banana","Cherry","Durian","Elderberry","Fig","Guava","Huckleberry","Itapalm","Jackfruit","Kiwi","Lemon","Mango","Nectarine","Orange","Pineapple","Quince","Raspberry","Strawberry","Tomato","Uglifruit","Vanilla","Watermelon","Xigua","Youngberry","Zucchini"};
	TextToSpeech tts;
	ImageView p1,p2,p3,p4;
	TextView sc;
	RatingBar rb;
	int rat = 3;
	Button b_klik;
	int benar;
	int a, b, c, d;
	public void gambar(int cek, int pil) {
		String image = judul[cek];
		if (image.equals("Apple"))
		{
			switch(pil)
			{
			case 1:
				p1.setBackgroundResource(R.drawable.apple);
			break;
			case 2:
				p2.setBackgroundResource(R.drawable.apple);
			break;
			case 3:
				p3.setBackgroundResource(R.drawable.apple);
			break;
			case 4:
				p4.setBackgroundResource(R.drawable.apple);
			break;
			default:
				break;
			}
			
		}
		else if (image.equals("Banana"))
		{
			switch(pil)
			{
			case 1:
				p1.setBackgroundResource(R.drawable.banana);
			break;
			case 2:
				p2.setBackgroundResource(R.drawable.banana);
			break;
			case 3:
				p3.setBackgroundResource(R.drawable.banana);
			break;
			case 4:
				p4.setBackgroundResource(R.drawable.banana);
			break;
			default:
				break;
			}
		}
		else if (image.equals("Cherry"))
		{
			switch(pil)
			{
			case 1:
				p1.setBackgroundResource(R.drawable.cherry);
			break;
			case 2:
				p2.setBackgroundResource(R.drawable.cherry);
			break;
			case 3:
				p3.setBackgroundResource(R.drawable.cherry);
			break;
			case 4:
				p4.setBackgroundResource(R.drawable.cherry);
			break;
			default:
				break;
			}
		}
		else if (image.equals("Durian"))
		{
			switch(pil)
			{
			case 1:
				p1.setBackgroundResource(R.drawable.durian);
			break;
			case 2:
				p2.setBackgroundResource(R.drawable.durian);
			break;
			case 3:
				p3.setBackgroundResource(R.drawable.durian);
			break;
			case 4:
				p4.setBackgroundResource(R.drawable.durian);
			break;
			default:
				break;
			}
		}
		else if (image.equals("Elderberry"))
		{
			switch(pil)
			{
			case 1:
				p1.setBackgroundResource(R.drawable.elderberry);
			break;
			case 2:
				p2.setBackgroundResource(R.drawable.elderberry);
			break;
			case 3:
				p3.setBackgroundResource(R.drawable.elderberry);
			break;
			case 4:
				p4.setBackgroundResource(R.drawable.elderberry);
			break;
			default:
				break;
			}
		}
		else if (image.equals("Fig"))
		{
			switch(pil)
			{
			case 1:
				p1.setBackgroundResource(R.drawable.fig);
			break;
			case 2:
				p2.setBackgroundResource(R.drawable.fig);
			break;
			case 3:
				p3.setBackgroundResource(R.drawable.fig);
			break;
			case 4:
				p4.setBackgroundResource(R.drawable.fig);
			break;
			default:
				break;
			}
		}
		else if (image.equals("Guava"))
		{
			switch(pil)
			{
			case 1:
				p1.setBackgroundResource(R.drawable.guava);
			break;
			case 2:
				p2.setBackgroundResource(R.drawable.guava);
			break;
			case 3:
				p3.setBackgroundResource(R.drawable.guava);
			break;
			case 4:
				p4.setBackgroundResource(R.drawable.guava);
			break;
			default:
				break;
			}
		}
		else if (image.equals("Huckleberry"))
		{
			switch(pil)
			{
			case 1:
				p1.setBackgroundResource(R.drawable.huckleberry);
			break;
			case 2:
				p2.setBackgroundResource(R.drawable.huckleberry);
			break;
			case 3:
				p3.setBackgroundResource(R.drawable.huckleberry);
			break;
			case 4:
				p4.setBackgroundResource(R.drawable.huckleberry);
			break;
			default:
				break;
			}
		}
		else if (image.equals("Itapalm"))
		{
			switch(pil)
			{
			case 1:
				p1.setBackgroundResource(R.drawable.itapalm);
			break;
			case 2:
				p2.setBackgroundResource(R.drawable.itapalm);
			break;
			case 3:
				p3.setBackgroundResource(R.drawable.itapalm);
			break;
			case 4:
				p4.setBackgroundResource(R.drawable.itapalm);
			break;
			default:
				break;
			}
		}
		else if (image.equals("Jackfruit"))
		{
			switch(pil)
			{
			case 1:
				p1.setBackgroundResource(R.drawable.jackfruit);
			break;
			case 2:
				p2.setBackgroundResource(R.drawable.jackfruit);
			break;
			case 3:
				p3.setBackgroundResource(R.drawable.jackfruit);
			break;
			case 4:
				p4.setBackgroundResource(R.drawable.jackfruit);
			break;
			default:
				break;
			}
		}
		else if (image.equals("Kiwi"))
		{
			switch(pil)
			{
			case 1:
				p1.setBackgroundResource(R.drawable.kiwi);
			break;
			case 2:
				p2.setBackgroundResource(R.drawable.kiwi);
			break;
			case 3:
				p3.setBackgroundResource(R.drawable.kiwi);
			break;
			case 4:
				p4.setBackgroundResource(R.drawable.kiwi);
			break;
			default:
				break;
			}
		}
		else if (image.equals("Lemon"))
		{
			switch(pil)
			{
			case 1:
				p1.setBackgroundResource(R.drawable.lemon);
			break;
			case 2:
				p2.setBackgroundResource(R.drawable.lemon);
			break;
			case 3:
				p3.setBackgroundResource(R.drawable.lemon);
			break;
			case 4:
				p4.setBackgroundResource(R.drawable.lemon);
			break;
			default:
				break;
			}
		}
		else if (image.equals("Mango"))
		{
			switch(pil)
			{
			case 1:
				p1.setBackgroundResource(R.drawable.mango);
			break;
			case 2:
				p2.setBackgroundResource(R.drawable.mango);
			break;
			case 3:
				p3.setBackgroundResource(R.drawable.mango);
			break;
			case 4:
				p4.setBackgroundResource(R.drawable.mango);
			break;
			default:
				break;
			}
		}
		else if (image.equals("Nectarine"))
		{
			switch(pil)
			{
			case 1:
				p1.setBackgroundResource(R.drawable.nectarine);
			break;
			case 2:
				p2.setBackgroundResource(R.drawable.nectarine);
			break;
			case 3:
				p3.setBackgroundResource(R.drawable.nectarine);
			break;
			case 4:
				p4.setBackgroundResource(R.drawable.nectarine);
			break;
			default:
				break;
			}
		}
		else if (image.equals("Orange"))
		{
			switch(pil)
			{
			case 1:
				p1.setBackgroundResource(R.drawable.orange);
			break;
			case 2:
				p2.setBackgroundResource(R.drawable.orange);
			break;
			case 3:
				p3.setBackgroundResource(R.drawable.orange);
			break;
			case 4:
				p4.setBackgroundResource(R.drawable.orange);
			break;
			default:
				break;
			}
		}
		else if (image.equals("Pineapple"))
		{
			switch(pil)
			{
			case 1:
				p1.setBackgroundResource(R.drawable.pineapple);
			break;
			case 2:
				p2.setBackgroundResource(R.drawable.pineapple);
			break;
			case 3:
				p3.setBackgroundResource(R.drawable.pineapple);
			break;
			case 4:
				p4.setBackgroundResource(R.drawable.pineapple);
			break;
			default:
				break;
			}
		}
		else if (image.equals("Quince"))
		{
			switch(pil)
			{
			case 1:
				p1.setBackgroundResource(R.drawable.quince);
			break;
			case 2:
				p2.setBackgroundResource(R.drawable.quince);
			break;
			case 3:
				p3.setBackgroundResource(R.drawable.quince);
			break;
			case 4:
				p4.setBackgroundResource(R.drawable.quince);
			break;
			default:
				break;
			}
		}
		else if (image.equals("Raspberry"))
		{
			switch(pil)
			{
			case 1:
				p1.setBackgroundResource(R.drawable.raspberry);
			break;
			case 2:
				p2.setBackgroundResource(R.drawable.raspberry);
			break;
			case 3:
				p3.setBackgroundResource(R.drawable.raspberry);
			break;
			case 4:
				p4.setBackgroundResource(R.drawable.raspberry);
			break;
			default:
				break;
			}
		}
		else if (image.equals("Strawberry"))
		{
			switch(pil)
			{
			case 1:
				p1.setBackgroundResource(R.drawable.strawberry);
			break;
			case 2:
				p2.setBackgroundResource(R.drawable.strawberry);
			break;
			case 3:
				p3.setBackgroundResource(R.drawable.strawberry);
			break;
			case 4:
				p4.setBackgroundResource(R.drawable.strawberry);
			break;
			default:
				break;
			}
		}
		else if (image.equals("Tomato"))
		{
			switch(pil)
			{
			case 1:
				p1.setBackgroundResource(R.drawable.tomato);
			break;
			case 2:
				p2.setBackgroundResource(R.drawable.tomato);
			break;
			case 3:
				p3.setBackgroundResource(R.drawable.tomato);
			break;
			case 4:
				p4.setBackgroundResource(R.drawable.tomato);
			break;
			default:
				break;
			}
		}
		else if (image.equals("Uglifruit"))
		{
			switch(pil)
			{
			case 1:
				p1.setBackgroundResource(R.drawable.uglifruit);
			break;
			case 2:
				p2.setBackgroundResource(R.drawable.uglifruit);
			break;
			case 3:
				p3.setBackgroundResource(R.drawable.uglifruit);
			break;
			case 4:
				p4.setBackgroundResource(R.drawable.uglifruit);
			break;
			default:
				break;
			}
		}
		else if (image.equals("Vanilla"))
		{
			switch(pil)
			{
			case 1:
				p1.setBackgroundResource(R.drawable.vanilla);
			break;
			case 2:
				p2.setBackgroundResource(R.drawable.vanilla);
			break;
			case 3:
				p3.setBackgroundResource(R.drawable.vanilla);
			break;
			case 4:
				p4.setBackgroundResource(R.drawable.vanilla);
			break;
			default:
				break;
			}
		}
		else if (image.equals("Watermelon"))
		{
			switch(pil)
			{
			case 1:
				p1.setBackgroundResource(R.drawable.watermelon);
			break;
			case 2:
				p2.setBackgroundResource(R.drawable.watermelon);
			break;
			case 3:
				p3.setBackgroundResource(R.drawable.watermelon);
			break;
			case 4:
				p4.setBackgroundResource(R.drawable.watermelon);
			break;
			default:
				break;
			}
		}
		else if (image.equals("Xigua"))
		{
			switch(pil)
			{
			case 1:
				p1.setBackgroundResource(R.drawable.xigua);
			break;
			case 2:
				p2.setBackgroundResource(R.drawable.xigua);
			break;
			case 3:
				p3.setBackgroundResource(R.drawable.xigua);
			break;
			case 4:
				p4.setBackgroundResource(R.drawable.xigua);
			break;
			default:
				break;
			}
		}
		else if (image.equals("Youngberry"))
		{
			switch(pil)
			{
			case 1:
				p1.setBackgroundResource(R.drawable.youngberry);
			break;
			case 2:
				p2.setBackgroundResource(R.drawable.youngberry);
			break;
			case 3:
				p3.setBackgroundResource(R.drawable.youngberry);
			break;
			case 4:
				p4.setBackgroundResource(R.drawable.youngberry);
			break;
			default:
				break;
			}
		}
		else if (image.equals("Zucchini"))
		{
			switch(pil)
			{
			case 1:
				p1.setBackgroundResource(R.drawable.zucchini);
			break;
			case 2:
				p2.setBackgroundResource(R.drawable.zucchini);
			break;
			case 3:
				p3.setBackgroundResource(R.drawable.zucchini);
			break;
			case 4:
				p4.setBackgroundResource(R.drawable.zucchini);
			break;
			default:
				break;
			}
		}
		
	}
	
	public void tampil() {
		rb.setRating(3);
		rat = 3;
		b_klik.setEnabled(true);
		b_klik.setBackgroundResource(R.drawable.spech);
		Random rand_img = new Random();
		int r_img = rand_img.nextInt(25 - 0) + 0;
		benar = r_img;
		int r = rand_img.nextInt(4 - 1) + 1;
		if (r == 1)
		{
			gambar(r_img, 1);
			int x = 0;
			while (x < 1)
			{
				a = r_img;
				b = rand_img.nextInt(25 - 0) + 0;
				c = rand_img.nextInt(25 - 0) + 0;
				d = rand_img.nextInt(25 - 0) + 0;
			if (a == b || a == c || a == d || b == c || b == d || c == d )
			{
				x = 0;
			}
			else
			{
				gambar(b, 2);
				gambar(c, 3);
				gambar(d, 4);
				x++;
			}
			}
		}
		else if (r == 2) {
			gambar(r_img, 2);
			int x = 0;
			while (x < 1)
			{
				a = rand_img.nextInt(25 - 0) + 0;
				b = r_img;
				c = rand_img.nextInt(25 - 0) + 0;
				d = rand_img.nextInt(25 - 0) + 0;
			if (a == b || a == c || a == d || b == c || b == d || c == d )
			{
				x = 0;
			}
			else
			{
				gambar(a, 1);
				gambar(c, 3);
				gambar(d, 4);
				x++;
			}
			}
		}
		else if (r == 3) {
			gambar(r_img, 3);
			int x = 0;
			while (x < 1)
			{
				a = rand_img.nextInt(25 - 0) + 0;
				b = rand_img.nextInt(25 - 0) + 0;
				c = r_img;
				d = rand_img.nextInt(25 - 0) + 0;
			if (a == b || a == c || a == d || b == c || b == d || c == d )
			{
				x = 0;
			}
			else
			{
				gambar(a, 1);
				gambar(b, 2);
				gambar(d, 4);
				x++;
			}
			}
		}
		else if (r == 4) {
			gambar(r_img, 4);
			int x = 0;
			while (x < 1)
			{
				a = rand_img.nextInt(25 - 0) + 0;
				b = rand_img.nextInt(25 - 0) + 0;
				c = rand_img.nextInt(25 - 0) + 0;
				d = r_img;
			if (a == b || a == c || a == d || b == c || b == d || c == d )
			{
				x = 0;
			}
			else
			{
				gambar(a, 1);
				gambar(b, 2);
				gambar(c, 3);
				x++;
			}
			}
		}
	}
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.games);
		
		
		
		p1 = (ImageView) findViewById(R.id.pila);
		p2 = (ImageView) findViewById(R.id.pilb);
		p3 = (ImageView) findViewById(R.id.pilc);
		p4 = (ImageView) findViewById(R.id.pild);
		b_klik = (Button) findViewById(R.id.klik);
		sc = (TextView) findViewById(R.id.scor);
		rb = (RatingBar) findViewById(R.id.ratingBar1);
		sc.setText("0");
		tts = new TextToSpeech(this, this);
		tampil();
		b_klik.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				if (rat != 0)
				{
				rat = rat - 1;
				rb.setRating(rat);
				speakOut();
				}
				else
				{
					b_klik.setBackgroundResource(R.drawable.spechc);
					b_klik.setEnabled(false);
				}
				
			}
		});
		
		p1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(benar == a)
				{
					int scor = Integer.parseInt(sc.getText().toString());
					scor = scor + 1;
					sc.setText(String.valueOf(scor));
					tampil();
				}
				else
				{
					Intent i = new Intent(Games.this, Y_scor.class);
					i.putExtra("your", sc.getText().toString());
					startActivity(i);
					System.exit(0);
				}
				
			}
		});
p2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(benar == b)
				{
					int scor = Integer.parseInt(sc.getText().toString());
					scor = scor + 1;
					sc.setText(String.valueOf(scor));
					tampil();
				}
				else
				{
					Intent i = new Intent(Games.this, Y_scor.class);
					i.putExtra("your", sc.getText().toString());
					startActivity(i);
					System.exit(0);
				}
				
			}
		});
p3.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		if(benar == c)
		{
			int scor = Integer.parseInt(sc.getText().toString());
			scor = scor + 1;
			sc.setText(String.valueOf(scor));
			tampil();
		}
		else
		{
			Intent i = new Intent(Games.this, Y_scor.class);
			i.putExtra("your", sc.getText().toString());
			startActivity(i);
			System.exit(0);
		}
		
	}
});
p4.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		if(benar == d)
		{
			int scor = Integer.parseInt(sc.getText().toString());
			scor = scor + 1;
			sc.setText(String.valueOf(scor));
			tampil();
		}
		else
		{
			Intent i = new Intent(Games.this, Y_scor.class);
			i.putExtra("your", sc.getText().toString());
			startActivity(i);
			System.exit(0);
		}
		
	}
});
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

	        String text = judul[benar].toString();

	        tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
	    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

}
