package com.tutosandroidfrance.facebook;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.widget.ShareButton;


public class MainActivity extends AppCompatActivity {

    private ShareButton shareButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        shareButton = (ShareButton) findViewById(R.id.fb_share_button);

        /**
         *  Dès que l'utilisateur clique sur notre ShareButton, cela
         *  lui affiche une vue qui lui permet de partager le lien
         *  qu'on a mis :)
         */
        ShareLinkContent content = new ShareLinkContent.Builder()
                .setContentUrl(Uri.parse("http://www.android-pour-tous.com/"))
                .build();

        shareButton.setShareContent(content);
    }


}
