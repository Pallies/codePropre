package ex4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class PretTest {
	private static final double TEST_DE_PRECISION = 0.000_000_001;

	@Test(expected = PretSansCapitalException.class)
	public void testExceptionCapitalZero() throws PretSansCapitalException {
		new Pret(0, 0);
	}

	@Test(expected = PretSansCapitalException.class)
	public void testExceptionCapitalNegatif() throws PretSansCapitalException {
		new Pret(-5000, 0);
	}

	@Test(expected = PretSansCapitalException.class)
	public void testExceptionTauxNegatif() throws PretSansCapitalException {
		new Pret(5000, -3.7);
	}

	@Test(expected = PretDateFinException.class)
	public void PretExceptionDateEnd() throws PretDateFinException, PretSansCapitalException {
		new Pret(5000, 5, new Date());
	}

	@Test(expected = PretDateFinException.class)
	public void PretExceptionResteDuDateEnd() throws PretSansCapitalException, PretDateFinException {
		new Pret(5000, 5, new Date(), 560036);
	}

	@Test
	public void PretStrategy() throws PretSansCapitalException {
		Pret pret = new Pret(5000, 5);
		assertEquals(new PretATerme(), pret.getStrategy());
		assertEquals(5000, pret.getCapital(), TEST_DE_PRECISION);
		assertEquals(5, pret.getTaux(), TEST_DE_PRECISION);
		assertEquals(new Date(), pret.getDateDebut());
		assertNull(pret.getDateFin());
		assertEquals(0,pret.getCapitalRestantDu(),TEST_DE_PRECISION);
	}

	@Test
	public void PretExceptionResteDu() throws PretSansCapitalException, PretDateFinException, ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = sdf.parse("20/07/2030");
		Pret pret = new Pret(5000, 5, date, 560036);
		assertEquals(new PretATerme(), pret.getStrategy());
		assertEquals(5000, pret.getCapital(), TEST_DE_PRECISION);
		assertEquals(5, pret.getTaux(), TEST_DE_PRECISION);
		assertEquals(new Date(), pret.getDateDebut());
		assertEquals(date, pret.getDateFin());
		assertEquals(560036, pret.getCapitalRestantDu(), TEST_DE_PRECISION);
	}

	@Test
	public void PretWithDateStart() throws PretSansCapitalException, PretDateFinException, ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = sdf.parse("20/07/2030");
		Pret pret = new Pret(5000, 5, date);
		assertEquals(new PretATerme(), pret.getStrategy());
		assertEquals(5000, pret.getCapital(), TEST_DE_PRECISION);
		assertEquals(5, pret.getTaux(), TEST_DE_PRECISION);
		assertEquals(new Date(), pret.getDateDebut());
		assertEquals(date, pret.getDateFin());
		assertEquals(0,pret.getCapitalRestantDu(),TEST_DE_PRECISION);
	}

	@Test
	public void PretResteDuTropPercu() throws PretSansCapitalException, PretDateFinException, ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = sdf.parse("20/07/2030");
		Pret pret = new Pret(5000, 5, date, -506);
		assertEquals(new PretATerme(), pret.getStrategy());
		assertEquals(5000, pret.getCapital(), TEST_DE_PRECISION);
		assertEquals(5, pret.getTaux(), TEST_DE_PRECISION);
		assertEquals(new Date(), pret.getDateDebut());
		assertEquals(date, pret.getDateFin());
		assertEquals(-506, pret.getCapitalRestantDu(), TEST_DE_PRECISION);
	}
}
