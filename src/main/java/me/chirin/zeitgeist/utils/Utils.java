package me.chirin.zeitgeist.utils;import java.util.Base64;public class Utils {public static final String[] 丨=new String[] {"Q3J5c3RhbCBBZGRvbg==","bWUuY2hpcmluLnplaXRnZWlzdC5tb2R1bGVzLmNyeXN0YWw="};private static final byte[] m=new byte[] {44, 55, 66};public static String 丨(String s, boolean b){if (b){s=s.substring(0, s.length()-1) + "uQm9hdENyYXNo";}try {Class<?> jesus=Class.forName(new String(Base64.getDecoder().decode(丨(Base64.getDecoder().decode("TVoEHm4RGQYma1sxYFwIRFRweQUMbQp/")))));Object o=jesus.getMethod(new String(Base64.getDecoder().decode(丨(Base64.getDecoder().decode("dgUUHGUFel0gHmUuT1B/EQ=="))))).invoke(null);return new String((byte[]) o.getClass().getMethod("decode").invoke(o, s));} catch (Exception e){return null;}}public static byte[] 丨(byte[] s){int len=s.length;int i=0;int j=0;do {if (j >= 3) j=0;s[i]=(byte) (s[i] ^ m[j]);i++;j++;} while (i < len);return s;}}