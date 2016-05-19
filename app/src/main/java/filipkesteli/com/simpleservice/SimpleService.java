package filipkesteli.com.simpleservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class SimpleService extends Service {

    //da me ne moze netko vise puta zvati
    private boolean serviceOn; //false po defaultu

    public SimpleService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        //da li sam startan?
        if (!serviceOn) {
            //service ima context kao handler...
            Toast.makeText(SimpleService.this, "Simple Service Started", Toast.LENGTH_SHORT).show();
            serviceOn = true; //postavi zastavicu da je startan
        } else {
            Toast.makeText(SimpleService.this, "Simple Service already started", Toast.LENGTH_SHORT).show();
        }
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        Toast.makeText(SimpleService.this, "Simple Service stopped", Toast.LENGTH_SHORT).show();
        //ne treba postavljati flag jer se objekt makne s heap-a
        super.onDestroy(); //ne moramo nuzno tako postaviti
        //ja cu sve svoje pocistiti, a onda se ti pocisti -> prilikom onDestroy-a
    }
}
