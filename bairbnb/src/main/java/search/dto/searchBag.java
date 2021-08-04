package search.dto;

public class searchBag {
	
	private int proid;
	private String pronam;
	private String proadd;
	private String protel;
	private int propic;
	private String proimg;
	
	public int getProid() {
		return proid;
	}
	public void setProid(int proid) {
		this.proid = proid;
	}
	public String getPronam() {
		return pronam;
	}
	public void setPronam(String pronam) {
		this.pronam = pronam;
	}
	public String getProadd() {
		return proadd;
	}
	public void setProadd(String proadd) {
		this.proadd = proadd;
	}
	public String getProtel() {
		return protel;
	}
	public void setProtel(String protel) {
		this.protel = protel;
	}
	public int getPropic() {
		return propic;
	}
	public void setPropic(int propic) {
		this.propic = propic;
	}
	public String getProimg() {
		return proimg;
	}
	public void setProimg(String proimg) {
		this.proimg = proimg;
	}
	
	@Override
	public String toString() {
		return "searchBag [proid=" + proid + ", pronam=" + pronam + ", proadd=" + proadd
				+ ", protel=" + protel + ", propic=" + propic + ", proimg=" + proimg + "]";
	}
	
	
	
	
	
	
}
