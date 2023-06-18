package br.com.erudio;

public class Greeting {
	
	// alt + shift + s -> Generate construtor using fields.
	// alt + shift + s -> Generate Getter and Setter.
	
	private final long id;
	private final String content;
	
	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}
