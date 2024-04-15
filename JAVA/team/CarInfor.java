package team;

public class CarInfor {

	String Brand;
	   String HyunDai, kia;
	   public String kona;
	   String pali;
	   String santa;

	   String Kia, niro, seltos, sorento;
	   
	   public CarInfor(String kona) {
		      super();
		      this.kona = kona;
		   }

	   public void carInfo() {
//		  this.kia=kia;
//		  this.HyunDai=HyunDai;
	      System.out.println("1. 현대 차량 ");
	      System.out.println("2. 기아 차량 ");
	      
	   }

	   public void carHyunDai() {
//		   this.kona=kona;
//		   this.santa=santa;
//		   this.pali=pali;
	      System.out.println("코나(소형), 산타페(중형), 펠리세이드(대형)");
	   }

	   public void carKia() {
//		   this.niro=niro;
//		   this.seltos=seltos;
//		   this.sorento=sorento;
	      System.out.println("니로(소형), 셀토스(중형), 쏘렌토(대형)");
	   }


}
