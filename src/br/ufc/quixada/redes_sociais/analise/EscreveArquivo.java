package br.ufc.quixada.redes_sociais.analise;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

public class EscreveArquivo {
	private Path caminhoTXT;
	private Path caminhoDL; 
	private Charset utf8 = StandardCharsets.UTF_8;
	
	public void gravarTweet(HashMap<String, Integer> mencoesTweet, String path){
		caminhoTXT = Paths.get(path);
		try(BufferedWriter escritor = Files.newBufferedWriter(caminhoTXT,utf8)){
			for (String keyMencao : mencoesTweet.keySet()) {
				escritor.write(keyMencao + ";" + mencoesTweet.get(keyMencao) +"\n");	
			}			
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
	
	public void gravaDL(HashMap<Integer, String> associacoes, String path, String hash) {
		caminhoDL = Paths.get(path);
		try(BufferedWriter escritor = Files.newBufferedWriter(caminhoDL,utf8)){
			for (Integer index : associacoes.keySet()) {
				escritor.write(hash+ " " + associacoes.get(index) +"\n");	
			}			
		} catch (IOException e) {			
			e.printStackTrace();
		}		
	}
}
