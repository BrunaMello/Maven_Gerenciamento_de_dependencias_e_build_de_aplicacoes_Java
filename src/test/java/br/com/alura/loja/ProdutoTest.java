package br.com.alura.loja;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class ProdutoTest {

	@Test
	public void test() {

		Produto p = new Produto("teste", BigDecimal.TEN);
		Assert.assertArrayEquals("teste", p.getNome());
		Assert.assertArrayEquals(BigDecimal.TEN, p.getPreco());

	}

}
