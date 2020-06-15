package com.example.calculadoradechurrasco;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


	public class Calculo extends Activity {
		public int homi;
		public int muie;
		public int crianca;
		public double total_gramas_crianca_frango;//qtd de frango p/crianca
		public double total_gramas_crianca_carne;//qtd de carne p/ crianca
		public double total_gramas_crianca_linguica;//qtd de linguica por crianca
		public double total_gramas_muie_frango;//qtd de frango por mulher
		public double total_gramas_muie_carne;//qtd de carne por mulher
		public double total_gramas_muie_linguica;//qtd de linguiça por mulher
		public double total_gramas_homi_frango;//qtd de frango por homem
		public double total_gramas_homi_carne;//qtd de carne por homem
		public double total_gramas_homi_linguica;//qtd de linguiça por homem
		
		public double total_linguica;
		public double total_frango;
		public double total_carne;
		
		public double total_refri;
		public double total_cerveja;
		
		public int pratos, garfo, faca, copo;

		
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_calculo);
			Button btn_voltar=(Button) findViewById(R.id.voltar_calculo);
	btn_voltar.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					startActivity(new Intent(Calculo.this, MainActivity.class));
					finish();
				}
			});
			
			
		}
		
		public void calcular(View v){
			Intent it = new Intent(this, Relatorio.class);
			
			
			
			
			
			
			EditText qt_muie = (EditText) findViewById(R.id.editText1);
			EditText qt_homi = (EditText) findViewById(R.id.editText2);
			EditText qt_crianca = (EditText) findViewById(R.id.editText3);
			crianca=Integer.parseInt(qt_crianca.getText().toString());
			homi=Integer.parseInt(qt_homi.getText().toString());
			muie=Integer.parseInt(qt_muie.getText().toString());
			total_gramas_crianca_frango = (Dados.qt_gramas_clianca * Dados.pc_frango)*crianca ;//total de gramas de frango por criança
			total_gramas_crianca_carne = (Dados.qt_gramas_clianca * Dados.pc_carne)*crianca ;//total de gramas de carne por criança
			total_gramas_crianca_linguica=(Dados.qt_gramas_clianca*Dados.pc_linguica)*crianca;//total de gramas de linguiça por criança
			
			total_gramas_homi_carne=(Dados.qt_gramas_homi*Dados.pc_carne)*homi;
			total_gramas_homi_frango=(Dados.qt_gramas_homi*Dados.pc_frango)*homi;
			total_gramas_homi_linguica=(Dados.qt_gramas_homi*Dados.pc_linguica)*homi;
			
			total_gramas_muie_carne=(Dados.qt_gramas_muie*Dados.pc_carne)*muie;
			total_gramas_muie_frango=(Dados.qt_gramas_muie*Dados.pc_frango)*muie;
			total_gramas_muie_linguica=(Dados.qt_gramas_muie*Dados.pc_linguica)*muie;
			
			total_cerveja = (Dados.cerveja_por_adulto * (homi + muie));
			total_refri = (Dados.refri_por_pessoa * (homi + muie + crianca));
			
			total_linguica=(total_gramas_crianca_linguica+total_gramas_homi_linguica+total_gramas_muie_linguica);//total a ser comprado de linguiça
			total_frango=(total_gramas_crianca_frango+total_gramas_homi_frango+total_gramas_muie_frango);//total a ser comprado de frango
			total_carne=(total_gramas_crianca_carne+total_gramas_homi_carne+total_gramas_muie_carne);//total a ser comprado de carne
			
			pratos=(muie+homi+crianca)*3;
			garfo=(muie+homi+crianca)*3;
			faca=(muie+homi+crianca)*3;
			copo=(muie+homi+crianca)*4;
			
			it.putExtra("total_linguica", total_linguica);
			it.putExtra("total_frango", total_frango);
			it.putExtra("total_carne", total_carne);
			it.putExtra("total_refri", total_refri);
			it.putExtra("total_cerveja", total_cerveja);
			it.putExtra("copo", copo);
			it.putExtra("faca", faca);
			it.putExtra("garfo", garfo);
			it.putExtra("pratos", pratos);
			
			startActivity(it);
			
			
			
		}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.calculo, menu);
		return true;
	}


}