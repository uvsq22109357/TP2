package fr.uvsq.cprog.mvnjunit;

import org.junit.Test;

import static org.junit.Assert.*;

public class FractionTest
{

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void TestTostring(){
        assertEquals("0/1",new Fraction().ToString());
    }
    @Test
    public void TestOneArgs(){
        assertEquals(59,new Fraction(59).getNum());
        assertEquals(1,new Fraction(59).getDenum());
    }

    @Test
    public void TestTwoArgs(){
        Fraction f=new Fraction(59,26);
        assertEquals(59,f.getNum());
        assertEquals(26,f.getDenum());

    }

    @Test
    public void TestDouble(){
        assertEquals(59/13,new Fraction(59,13).ToDouble(), 0.00003);
    }
    @Test
    public void TestNotNulldenominator(){

        Fraction f3=new Fraction();
        Fraction f2=new Fraction(57);
        Fraction f1=new Fraction(19,26);

        assertNotEquals(0,f1.getDenum());
        assertNotNull(f2.getDenum());
        assertNotNull(f3.getDenum());
    }
    @Test
    public void TestAreEquals(){
    Fraction f1=new Fraction(210,70);
    Fraction f2=new Fraction(21,7);
    assertEquals(f1.ToString(),f2.ToString());
    }

    @Test
    public void TestAreEquals(Fraction f1, Fraction f2){
        // Fraction f1=new Fraction(210,70);
        //  Fraction f2=new Fraction(21,7);
        assertEquals(f1.ToString(),f2.ToString());
    }
