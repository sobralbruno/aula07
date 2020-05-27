package exercicio_2_1;

public abstract class NameParserCreator {
	public void gravarNome(String nome) {
		NameParser parser = getParser();
		Nome parsedName = parser.parse(nome);
		System.out.println(parsedName);
	}
	
	protected abstract NameParser getParser();

}
