package tdd;

import tdd.Produto;

import static org.junit.Assert.*;
import org.junit.Test;

public class LojaTest {
	@Test
	public void testarValorProduto() {	 
		Produto p = new Produto("Charque", 3, (float) 20.5);		 
		assertEquals((float) 20.5, p.getPreco(), 0.001);	
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testarValorNegativo() {
		Produto p = new Produto("Charque", 3, (float) 3.1);
		p.setPreco((float) -23.3);
	}

	@Test
	public void testarQuantidadeProduto() {
		Produto p = new Produto("Charque", 3, (float) 20.5);		 
		assertEquals((float) 3, p.getQuant(), 0.001);
	}

	@Test(expected=IllegalArgumentException.class)
	public void testarQuantidadeNegativa() {
		Produto p = new Produto("Charque", 3, (float) 3.1);
		p.setQuant(-3);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testarValoresCaractere() {
		Produto p = new Produto("Charque", 3, (float) 3.1);
	}
	
	@Test
	public void testarRemocaoProduto() {
		Produto p = new Produto("Charque", 3, (float) 20.5);
		
		Loja l = new Loja();
		l.addProduto(p);
		l.RemoveProduto("Charque");
		assertEquals(false , l.Busca("Charque"));
	}
	
	@Test
	public void testarBuscaProduto() {
		Produto p = new Produto("Sabão", 2, (float) 0.32);
		
		Loja l = new Loja();
		l.addProduto(p);
		
		assertEquals(true, l.Busca("Sabão"));
	}
	
	@Test
	public void testarAddProduto() {
		Produto  p = new Produto("Vinho", 1, (float) 2.50 );
		
		Loja l = new Loja();
		l.addProduto(p);
		assertEquals(true, l.Busca("Vinho"));
	}
	
	
	
	
	
}