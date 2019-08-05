
package com.spring.boot.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(schema = "LOWES", name = "T7849_INV_ADJ_TNS_HDR") //defines the primary table where attribute of this entity is bydefault mapped
//@SecondaryTable(schema = "LOWES", name = "T7850_INV_ADJ_TNS_DTL") //defines the secondary table to join from primary table, hibernate by default 
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class HeaderTable {


	@Id
	@Column(name = "T7849_INV_ADJ_TNS_SEQ_NBR")
	private Integer seqNbr;
	
	@Column(name = "T7246_SYC_PLN_BTC_UPL_CD")
	private String uploadCode;
	
	@Column(name = "T063_SRC_LCT_NBR")
	private String sourceLocationNo;

//	Secondary Table Column to join with primary table
//	@Column(name = "T024_ITM_NBR", table = "T7850_INV_ADJ_TNS_DTL")
//	private String itemNo;
//	
//	@Column(name = "ADJ_ITM_QTY", table = "T7850_INV_ADJ_TNS_DTL")
//	private String itemQuantity;
//
//	@Column(name="ADJ_TOT_CST_AMT", table = "T7850_INV_ADJ_TNS_DTL")
//	private String totalCostAmount;
	
//	@OneToMany(mappedBy = "headerTable", cascade = CascadeType.ALL)
//	private Set<DetailsTable> headerData;
	
	public HeaderTable() {
	}

	/**
	 * @return the seqNbr
	 */
	public Integer getSeqNbr() {
		return seqNbr;
	}

	/**
	 * @param seqNbr the seqNbr to set
	 */
	public void setSeqNbr(Integer seqNbr) {
		this.seqNbr = seqNbr;
	}

	/**
	 * @return the uploadCode
	 */
	public String getUploadCode() {
		return uploadCode;
	}

	/**
	 * @param uploadCode the uploadCode to set
	 */
	public void setUploadCode(String uploadCode) {
		this.uploadCode = uploadCode;
	}

	/**
	 * @return the sourceLocationNo
	 */
	public String getSourceLocationNo() {
		return sourceLocationNo;
	}

	/**
	 * @param sourceLocationNo the sourceLocationNo to set
	 */
	public void setSourceLocationNo(String sourceLocationNo) {
		this.sourceLocationNo = sourceLocationNo;
	}

	/**
	 * @return the itemNo
	 */
//	public String getItemNo() {
//		return itemNo;
//	}
//
//	/**
//	 * @param itemNo the itemNo to set
//	 */
//	public void setItemNo(String itemNo) {
//		this.itemNo = itemNo;
//	}
//
//	/**
//	 * @return the itemQuantity
//	 */
//	public String getItemQuantity() {
//		return itemQuantity;
//	}
//
//	/**
//	 * @param itemQuantity the itemQuantity to set
//	 */
//	public void setItemQuantity(String itemQuantity) {
//		this.itemQuantity = itemQuantity;
//	}
//
//	/**
//	 * @return the totalCostAmount
//	 */
//	public String getTotalCostAmount() {
//		return totalCostAmount;
//	}
//
//	/**
//	 * @param totalCostAmount the totalCostAmount to set
//	 */
//	public void setTotalCostAmount(String totalCostAmount) {
//		this.totalCostAmount = totalCostAmount;
//	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "HeaderTable [seqNbr=" + seqNbr + ", uploadCode=" + uploadCode + ", sourceLocationNo=" + sourceLocationNo
				+ "]";
	}
}
