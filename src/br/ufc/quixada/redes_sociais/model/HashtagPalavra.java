package br.ufc.quixada.redes_sociais.model;

import java.util.HashMap;

public class HashtagPalavra {
	private HashMap<String, Integer> mencoesPalavraHashtag;
	
	public HashtagPalavra() {
		this.mencoesPalavraHashtag = new HashMap<String, Integer>();
	}

	public HashMap<String, Integer> getMencoesPalavraHashtag() {
		return mencoesPalavraHashtag;
	}

	public void setMencoesPalavraHashtag(
			HashMap<String, Integer> mencoesPalavraHashtag) {
		this.mencoesPalavraHashtag = mencoesPalavraHashtag;
	}
	
	
}
