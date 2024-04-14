package edu.caio.POO.ExE14.Interfaces.TestDominio;

import edu.caio.POO.ExE14.Interfaces.Dominio.DataBaseLoader;
import edu.caio.POO.ExE14.Interfaces.Dominio.FileLoader;

public class DataLoaderTest01 {
	public static void main(String[] args) {
		DataBaseLoader loaderDataBase = new DataBaseLoader();
		FileLoader fileLoader = new FileLoader();
		
		loaderDataBase.load();
		fileLoader.load();
		
		loaderDataBase.remove();
		fileLoader.remove();
		
		loaderDataBase.validate();
		fileLoader.validate();
	}
}
