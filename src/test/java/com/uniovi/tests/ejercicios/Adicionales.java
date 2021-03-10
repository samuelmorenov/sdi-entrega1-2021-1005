package com.uniovi.tests.ejercicios;

import static org.junit.Assert.fail;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.uniovi.services.data.UserList;
import com.uniovi.tests.pageobjects.PO_HomeView;
import com.uniovi.tests.pageobjects.PO_LoginView;
import com.uniovi.tests.pageobjects.PO_PrivateView;
import com.uniovi.tests.pageobjects.PO_View;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Adicionales extends BaseTests {

	/**
	 * El contador de dinero de cada usuario deberá mostrarse, en todas las vistas
	 * de acceso privado para el usuario, al lado de su email.
	 */
	@Test
	public void Adicional_01() {
		fail("Not yet implemented");
	}

	/**
	 * Es obligatorio realizar las validaciones del lado del servidor.
	 */
	@Test
	public void Adicional_02() {
		fail("Not yet implemented");
	}

	/**
	 * El saldo inicial al registrarse es de 100€.
	 */
	@Test
	public void Adicional_03() {
		fail("Not yet implemented");
	}

	/**
	 * En la lista de usuarios no debe aparecer el administrador
	 */
	@Test
	public void Adicional_04() {
		PO_HomeView.clickOption("login", "class", "btn btn-primary");
		PO_LoginView.fillForm(UserList.admin.email, UserList.admin.password);
		PO_PrivateView.accederPagina("users-menu", "/user/list");
		PO_View.checkNoElement("text", UserList.admin.email);
	}

}
