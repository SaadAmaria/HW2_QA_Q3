package Root_classificatin.Root_classificatin;
import static org.junit.Assert.*;

import org.junit.Test;

public class RootsTest 
{
	Roots root;

	@Test
	public void testPartion1() 
	{
		//(0,1,2)
		Roots.calculate_roots(-2, 1, 2);
		
		String  root_expected = Root_Types.ERROR.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	/**
	 * in this test we check the min value a in the BVA 
	 * a=0 -"Not quadratic"
	 */
	
	@Test
	public void aMin() {
		Roots.calculate_roots(0, 5, 3);
		String root_expected = Root_Types.Not_quadratic.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	/**
	 * in this test we check the min + 1 value a in the BVA
	 * sqrt=3**2 - 4*1*77=1-307=-306 
	 * this is No_roots because no minus root
	 */
	@Test
	public void aMinplus1() {
		Roots.calculate_roots(1, 3, 77);
		String root_expected = Root_Types.No_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	/**
	 * in this test we check the nominal value a in the BVA
	 * sqrt=50**2 - 4*50*5 > 0
	 * sqrt > 0 Two roots
	 */
	@Test
	public void aNominal() {
		Roots.calculate_roots(50, 50, 5);
		String root_expected = Root_Types.Two_roots.toString();
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	/**
	 * in this test we check the max-1 value a in the BVA
	 * sqrt=50**2 - 4*99*5 >0
	 * Two roots
	 */
	@Test
	public void aMaxMinus1() {
		Roots.calculate_roots(99, 49, 5);
		String root_expected = Root_Types.Two_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	/**
	 * in this test we check the max value a in the BVA
	 * sqrt=25**2 - 4*100*4<0 
	 * No roots
	 */

	
	@Test
	public void aMax() {
		Roots.calculate_roots(100, 25, 4);
		String root_expected = Root_Types.No_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	}
