package tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import tools.Validator; //import tools.Validator.*; and no Validator. in ways down

public class ValidatorTest {
    @Test
    public void testCheckCreditCard() {
        assertTrue(Validator.checkCreditCard("12345678"));
		assertTrue(Validator.checkCreditCard("1234567890"));
		assertTrue(Validator.checkCreditCard("1234567890987654"));
		assertFalse(Validator.checkCreditCard("1234567"));
		assertFalse(Validator.checkCreditCard("12345678909876543"));
		assertFalse(Validator.checkCreditCard("123456789a987654"));
    }

    @Test
    public void testCheckDateFormatEU() {
        assertTrue(Validator.checkDateFormatEU("12.12.9999"));
        assertTrue(Validator.checkDateFormatEU("01.01.0000"));
        assertFalse(Validator.checkDateFormatEU("00.12.9999"));
        assertFalse(Validator.checkDateFormatEU("01.00.9999"));
        assertFalse(Validator.checkDateFormatEU("01.13.9999"));
        assertFalse(Validator.checkDateFormatEU("32.12.9999"));
        assertFalse(Validator.checkDateFormatEU("01.12.99991"));
        assertFalse(Validator.checkDateFormatEU("00-12-9999"));
    }

    @Test
    public void testCheckDateFormatUS() {
        assertTrue(Validator.checkDateFormatUS("9999-12-12"));
        assertTrue(Validator.checkDateFormatUS("0000-01-01"));
        assertFalse(Validator.checkDateFormatUS("9999-12-00"));
        assertFalse(Validator.checkDateFormatUS("9999-00-01"));
        assertFalse(Validator.checkDateFormatUS("9999-13-01"));
        assertFalse(Validator.checkDateFormatUS("9999-12-32"));
        assertFalse(Validator.checkDateFormatUS("99991-12-00"));
        assertFalse(Validator.checkDateFormatUS("9999.12.00"));
    }

    @Test
    public void testCheckLessEquals255() {
        assertTrue(Validator.checkLessEquals255("0"));
        assertTrue(Validator.checkLessEquals255("9"));
        assertTrue(Validator.checkLessEquals255("10"));
        assertTrue(Validator.checkLessEquals255("99"));
        assertTrue(Validator.checkLessEquals255("100"));
        assertTrue(Validator.checkLessEquals255("199"));
        assertTrue(Validator.checkLessEquals255("200"));
        assertTrue(Validator.checkLessEquals255("255"));
        assertFalse(Validator.checkLessEquals255("-1"));
        assertFalse(Validator.checkLessEquals255("256"));
    }

    @Test
    public void testCheckPhoneNumber() {
        assertTrue(Validator.checkPhoneNumber("+99(99)9999-9999"));
        assertTrue(Validator.checkPhoneNumber("+00(00)0000-0000"));
        assertFalse(Validator.checkPhoneNumber("99(99)9999-9999"));
        assertFalse(Validator.checkPhoneNumber("+9999)9999-9999"));
        assertFalse(Validator.checkPhoneNumber("+99(999999-9999"));
        assertFalse(Validator.checkPhoneNumber("+99(99)99999999"));
        assertFalse(Validator.checkPhoneNumber("+99(99)9999-99991"));
        
        
    }
}
