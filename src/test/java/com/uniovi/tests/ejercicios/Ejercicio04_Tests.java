package com.uniovi.tests.ejercicios;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.uniovi.services.data.UserList;
import com.uniovi.tests.pageobjects.PO_HomeView;
import com.uniovi.tests.pageobjects.PO_LoginView;
import com.uniovi.tests.pageobjects.PO_PrivateView;
import com.uniovi.tests.pageobjects.PO_View;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Ejercicio04_Tests extends BaseTests {

	/**
	 * Mostrar el listado de usuarios y comprobar que se muestran todos los que
	 * existen en el sistema.
	 */
	@Test
	public void Prueba_12() {
		PO_HomeView.clickOption("login", "class", "btn btn-primary");
		PO_LoginView.fillForm(UserList.admin.email, UserList.admin.password);
		PO_PrivateView.accederPagina("users-menu", "/user/list");
		for (int i = 0; i < UserList.maxUser; i++) {
			PO_View.checkElement("text", UserList.usuarios(i).email);
			PO_View.checkElement("text", UserList.usuarios(i).name);
			PO_View.checkElement("text", UserList.usuarios(i).lastName);
		}
	}

}
