package com.unb.StepFileManager.dto;

import jsdai.lang.*; 
import java.io.*;


public class ReadStepFile {
	
	/**
	 * JSDAI application program.
	 * Reads an STEP (ap203) physical file, prints instances of product entity, 
	 * finds and prints their users product_definition_formation_with_specified_source entity instances
	 * @param args
	 * @author Cristhian
	 */
	
	public static void main(String[] args) throws jsdai.lang.SdaiException {
		// TODO Auto-generated method stub

			System.out.println("USAGE: java importExport input_file output_file");
	

		SdaiSession.setLogWriter(new PrintWriter(System.out, true));
		SdaiSession session = SdaiSession.openSession();
		SdaiTransaction trans = session.startTransactionReadWriteAccess();

		
		SdaiRepository repo = session.importClearTextEncoding(null, "/home/cristhian/Dropbox/workspaceISys/JsdaiRepository/Entrada/ap242.stp", null);
				
		//ap203.stp
		//ap214.stp
		//ap238.stp
		//ap242.stp
		
		//repo.openRepository(); //-- already open after import
		
		repo.exportClearTextEncoding("/home/cristhian/Dropbox/workspaceISys/JsdaiRepository/Saida/saida242.stp");
		trans.endTransactionAccessAbort();
		repo.closeRepository();
		repo.deleteRepository();
		session.closeSession();	
		
	}	
	
	
	
	

}
