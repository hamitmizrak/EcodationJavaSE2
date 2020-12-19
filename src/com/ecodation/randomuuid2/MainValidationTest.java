package com.ecodation.randomuuid2;

public class MainValidationTest {

	public static void main(String[] args) {
		RandomUUIDClass benzersizID = new RandomUUIDClass();
		String uuidKelime = benzersizID.uuidMethod();
		System.err.println(uuidKelime);

		benzersizID.dbWrite(uuidKelime);
		benzersizID.telephoneSend(uuidKelime);
		String mail = benzersizID.mailSend(uuidKelime);
		benzersizID.mailOpen(mail);// 29 29 10 =68 32
		boolean sonuc = benzersizID.adminAccess();
		benzersizID.login(sonuc);
	}
}
