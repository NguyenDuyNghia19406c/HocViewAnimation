package nguyenduynghia.com.hocviewanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnAlpha,btnScale,btnTranslate,btnRotate,btnThoat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addControls() {
        btnAlpha=findViewById(R.id.btnAlpha);
        btnScale=findViewById(R.id.btnScale);
        btnTranslate=findViewById(R.id.btnTranslate);
        btnRotate=findViewById(R.id.btnRotate);
        btnThoat=findViewById(R.id.btnThoat);
    }

    private void addEvents() {
       btnAlpha.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Animation animation= AnimationUtils.loadAnimation(MainActivity.this,R.anim.alpha_animation);
               btnAlpha.startAnimation(animation);
           }
       });
       btnScale.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Animation animation=AnimationUtils.loadAnimation(MainActivity.this,R.anim.scale_animation);
               btnScale.startAnimation(animation);
           }
       });
       btnTranslate.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Animation animation=AnimationUtils.loadAnimation(MainActivity.this,R.anim.translate_animation);
               btnTranslate.startAnimation(animation);
           }
       });
       btnRotate.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Animation animation=AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate_animation);
               btnRotate.startAnimation(animation);
           }
       });
       btnThoat.setOnClickListener(
               new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       Animation animation=AnimationUtils.loadAnimation(MainActivity.this,R.anim.alpha_animation);
                       btnThoat.startAnimation(animation);
                       animation.setAnimationListener(new Animation.AnimationListener() {
                           @Override
                           public void onAnimationStart(Animation animation) {

                           }

                           @Override
                           public void onAnimationEnd(Animation animation) {
                                finish();
                           }

                           @Override
                           public void onAnimationRepeat(Animation animation) {

                           }
                       });
                   }
               }
       );
    }
}
