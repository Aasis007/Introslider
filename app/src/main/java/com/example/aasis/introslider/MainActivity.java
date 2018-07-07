package com.example.aasis.introslider;


import android.os.Bundle;
import android.widget.Toast;

import com.cuneytayyildiz.onboarder.OnboarderActivity;
import com.cuneytayyildiz.onboarder.OnboarderPage;
import com.cuneytayyildiz.onboarder.utils.OnboarderPageChangeListener;

import java.util.Arrays;
import java.util.List;


public class MainActivity extends OnboarderActivity implements OnboarderPageChangeListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        List<OnboarderPage>pages = Arrays.asList(


                new OnboarderPage.Builder()
                    .title("Swipe N Shop")
                    .description("Swipe Left To Discard")
                    .imageResourceId(R.drawable.slide1)
                    .backgroundColor(R.color.colorPrimary)
                    .build(),
                new OnboarderPage.Builder()
                        .title("Swipe N Shop")
                        .description("Swipe Right To Bookmark")
                        .imageResourceId(R.drawable.slide2)
                        .backgroundColor(R.color.colorPrimary)
                        .build()

                );

        setOnboarderPageChangeListener(this);
        initOnboardingPages(pages);



    }

    @Override
    public void onFinishButtonPressed() {
        Toast.makeText(this, "Slides ended", Toast.LENGTH_SHORT).show();

    }


    @Override
    public void onPageChanged(int position) {
        Toast.makeText(this, "OnPageChanged" +position, Toast.LENGTH_SHORT).show();

    }
}
