package moldelsTest;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import models.Anuncio;

public class AnuncioTest {

	private String descricao;
	private String titulo;
	private String cidade;
	private String bairro;
	private String instrumentos;
	private String estilosBanidos;
	private String estilos;
	private String contatos;
	private String interesses;

	@Before
	public void setUp() {
		descricao = "Descricao do teste";
		titulo = "Anuncio 01";
		cidade = "Campina Grande";
		bairro = "Centro";
		instrumentos = "Violino, Gaita";
		estilos = "Classio, Folk, Medieval";
		estilosBanidos = "Funk, pagode, arrocha";
		contatos = "testeAnuncio1@gmail.com";
		interesses = "Formar banda";

	}

	@Test
	public void criandoAnuncioSemErros() {
		try {
			new Anuncio(titulo, descricao, cidade, bairro, instrumentos,
					estilos, estilosBanidos, contatos, interesses);
		} catch (Exception e) {
			fail("Nao deve lancar excessao");

		}
	}

	@Test
	public void naoDeveCriarAnuncioSemTitulo() {
		try {
			new Anuncio("", descricao, cidade, bairro, instrumentos, estilos,
					estilosBanidos, contatos, interesses);
			Assert.fail("Esperava excecao, pois o titulo do anuncio e invalido");
		} catch (Exception e) {
			Assert.assertEquals(
					"Mensagem errada",
					"O titulo nao pode ser nulo ou vazio para criacao de um anuncio",
					e.getMessage());
		}
		try {
			new Anuncio(null, descricao, cidade, bairro, instrumentos, estilos,
					estilosBanidos, contatos, interesses);
			Assert.fail("Esperava excecao, pois o titulo do anuncio e invalido");
		} catch (Exception e) {
			Assert.assertEquals(
					"Mensagem errada",
					"O titulo nao pode ser nulo ou vazio para criacao de um anuncio",
					e.getMessage());
		}

	}

	@Test
	public void naoDeveCriarAnuncioSemDescricao() {
		try {
			new Anuncio(titulo, "", cidade, bairro, instrumentos, estilos,
					estilosBanidos, contatos, interesses);
			Assert.fail("Esperava excecao, pois a descricao do anuncio e invalida");
		} catch (Exception e) {
			Assert.assertEquals(
					"Mensagem errada",
					"A descricao nao pode ser nula ou vazia para criacao de um anuncio",
					e.getMessage());
		}
		try {
			new Anuncio(titulo, null, cidade, bairro, instrumentos, estilos,
					estilosBanidos, contatos, interesses);
			Assert.fail("Esperava excecao, pois a descricao do anuncio e invalida");
		} catch (Exception e) {
			Assert.assertEquals(
					"Mensagem errada",
					"A descricao nao pode ser nula ou vazia para criacao de um anuncio",
					e.getMessage());
		}

	}

	@Test
	public void naoDeveCriarAnuncioSemCidade() {
		try {
			new Anuncio(titulo, descricao, "", bairro, instrumentos, estilos,
					estilosBanidos, contatos, interesses);
			Assert.fail("Esperava excecao, pois a cidade do anuncio e invalida");
		} catch (Exception e) {
			Assert.assertEquals(
					"Mensagem errada",
					"A cidade nao pode ser nula ou vazia para criacao de um anuncio",
					e.getMessage());
		}
		try {
			new Anuncio(titulo, descricao, null, bairro, instrumentos, estilos,
					estilosBanidos, contatos, interesses);
			Assert.fail("Esperava excecao, pois a cidade do anuncio e invalida");
		} catch (Exception e) {
			Assert.assertEquals(
					"Mensagem errada",
					"A cidade nao pode ser nula ou vazia para criacao de um anuncio",
					e.getMessage());
		}

	}

	@Test
	public void naoDeveCriarAnuncioSemBairro() {
		try {
			new Anuncio(titulo, descricao, cidade, "", instrumentos, estilos,
					estilosBanidos, contatos, interesses);
			Assert.fail("Esperava excecao, pois o bairro do anuncio e invalido");
		} catch (Exception e) {
			Assert.assertEquals(
					"Mensagem errada",
					"O bairro nao pode ser nulo ou vazio para criacao de um anuncio",
					e.getMessage());
		}
		try {
			new Anuncio(titulo, descricao, cidade, null, instrumentos, estilos,
					estilosBanidos, contatos, interesses);
			Assert.fail("Esperava excecao, pois o bairro do anuncio e invalido");
		} catch (Exception e) {
			Assert.assertEquals(
					"Mensagem errada",
					"O bairro nao pode ser nulo ou vazio para criacao de um anuncio",
					e.getMessage());
		}
	}

	@Test
	public void naoDeveCriarAnuncioSemIntrumentos() {
		try {
			new Anuncio(titulo, descricao, cidade, bairro, "", estilos,
					estilosBanidos, contatos, interesses);
			Assert.fail("Esperava excecao, pois os intrumentos do anuncio sao invalidos");
		} catch (Exception e) {
			Assert.assertEquals(
					"Mensagem errada",
					"Os intrumentos nao podem ser invalidos para criacao de um anuncio",
					e.getMessage());
		}
		try {
			new Anuncio(titulo, descricao, cidade, bairro, null, estilos,
					estilosBanidos, contatos, interesses);
			Assert.fail("Esperava excecao, pois os intrumentos do anuncio sao invalidos");
		} catch (Exception e) {
			Assert.assertEquals(
					"Mensagem errada",
					"Os intrumentos nao podem ser invalidos para criacao de um anuncio",
					e.getMessage());
		}

	}

	@Test
	public void naoDeveCriarAnuncioSemContatos() {
		try {
			new Anuncio(titulo, descricao, cidade, bairro, instrumentos,
					estilos, estilosBanidos, "", interesses);
			Assert.fail("Esperava excecao, pois os contatos do anuncio sao invalidos");
		} catch (Exception e) {
			Assert.assertEquals(
					"Mensagem errada",
					"Os contatos nao podem ser invalidos para criacao de um anuncio",
					e.getMessage());
		}
		try {
			new Anuncio(titulo, descricao, cidade, bairro, instrumentos,
					estilos, estilosBanidos, null, interesses);
			Assert.fail("Esperava excecao, pois os contatos do anuncio sao invalidos");
		} catch (Exception e) {
			Assert.assertEquals(
					"Mensagem errada",
					"Os contatos nao podem ser invalidos para criacao de um anuncio",
					e.getMessage());
		}

	}

	@Test
	public void naoDeveCriarAnuncioSemInteresses() {
		try {
			new Anuncio(titulo, descricao, cidade, bairro, instrumentos,
					estilos, estilosBanidos, contatos, "");
			Assert.fail("Esperava excecao, pois os interesses do anuncio sao invalidos");
		} catch (Exception e) {
			Assert.assertEquals(
					"Mensagem errada",
					"Os interesses nao podem ser invalidos para criacao de um anuncio",
					e.getMessage());
		}
		try {
			new Anuncio(titulo, descricao, cidade, bairro, instrumentos,
					estilos, estilosBanidos, contatos, null);
			Assert.fail("Esperava excecao, pois os interesses do anuncio sao invalidos");
		} catch (Exception e) {
			Assert.assertEquals(
					"Mensagem errada",
					"Os interesses nao podem ser invalidos para criacao de um anuncio",
					e.getMessage());
		}

	}

}
