package hetao.ui.ieditor.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class EditTextActivity  extends Activity{
    
	TextView textView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		RelativeLayout rl =new RelativeLayout(this);
		
		LayoutParams lp =(LayoutParams) rl.getLayoutParams();
		lp.width = LayoutParams.MATCH_PARENT;
		lp.height = LayoutParams.MATCH_PARENT;
		
		textView =new TextView(this);
		
		rl.addView(textView);
		
		setContentView(rl);
		
	}

	

}
