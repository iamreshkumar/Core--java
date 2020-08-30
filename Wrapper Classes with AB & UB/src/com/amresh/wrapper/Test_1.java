
//  Performing all 6 conversion

package com.amresh.wrapper;

public class Test_1 {

	public static void main(String[] args) {
		
		//  PDT--> WCO  conversion
				
					int i=50;
					Integer io1=new Integer(i);
				//	Integer io2=new Integer.valueOf(i);
					
					System.out.println("i:"+i);
					System.out.println("io1:"+io1);
					
				//	Byte b1=  new Byte(50);
					Byte b1=  new  Byte((byte) 50); 
					
					Character ch1=new Character('a');
				//	Character ch2=new Character(97);
					Character ch3=new Character((char)97);
					
					Boolean bo= new Boolean (true);
					
					Float  f1  = new  Float(70);
					Float  f2	=new Float(42.2f);
					Float  f3=	new Float(50.45);
					
					Double d1	= new Double(64.25);
					Double d2	=new Double(97);
					Double d3	=new Double('a');
					
					System.out.println(b1);
					System.out.println(ch1);
					System.out.println(ch3);
					System.out.println(f1);
					System.out.println(f2);
					System.out.println(f3);
					System.out.println(d1);
					System.out.println(d2);
					System.out.println(d3);
					
					
					
		// WCO-----> PDT conversion
					Integer io3	=Integer.valueOf(254);
					int 	x	=io3.intValue();
					byte 	b	=io3.byteValue();
					short	s	=io3.shortValue();
					float	f	=io3.floatValue();
					
					System.out.println("x:"+x);
					System.out.println("b:"+b);
					System.out.println("s:"+s);
					System.out.println("f:"+f);
					
					
				//	char ch4	= io3.charValue();
				//	char ch5	=io3.intValue();
					char ch6	=(char)io3.intValue();
					System.out.println(ch6);
					
					
		// PSO------> WCO conversion
					Integer	io4	=new Integer("10");
					Integer io5	=new Integer("1");
					
					Byte 	bo1	=Byte.valueOf("1");
				//	Byte	bo2	=Byte.valueOf("128");
					
				//	Integer	io6=Integer.valueOf("a");
				//	Integer	io7= new Integer("5.4");
				//	Integer io8= new Integer("5L");
					
				//	Long lo1	=new Long("5L");
					
					System.out.println("io4:"+io4);
					System.out.println("io5:"+io5);
					System.out.println("bo1:"+bo1);
				//	System.out.println("bo2:"+bo2);
				//	System.out.println("io6:"+io6);
				//	System.out.println("io7:"+io7);
				//	System.out.println("io8:"+io8);
					
					
					Float fo1	= new Float("5");
				//	Float fo2	=new Float("5L");
					Float fo3	=new Float("5.4");
					Float fo4	=new Float("45.4f");
					Float fo5	=new Float("5.4D");
				//	Float fo6	=new Float("a");
				//	Character ch =new Character("a");
					
					
					System.out.println("fo1:"+fo1);
				//	System.out.println("fo2:"+fo2);
					System.out.println("fo3:"+fo3);
					System.out.println("fo4:"+fo4);
					System.out.println("fo5:"+fo5);
				//	System.out.println("fo6:"+fo6);
					
					
		// boolean String object-----> Boolean WCO
					
					Boolean bo5 =new Boolean("false");
					Boolean bo6	=new Boolean("true");
					
					Boolean bo7=Boolean.valueOf("false");
					Boolean bo8=Boolean.valueOf("true");
					
					Boolean bo9=Boolean.valueOf("True");
					Boolean bo10=Boolean.valueOf("TrUe");
					Boolean bo11=Boolean.valueOf("FaLsE");
					
					Boolean bo12=Boolean.valueOf("FALSE");
					Boolean bo13=Boolean.valueOf("TRUE");
					Boolean bo14=Boolean.valueOf("Amresh");
					Boolean bo15=Boolean.valueOf("");
					
					Boolean bo16=Boolean.valueOf(null);
				
					
					System.out.println("bo5:"+bo5);
					System.out.println("bo6:"+bo6);
					System.out.println("bo7:"+bo7);
					System.out.println("bo8:"+bo8);
					System.out.println("bo9:"+bo9);
					System.out.println("bo10:"+bo10);
					System.out.println("bo11:"+bo11);
					System.out.println("bo12:"+bo12);
					System.out.println("bo13:"+bo13);
					System.out.println("bo14:"+bo14);
					System.out.println("bo15:"+bo15);
					System.out.println("bo16:"+bo16);
					
					
		//PSO---->PDT conversion
					
					int i1 = Integer.parseInt("10");
					
				//	byte b11=Byte.parseByte("40");
					byte b12=Byte.parseByte("40");
				//	byte b13=Byte.parseByte("128");
					
					float f11=Float.parseFloat("10");
					float f12=Float.parseFloat("50.456");
				//	float f13=Float.parseFloat("606,678F");
					
		
		//WCO------>String object conversion
					Integer io =new Integer(299);
					String st1 =io.toString();
					
					System.out.println(io);
					System.out.println(st1);
					
		// PDT-------->  PSO
					
				//	String st2  =10;
					String st3	="10";
					String st4	=Integer.toString(10);
					
				//	String st5	=Byte.toString(10);
					String st6=Byte.toString((byte) 10);
					
					String st7	=Integer.toString('a');
				//	String st8	=Integer.toString("a");
				//	String st9	=Integer.toString(10.45);
					
					String st10	=Float.toString(20);
					String st11	=Float.toString(30L);
					String st12	=Float.toString(40.4f);
					String st13 =Float.toString(50.0f);
				//	String st14 =Float.toString(60.0);
					
					String st15 =Boolean.toString(false);
					String st16	=Boolean.toString(true);
				//	String st17	=Boolean.toString(TRUE);
						
					
				//	System.out.println("st2:"+st2);
					System.out.println("st3:"+st3);
					System.out.println("st4:"+st4);
				//	System.out.println("st5:"+st5);
					System.out.println("st6:"+st6);
					System.out.println("st7:"+st7);
				//	System.out.println("st8:"+st8);
				//	System.out.println("st9:"+st9);
					System.out.println("st10:"+st10);
					System.out.println("st11:"+st11);
					System.out.println("st12:"+st12);
					System.out.println("st13:"+st13);
				//	System.out.println("st14:"+st14);
					System.out.println("st15:"+st15);
					System.out.println("st16:"+st16);
					
					
		
	}
}
