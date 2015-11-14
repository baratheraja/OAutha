package matrix.example.baratheraja.kapp;

/**
 * Created by baratheraja on 13/11/15.
 */
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;


/**
 * Created by Dmytro Denysenko on 5/6/15.
 */
public class CanaroTextView extends TextView {
    public CanaroTextView(Context context) {
        this(context, null);
    }

    public CanaroTextView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CanaroTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTypeface(Application.canaroExtraBold);
    }

}