/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package syslivros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.JFileChooser;

/**
 *
 * @author Rafael
 */
public class SysLivros {
    public static void geraReciboApostilaDOC(String curso,String Catis,int qtApostila, String data,char periodo,String Professor) throws FileNotFoundException{
    
JFileChooser jf =new JFileChooser();
           jf.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
           int retorno=jf.showSaveDialog(null);
           if(retorno!=JFileChooser.APPROVE_OPTION){
           }else {
                File pasta = jf.getSelectedFile();
               System.out.println("abrindo"+pasta.getName());
           try (PrintWriter pt = new PrintWriter(pasta+".doc")) {
               pt.println("Supnet Tecnologia e Informação\n");
               pt.println("Recibo de entrega de apostilas \n");
               pt.println("Curso: "+curso+"\n");
               pt.println("Local: "+Catis+"\n");
               pt.println("Quantidade: "+" "+qtApostila+"\n");
               pt.println("Data: "+data+"\n");
               pt.println("Periodo: "+periodo+"\n");
               pt.println("Professor: "+Professor+"\n");
               pt.println("Assinatura: _____________________________________________\n");
               pt.println("Data:    /   /      \n");
               
             
               
    GregorianCalendar datacalendario =new GregorianCalendar();
                
                pt.println("Data de Criação: "+datacalendario.getTime().toString()); 
              pt.close();
           }
           }


    }
    public static void geraRelatorio_ApostilasRecebidasDOC(ArrayList<StringBuilder> linhas) throws FileNotFoundException{
    
JFileChooser jf =new JFileChooser();
           jf.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
           int retorno=jf.showSaveDialog(null);
           if(retorno!=JFileChooser.APPROVE_OPTION){
           }else {
                File pasta = jf.getSelectedFile();
               System.out.println("abrindo"+pasta.getName());
           try (PrintWriter pt = new PrintWriter(pasta+".doc")) {
               pt.println("Supnet Tecnologia e Informação\n");
               pt.println("Relatorio de Recebimento de apostilas na Base\n");
                pt.println("SEGUE NA SEGUINTE ORDEM: \n");
               pt.println("ID, CURSO, QUANTIDADE, LOCAL, DATA\n");
              for(StringBuilder b: linhas){
                  
        pt.println(b.toString());  
        pt.println("\n");
      
              }  
    GregorianCalendar data =new GregorianCalendar();
                
                pt.println("Data de Criação: "+data.getTime().toString()); 
              pt.close();
           }
           }


    }
   public static void geraRelatorio_ApostilasEnviadasDOC(ArrayList<StringBuilder> linhas) throws FileNotFoundException{
    
JFileChooser jf =new JFileChooser();
           jf.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
           int retorno=jf.showSaveDialog(null);
           if(retorno!=JFileChooser.APPROVE_OPTION){
           }else {
                File pasta = jf.getSelectedFile();
               System.out.println("abrindo"+pasta.getName());
           try (PrintWriter pt = new PrintWriter(pasta+".doc")) {
               pt.println("Supnet Tecnologia e Informação");
               pt.println("Relatorio de Envio de apostilas aos catis\n");
               pt.println("SEGUE NA SEGUINTE ORDEM: \n");
               pt.println("ID, CURSO, QUANTIDADE, LOCAL, DATA\n");
              for(StringBuilder b: linhas){
                  
        pt.println(b.toString());  
        pt.println();
        
    }  GregorianCalendar data =new GregorianCalendar();
                
                pt.println("Data de Criação: "+data.getTime().toString());  
      
              pt.close();
           }
           }


    }
    public static Date formataData(String data) throws Exception {   
        if (data == null || data.equals("")) {
            return null;
        }  
          
        Date date = null;  
        try {  
            DateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");  
            date = (Date)(java.util.Date)formatter.parse(data);  
        } catch (ParseException e) {              
            throw e;  
        }  
        return date;  
    }  
    /**
     * Converte uma data no formato 02/02/1900 para 1900-02-02 e vice-versa
     *
     * @param Date
     * @return Data no formato inglês ou português
     */
    public static String DataPTtoENtoPT(String Date) {
        String[] Data;
        String DataCerta;
        if (Date.indexOf("/") >= 0) {
            Data = Date.split("/");
            DataCerta = Data[2] + "-" + Data[1] + "-" + Data[0];
        } else {
            Data = Date.split("-");
            DataCerta = Data[2] + "/" + Data[1] + "/" + Data[0];
        }
        return DataCerta;
    }
    //metodo que busca o id da tabela
public static int GetID(String tabela, String idTabela, int ID) throws SQLException{
     int idProf []=new int[2000];
    int i=1;
    
        PreparedStatement ps =Conexao.ConexaoJDBC.prepareStatement("select * from "+tabela +" where "+idTabela+">0");
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            
            idProf[i]=rs.getInt(idTabela);
            
        i++;
        }
        ID=1;
     
     ID++;
       
return idProf[ID] ;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
        
        
       new Principal().setVisible(true);
    }
}
