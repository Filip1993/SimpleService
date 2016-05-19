package filipkesteli.com.simpleservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //STARTANJE -> EKSPLICITNI INTENT:
    /*
    public void startService(View view) {
        //potpuno isto kad gadamo activity -> eksplicitno pokretanje Service-a:
        //Intent intent = new Intent(this, SimpleService.class);
        Intent intent = getServiceIntent();
        startService(intent);
    }

    public void stopService(View view) {
        //Intent intent = new Intent(this, SimpleService.class);
        Intent intent = getServiceIntent();
        stopService(intent);
    }

    private Intent getServiceIntent() {
        return new Intent(this, SimpleService.class);
    }
    */

    //STARTANJE -> IMPLICITNO:
    public void startService(View view) {
        //potpuno isto kad gadamo activity -> eksplicitno pokretanje Service-a:
        //Intent intent = new Intent(this, SimpleService.class);
        Intent intent = getServiceIntent();
        startService(intent);
    }

    public void stopService(View view) {
        //Intent intent = new Intent(this, SimpleService.class);
        Intent intent = getServiceIntent();
        stopService(intent);
    }

    //kreiramo private metodu
    private Intent getServiceIntent() {
        Intent intent = new Intent("filipkesteli.com.simpleservice.SimpleService");
        //package iz MANIFESTA:
        intent.setPackage("filipkesteli.com.simpleservice");
        //moramo znat ime service-a kojeg zelimo startati, nego i ime paketa!!
        return intent;
    }
}
