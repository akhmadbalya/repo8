package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import model.Employee;
import model.Student;

public class InheritanceMain {
	
	public static void main (String[] args) throws ParseException {
		Student s = new Student();
		s.setNim ("12101011");
		s.setNama ("dadang iswanto");
		s.setAlamat ("Jl. Asem Jajar No.2");
		s.setTglLahir (new SimpleDateFormat("dd-mm-yyyy").parse ("13-06-1986"));
		s.setNoHP ("081122334455");
		
		Employee e = new Employee();
		e.setNip("21100989");
		e.setNama("adi sulistyono");
		e.setAlamat("Jl. taman bunga no 2");
		e.setTglLahir(new SimpleDateFormat("dd-mm-yyyy").parse ("13-06-1990"));
		e.setNoHP ("08521393657");
		showData(s);
		System.out.println ("\n=============================================\n");
		showData (e);
		}
		
		static void showData (Student s) {
		System.out.println ("Class Student");
		System.out.println ("NIM :" + s.getNim());
		System.out.println ("Nama : " + s.getNama());
		System.out.println ("Alamat : " + s.getAlamat());
		System.out.println ("Tgl Lahir :" + new SimpleDateFormat("dd mmm yyy").format (s.getTglLahir()));
		System.out.println ("No HP : " + s.getNoHP());
		}
		static void showData (Employee e) {
		System.out.println("Class Employee");
		System.out.println("NIP :" + e.getNip());
		System.out.println ("Nama : " + e.getNama());
		System.out.println ("Alamat : " + e.getAlamat());
		System.out.println ("Tgl Lahir :" + new SimpleDateFormat("dd mmm yyy").format (e.getTglLahir()));
		System.out.println ("No HP : " + e.getNoHP());
		}}