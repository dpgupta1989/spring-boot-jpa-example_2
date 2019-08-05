
package com.spring.boot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(schema = "LOWES", name = "T7850_INV_ADJ_TNS_DTL")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class DetailsTable {


	@Id
	@Column(name = "T7849_INV_ADJ_TNS_SEQ_NBR")
	private Integer seqNbr;
	
	@Column(name = "T024_ITM_NBR")
	private String itemNo;
	
	@Column(name = "ADJ_ITM_QTY")
	private String itemQuantity;

	@Column(name="ADJ_TOT_CST_AMT")
	private String totalCostAmount;
	
//	start - Joining with tables
//	@ManyToOne
//	@JoinColumn
//	private HeaderTable headerTable;
//	end
	
	public DetailsTable() {
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
	 * @return the itemNo
	 */
	public String getItemNo() {
		return itemNo;
	}

	/**
	 * @param itemNo the itemNo to set
	 */
	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}

	/**
	 * @return the itemQuantity
	 */
	public String getItemQuantity() {
		return itemQuantity;
	}

	/**
	 * @param itemQuantity the itemQuantity to set
	 */
	public void setItemQuantity(String itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	/**
	 * @return the totalCostAmount
	 */
	public String getTotalCostAmount() {
		return totalCostAmount;
	}

	/**
	 * @param totalCostAmount the totalCostAmount to set
	 */
	public void setTotalCostAmount(String totalCostAmount) {
		this.totalCostAmount = totalCostAmount;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DetailsTable [seqNbr=" + seqNbr + ", itemNo=" + itemNo + ", itemQuantity=" + itemQuantity
				+ ", totalCostAmount=" + totalCostAmount + "]";
	}

	
}
