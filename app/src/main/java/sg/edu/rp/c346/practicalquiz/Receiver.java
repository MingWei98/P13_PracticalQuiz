package sg.edu.rp.c346.practicalquiz;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.preference.PreferenceManager;
import android.widget.Toast;

/**
 * Created by 16038911 on 13/8/2018.
 */

public class Receiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

//        Toast my_toast = Toast.makeText(context, "Airplane mode changed", Toast.LENGTH_LONG);
//        my_toast.show();

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        int id = prefs.getInt("id", R.id.radioButton1);

        if(id == R.id.radioButton1){
            Toast my_toast = Toast.makeText(context, R.string.rb1, Toast.LENGTH_LONG);
            my_toast.show();
        }
        else {
            Toast my_toast = Toast.makeText(context, R.string.rb2, Toast.LENGTH_LONG);
            my_toast.show();
        }

    }
}
