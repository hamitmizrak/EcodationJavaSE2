package com.ecodation1.ornekler;

import java.io.Serializable;

public class KemanViolinImplements extends KemanYayliCalgilar implements Serializable, Runnable {
	private static final long serialVersionUID = -8685193751774141778L;

	/*
	 * yay ön panel yan panel arka panel
	 * 
	 * köprü
	 * 
	 * diğer(burgular,teller,kemantutacağı)
	 * 
	 * interface,abstract,thread classları,thread metotu
	 * 
	 */
	private long id44;
	private String threadAdi;
	private String yay;
	private String onPanel;
	private String yanPanel;
	private String arkaPanel;
	private String kopru;
	private String diger;

	public KemanViolinImplements() {
	}

	public KemanViolinImplements(String threadAdi) {
		this.threadAdi = threadAdi;
	}

	public KemanViolinImplements(long id, String yay, String onPanel, String yanPanel, String arkaPanel, String kopru,
			String diger) {
		super();
		this.id44 = id;
		this.yay = yay;
		this.onPanel = onPanel;
		this.yanPanel = yanPanel;
		this.arkaPanel = arkaPanel;
		this.kopru = kopru;
		this.diger = diger;
	}

	@Override
	public void run() {
		System.out.println("keman parcası yapılıyor");
	}

	// Getter and Setter

	public String getYay() {
		return yay;
	}

	@Override
	public long getId() {
		return id44;
	}

	public void setId(long id) {
		this.id44 = id;
	}

	public void setYay(String yay) {
		this.yay = yay;
	}

	public String getOnPanel() {
		return onPanel;
	}

	public void setOnPanel(String onPanel) {
		this.onPanel = onPanel;
	}

	public String getYanPanel() {
		return yanPanel;
	}

	public void setYanPanel(String yanPanel) {
		this.yanPanel = yanPanel;
	}

	public String getArkaPanel() {
		return arkaPanel;
	}

	public void setArkaPanel(String arkaPanel) {
		this.arkaPanel = arkaPanel;
	}

	public String getKopru() {
		return kopru;
	}

	public void setKopru(String kopru) {
		this.kopru = kopru;
	}

	public String getDiger() {
		return diger;
	}

	public void setDiger(String diger) {
		this.diger = diger;
	}

	public String getThreadAdi() {
		return threadAdi;
	}

	public void setThreadAdi(String threadAdi) {
		this.threadAdi = threadAdi;
	}

	@Override
	public String toString() {
		return "Violin [id=" + id44 + ", threadAdi=" + threadAdi + ", yay=" + yay + ", onPanel=" + onPanel
				+ ", yanPanel=" + yanPanel + ", arkaPanel=" + arkaPanel + ", kopru=" + kopru + ", diger=" + diger + "]";
	}

}
