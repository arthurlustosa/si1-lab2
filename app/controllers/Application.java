package controllers;

import models.Anuncio;
import models.dao.GenericDAO;
import play.Logger;
import play.data.Form;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

import java.util.Collections;
import java.util.List;

import play.*;
import play.mvc.*;

import views.html.*;


public class Application extends Controller {
    private static final GenericDAO DAO = new GenericDAO();
    private static Form<Anuncio> formAnuncios = Form.form(Anuncio.class);
    private static Form<String> formFinal = Form.form(String.class);
    private static int anunciosFinalizados = 0;

    @Transactional
	public static Result index() {
		return anuncios();
    }

	public static Result anuncios() {
		List<Anuncio> resultado = DAO.findAllByClass(Anuncio.class);
		Collections.sort(resultado);

		return ok(index.render(resultado, false, anunciosFinalizados));
	}


   
}

