package com.example.projetointegracaocliente.test;

import android.content.Intent;
import android.test.ActivityUnitTestCase;
import android.widget.Button;
import android.widget.EditText;

import com.example.projetointegracaocliente.MainActivity;

public class MainActivityTest extends ActivityUnitTestCase<MainActivity> {

	
	private int buttonId;
	private int etId;
	private MainActivity activity;
	
	
	public MainActivityTest() {
		super(MainActivity.class);
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		Intent intent = new Intent(getInstrumentation().getTargetContext(), MainActivity.class);
		startActivity(intent, null, null);
		activity = getActivity();
	}
	
	
	public void testLayoutButton() {
	    buttonId = com.example.projetointegracaocliente.R.id.buttonRegId;
	    assertNotNull(activity.findViewById(buttonId));
	    Button view = (Button) activity.findViewById(buttonId);
	    assertEquals("RegId", "Obter Registration ID", view.getText());
	  }
	
	public void testLayoutEditText() {
	    etId = com.example.projetointegracaocliente.R.id.etRegId;
	    assertNotNull(activity.findViewById(etId));
	    EditText view = (EditText) activity.findViewById(etId);
	    assertEquals("qualquer coisa", null, view.getText());
	  }
}
