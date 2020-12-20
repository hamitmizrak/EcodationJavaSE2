package com.ecodation.abstactx;

public class FosforluKalem extends Kalem implements IKalemBoyasi {
	private static final long serialVersionUID = -1257120018971180774L;

	@Override
	public void getKalemRengi() {
		String[] renkler = { "maviyyy", "kirmiziiii" };
		System.out.println("Fosforlu kalem rengi:" + renkler[0]);
	}

	@Override
	public void kalemBoyaMarkasi() {
		// TODO Auto-generated method stub

	}

	@Override
	public void kalemGarantisi(String param) {
		// TODO Auto-generated method stub

	}

}
