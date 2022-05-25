import static org.junit.Assert.*;

import org.junit.Test;

public class IdentifierTestCase {

	@Test
	 public void validate01() {
	 Identifier id = new Identifier();
	 boolean obtido;
	 obtido = id.validateIdentifier("a1");
	 assertEquals(true, obtido);
	 }

	@Test
	 public void validate02() {
	 Identifier id = new Identifier();
	 boolean obtido;
	 obtido = id.validateIdentifier("");
	 assertEquals(false, obtido);
	 }
	
	 @Test
	 public void validate03() {
	 Identifier id = new Identifier();
	 boolean obtido;
	 obtido = id.validateIdentifier("A1b2C3d");
	 assertEquals(false, obtido);
	 }
	 
	 @Test
	  public void validate04() {
	  Identifier id = new Identifier();
	  boolean obtido;
	  obtido = id.validateIdentifier("3IE");
	  assertEquals(false, obtido);
	  }
	 
	  @Test
	  public void validate05() {
	  Identifier id = new Identifier();
	  boolean obtido;
	  obtido = id.validateIdentifier("G#25");
	  assertEquals(false, obtido);
	  }

	  @Test
	  public void validate06() {
	  Identifier id = new Identifier();
	  boolean obtido;
	  obtido = id.validateIdentifier("g");
	  assertEquals(true, obtido);
	  }
	    
	  @Test
	  public void validate07() {
	  Identifier id = new Identifier();
	  boolean obtido;
	  obtido = id.validateIdentifier("BBBBBB");
	  assertEquals(true, obtido);
	  }
	  
	  @Test
	  public void validate8() {
	  Identifier id = new Identifier();
	  boolean obtido;
	  obtido = id.validateIdentifier("bbbbb");
	  assertEquals(true, obtido);
	  }
	  
	  @Test
	  public void validate09() {
	  Identifier id = new Identifier();
	  boolean obtido;
	  obtido = id.validateIdentifier("ZZZZZ");
	  assertEquals(true, obtido);
	  }
	  
	  @Test
	  public void validate10() {
	  Identifier id = new Identifier();
	  boolean obtido;
	  obtido = id.validateIdentifier("zzzzz");
	  assertEquals(true, obtido);
	  }
	  
	  @Test
	  public void validate11() {
	  Identifier id = new Identifier();
	  boolean obtido;
	  obtido = id.validateIdentifier("aaaaa");
	  assertEquals(true, obtido);
	  }
	  
	  @Test
	  public void validate12() {
	  Identifier id = new Identifier();
	  boolean obtido;
	  obtido = id.validateIdentifier("AAAAA");
	  assertEquals(true, obtido);
	  }

	  @Test
	  public void validate13() {
	  Identifier id = new Identifier();
	  boolean obtido;
	  obtido = id.validateIdentifier("A0000");
	  assertEquals(true, obtido);
	  }
	  
	  @Test
	  public void validate14() {
	  Identifier id = new Identifier();
	  boolean obtido;
	  obtido = id.validateIdentifier("A1111");
	  assertEquals(true, obtido);
	  }

	  @Test
	  public void validate15() {
	  Identifier id = new Identifier();
	  boolean obtido;
	  obtido = id.validateIdentifier("A9999");
	  assertEquals(true, obtido);
	  }
	  

	  @Test
	  public void validate16() {
	  Identifier id = new Identifier();
	  boolean obtido;
	  obtido = id.validateIdentifier("A8888");
	  assertEquals(true, obtido);
	  }
	  
	  @Test
	  public void validate17() {
	  Identifier id = new Identifier();
	  boolean obtido;
	  obtido = id.validateIdentifier("{der12");
	  assertEquals(false, obtido);
	  }
	  
	  @Test
	  public void validate18() {
	  Identifier id = new Identifier();
	  boolean obtido;
	  obtido = id.validateIdentifier("A");
	  assertEquals(true, obtido);
	  }
	  
	  @Test
	  public void validate19() {
	  Identifier id = new Identifier();
	  boolean obtido;
	  obtido = id.validateIdentifier("A2");
	  assertEquals(true, obtido);
	  }
	  
	  @Test
	  public void validate20() {
	  Identifier id = new Identifier();
	  boolean obtido;
	  obtido = id.validateIdentifier("A2345");
	  assertEquals(true, obtido);
	  }
	  
	  @Test
	  public void validate21() {
	  Identifier id = new Identifier();
	  boolean obtido;
	  obtido = id.validateIdentifier("A23456");
	  assertEquals(true, obtido);
	  }
	  
	  @Test
	  public void validate22() {
	  Identifier id = new Identifier();
	  boolean obtido;
	  obtido = id.validateIdentifier("A234567");
	  assertEquals(false, obtido);
	  }
	  
	  @Test
	  public void validate23() {
	  Identifier id = new Identifier();
	  boolean obtido;
	  obtido = id.validateIdentifier("ab{cd");
	  assertEquals(false, obtido);
	  }
	  
	  
}
