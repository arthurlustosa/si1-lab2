package models;

public class Anuncio {

	private Long id;
	private String descricao;
	private String titulo;
	private String cidade;
	private String bairro;
	private String instrumentos;
	private String estilosBanidos;
	private String estilos;
	private String contatos;
	private String interesses;

	public Anuncio(String titulo, String descricao, String cidade,
			String bairro, String instrumentos, String estilos,
			String estilosBanidos, String contatos, String interesses)
			throws Exception {
		validaParametros(titulo, descricao, cidade, bairro, instrumentos,
				contatos, interesses);
		this.titulo = titulo;
		this.descricao = descricao;
		this.cidade = cidade;
		this.bairro = bairro;
		this.instrumentos = instrumentos;
		this.estilos = estilos;
		this.estilosBanidos = estilosBanidos;
		this.contatos = contatos;
		this.interesses = interesses;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getInstrumentos() {
		return instrumentos;
	}

	public void setInstrumentos(String instrumentos) {
		this.instrumentos = instrumentos;
	}

	public String getEstilosBanidos() {
		return estilosBanidos;
	}

	public void setEstilosBanidos(String estilosBanidos) {
		this.estilosBanidos = estilosBanidos;
	}

	public String getEstilos() {
		return estilos;
	}

	public void setEstilos(String estilos) {
		this.estilos = estilos;
	}

	public String getContatos() {
		return contatos;
	}

	public void setContatos(String contatos) {
		this.contatos = contatos;
	}

	public String getInteresses() {
		return interesses;
	}

	public void setInteresses(String interesses) {
		this.interesses = interesses;
	}

	private void validaParametros(String titulo, String descricao,
			String cidade, String bairro, String instrumentos, String contatos,
			String interesses) throws Exception {
		if (titulo == null || titulo.equals("")) {
			throw new Exception(
					"O titulo nao pode ser nulo ou vazio para criacao de um anuncio");
		}
		if (descricao == null || descricao.equals("")) {
			throw new Exception(
					"A descricao nao pode ser nula ou vazia para criacao de um anuncio");
		}
		if (cidade == null || cidade.equals("")) {
			throw new Exception(
					"A cidade nao pode ser nula ou vazia para criacao de um anuncio");
		}
		if (bairro == null || bairro.equals("")) {
			throw new Exception(
					"O bairro nao pode ser nulo ou vazio para criacao de um anuncio");
		}
		if (instrumentos == null || instrumentos.equals("")) {
			throw new Exception(
					"Os intrumentos nao podem ser invalidos para criacao de um anuncio");
		}
		if (contatos == null || contatos.equals("")) {
			throw new Exception(
					"Os contatos nao podem ser invalidos para criacao de um anuncio");
		}
		if (interesses == null || interesses.equals("")) {
			throw new Exception(
					"Os interesses nao podem ser invalidos para criacao de um anuncio");
		}
	}

}
