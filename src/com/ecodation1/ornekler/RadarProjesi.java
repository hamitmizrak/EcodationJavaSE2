package com.ecodation1.ornekler;

public class RadarProjesi {

	public static void main(String[] args) {

		int radarOlcumu = 80;

		if (50 <= radarOlcumu && radarOlcumu <= 69) {
			System.out.println(" hızlısınız yavalayın");
		} else if (70 <= radarOlcumu && radarOlcumu <= 79) {
			System.out.println(" hızlanmayn yavalayın" + " cezanız: " + 180 + " TL");
		} else if (80 <= radarOlcumu && radarOlcumu <= 100) {
			System.out.println(" çok hızlısınız yavalayın" + " cezanız: " + 300 + " TL");
		} else {
			System.out.println("Ehliyetine el konuldu");
		}
	}
}
