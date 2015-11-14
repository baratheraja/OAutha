package matrix.example.baratheraja.kapp;

import android.graphics.Typeface;

/**
 * Created by baratheraja on 13/11/15.
 */
public final class Application extends android.app.Application {

    private static final String CANARO_EXTRA_BOLD_PATH = "fonts/Canaro.ttf";
    public static Typeface canaroExtraBold;

    @Override
    public void onCreate() {
        super.onCreate();
        initTypeface();
    }

    private void initTypeface() {
        canaroExtraBold = Typeface.createFromAsset(getAssets(), CANARO_EXTRA_BOLD_PATH);

    }
}