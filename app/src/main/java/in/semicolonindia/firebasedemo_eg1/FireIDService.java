package in.semicolonindia.firebasedemo_eg1;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by RANJAN SINGH on 8/19/2018.
 */
@SuppressWarnings("ALL")
public class FireIDService extends FirebaseInstanceIdService {

    @Override
    public void onTokenRefresh() {
        String tkn = FirebaseInstanceId.getInstance().getToken();
        Log.d("Not","Token ["+tkn+"]");
    }
}
