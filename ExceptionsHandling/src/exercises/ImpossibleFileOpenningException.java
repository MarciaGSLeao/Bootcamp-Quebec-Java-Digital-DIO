package exercises;

@SuppressWarnings("serial")
public class ImpossibleFileOpenningException extends Exception{
	
	private String fileName;
	private String url;
	
	public ImpossibleFileOpenningException(String fileName, String url) {
		super("O arquivo " + fileName + " não foi encontrado no diretório " + url);
		this.fileName = fileName;
		this.url = url;
	}

	public String getFileName() {
		return fileName;
	}

	public String getUrl() {
		return url;
	}

}