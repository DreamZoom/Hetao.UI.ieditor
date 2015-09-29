package hetao.ui.ieditor.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager.LayoutParams;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class EditTextActivity  extends Activity{
    
	EditText textView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		RelativeLayout rl =new RelativeLayout(this);
		
		LayoutParams lp =new LayoutParams();

		lp.width = LayoutParams.MATCH_PARENT;
		lp.height = LayoutParams.MATCH_PARENT;
		
		LayoutParams lp2 =new LayoutParams();

		lp2.width = LayoutParams.MATCH_PARENT;
		lp2.height = LayoutParams.WRAP_CONTENT;
		lp2.horizontalMargin=10;
		
		textView =new EditText(this);
		textView.setLayoutParams(lp2);
		textView.setText("哈哈哈");
		
		rl.addView(textView);
		
		setContentView(rl);
		
	}

	

}
