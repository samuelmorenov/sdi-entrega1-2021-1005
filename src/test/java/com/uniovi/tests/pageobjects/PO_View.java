package com.uniovi.tests.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.uniovi.tests.DriverSingleton;
import com.uniovi.tests.util.SeleniumUtilsV2;

public class PO_View {
	protected static PO_Properties p = new PO_Properties("messages");
	protected static int timeout = 2;

	protected static WebDriver driver = DriverSingleton.getDriver();

	public static int getTimeout() {
		return timeout;
	}

	@Deprecated
	public static void setTimeout(int timeout) {
		PO_View.timeout = timeout;
	}

	@Deprecated
	public static PO_Properties getP() {
		return p;
	}

	@Deprecated
	public static void setP(PO_Properties p) {
		PO_View.p = p;
	}

	/**
	 * Espera por la visibilidad de un texto correspondiente a la propiedad key en
	 * el idioma locale en la vista actualmente cargandose en driver..
	 * 
	 * @param driver: apuntando al navegador abierto actualmente.
	 * @param key:    clave del archivo de propiedades.
	 * @param locale: Retorna el índice correspondient al idioma. 0 p.SPANISH y 1
	 *                p.ENGLISH.
	 * @return Se retornará la lista de elementos resultantes de la búsqueda.
	 */
	static public List<WebElement> checkKey(String key, int locale) {
		return SeleniumUtilsV2.EsperaCargaPagina("text", p.getString(key, locale), getTimeout());
	}

	static public void checkNoKey(String key, int locale) {
		SeleniumUtilsV2.NoEsperaCargaPagina("text", p.getString(key, locale), getTimeout());
	}

	/**
	 * Espera por la visibilidad de un elemento/s en la vista actualmente cargandose
	 * en driver..
	 * 
	 * @param driver: apuntando al navegador abierto actualmente.
	 * @param type:
	 * @param text:
	 * @return Se retornará la lista de elementos resultantes de la búsqueda.
	 */
	static public List<WebElement> checkElement(String type, String text) {
		return SeleniumUtilsV2.EsperaCargaPagina(type, text, getTimeout());
	}

	static public void checkNoElement(String type, String text) {
		SeleniumUtilsV2.NoEsperaCargaPagina(type, text, getTimeout());
	}

	static public List<WebElement> checkText(String text) {
		return SeleniumUtilsV2.EsperaCargaPagina("text", text, getTimeout());
	}

	static public void checkNoText(String text) {
		SeleniumUtilsV2.NoEsperaCargaPagina("text", text, getTimeout());
	}

}
