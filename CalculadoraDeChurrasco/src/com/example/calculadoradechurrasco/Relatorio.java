package com.example.calculadoradechurrasco;

import com.example.calculadoradechurrasco.Calculo;
import com.example.calculadoradechurrasco.R;
import com.example.calculadoradechurrasco.Relatorio;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Relatorio extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_relatorio);
		TextView resul = (TextView) findViewById(R.id.resultado);
		Intent it = getIntent();
		
		Button btn_voltar = (Button)findViewById(R.id.btn_voltar_relatorio);
		btn_voltar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(Relatorio.this, Calculo.class));
				finish();
				
			}
		});
		
		
		double total_linguica=it.getDoubleExtra("total_linguica", 0);
		double total_frango=it.getDoubleExtra("total_frango", 0);
		double total_carne=it.getDoubleExtra("total_carne", 0);
		double total_refri=it.getDoubleExtra("total_refri", 0);
		double total_cerveja=it.getDoubleExtra("total_cerveja", 0);
		int total_pratos=it.getIntExtra("pratos", 0);
		int total_copo=it.getIntExtra("copo", 0);
		int total_faca=it.getIntExtra("faca", 0);
		int total_garfo=it.getIntExtra("garfo", 0);
		
		
		
		resul.setText("Compre "+total_linguica+" gramas de Linguiça\n"
				+"Compre "+total_frango+" gramas de Frango\n"
				+"Compre "+total_carne+" gramas de Carne\n"	
				+"Bebidas:\n"
				+"Compre "+total_refri+"ml de refrigerante\n"
				+"Compre "+total_cerveja+"ml de cerveja\n"
				+"Descartaveis:\n"
				+"compre "+ total_pratos+" de pratos\n"
				+"Compre "+total_copo+" de copos\n"
				+"Compre"+total_faca+" de facas\n"
				+"Compre "+total_garfo+" de garfos");
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.relatorio, menu);
		return true;
	}

}
