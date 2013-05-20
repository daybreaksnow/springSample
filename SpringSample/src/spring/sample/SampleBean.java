package spring.sample;

import java.math.BigDecimal;
import java.util.List;

public class SampleBean {
	private String sampleString;
	private Long sampleLong;
	private BigDecimal sampleBigDecimal;
	private BigDecimal sampleBigDecimalNew;
	private List<String> sampleStringList;
	private SampleSubBean sampleSubBean;
	private SampleSubBean sampleSubBeanShare;
	public String getSampleString() {
		return sampleString;
	}
	public void setSampleString(String sampleString) {
		this.sampleString = sampleString;
	}
	public Long getSampleLong() {
		return sampleLong;
	}
	public void setSampleLong(Long sampleLong) {
		this.sampleLong = sampleLong;
	}
	public BigDecimal getSampleBigDecimal() {
		return sampleBigDecimal;
	}
	public void setSampleBigDecimal(BigDecimal sampleBigDecimal) {
		this.sampleBigDecimal = sampleBigDecimal;
	}
	public BigDecimal getSampleBigDecimalNew() {
		return sampleBigDecimalNew;
	}
	public void setSampleBigDecimalNew(BigDecimal sampleBigDecimalNew) {
		this.sampleBigDecimalNew = sampleBigDecimalNew;
	}
	public List<String> getSampleStringList() {
		return sampleStringList;
	}
	public void setSampleStringList(List<String> sampleStringList) {
		this.sampleStringList = sampleStringList;
	}
	public SampleSubBean getSampleSubBean() {
		return sampleSubBean;
	}
	public void setSampleSubBean(SampleSubBean sampleSubBean) {
		this.sampleSubBean = sampleSubBean;
	}
	public SampleSubBean getSampleSubBeanShare() {
		return sampleSubBeanShare;
	}
	public void setSampleSubBeanShare(SampleSubBean sampleSubBeanShare) {
		this.sampleSubBeanShare = sampleSubBeanShare;
	}
	@Override
	public String toString() {
		return "SampleBean [sampleString=" + sampleString + ", sampleLong="
				+ sampleLong + ", sampleBigDecimal=" + sampleBigDecimal
				+ ", sampleBigDecimalNew=" + sampleBigDecimalNew
				+ ", sampleStringList=" + sampleStringList + ", sampleSubBean="
				+ sampleSubBean + ", sampleSubBeanShare=" + sampleSubBeanShare
				+ "]";
	}



}
