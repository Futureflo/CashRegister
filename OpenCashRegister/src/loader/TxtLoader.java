package loader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import model.Product;

public class TxtLoader implements Loader {

	private String path;

	public ArrayList<Product> readProducts() {

		ArrayList<Product> productList = new ArrayList<Product>();
		List<String> productStrings = this.readTxt();
		Product product;

		for (String productString : productStrings) {
			product = new Product();
			String[] split = productString.split(Pattern.quote(" "));
			product.setName(split[0]);
			product.setPrice(Float.parseFloat(split[1]));
			productList.add(product);
		}
		return productList;
	}

	public ArrayList<String> readTxt() {

		ArrayList<String> productStrings = new ArrayList<String>();
		FileReader fr;
		try {
			fr = new FileReader(path);

			BufferedReader br = new BufferedReader(fr);

			String line;
			while ((line = br.readLine()) != null) {
				productStrings.add(line);
			}

			br.close();
		} catch (IOException e) {
			System.out.println("File was not found. Maybe the path was wrong.");
			e.printStackTrace();
		}

		return productStrings;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
